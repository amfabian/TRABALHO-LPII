package Model;

//imports
import Util.ArquivoAvaliacao;
import java.util.ArrayList;
import json.JSONArray;
import json.JSONObject;
//imports

public class Avaliacao {
    private String IDBanca;
    private String Matricula;
    private String Nota;

    public Avaliacao() {
    }

    public Avaliacao(String IDBanca, String Matricula, String Nota) {
        this.IDBanca = IDBanca;
        this.Matricula = Matricula;
        this.Nota = Nota;
    }
    
        
    public String getIDBanca() {
        return IDBanca;
    }

    public void setIDBanca(String IDBanca) {
        this.IDBanca = IDBanca;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    public String getNota() {
        return Nota;
    }

    public void setNota(String Nota) {
        this.Nota = Nota;
    }
    
    public Avaliacao(JSONObject json){
        this.IDBanca = json.getString("idbanca");
        this.Matricula = json.getString("matricula");
        this.Nota = json.getString("nota");
    }
    
    public JSONObject toJson(){
        JSONObject json = new JSONObject();
            json.put("idbanca", this.IDBanca);
            json.put("matricula", this.Matricula);
            json.put("nota", this.Nota);
            return json;
    }
    
    public boolean Persistir(boolean editar){
        JSONObject json = this.toJson();
        
        String base = ArquivoAvaliacao.Read();
        JSONArray jA = new JSONArray();
        if(!base.isEmpty() && base.length()>5) 
               jA = new JSONArray(base);
        System.out.println("jA antes da inserção: " + jA); //JSONs no arquivo
        System.out.println("jA tamanho:  " + jA.length());
        for(int i = 0; i <jA.length();i++){
           if(jA.getJSONObject(i).similar(json)) System.out.println("DEU BOM!");
        }
         if (jA.isNull(0)){
           System.out.println("jA VAZIO - PRIMEIRA INSERçAO");
           jA.put(json);
       } else {
           // verifica se o arquivo esta vazio
            System.out.println("GET : " + jA.getJSONObject(0).getInt("idbanca"));
       
            //caso o arquivo nao esteja vazio, procura por matricula repetida e impede a insercao
            boolean achou = false;
            int i = 0;
       
            for(i=0; i <jA.length();i++){
                if(jA.getJSONObject(i).getInt("idbanca") == json.getInt("idbanca")){
                achou = true;
                System.out.println("achou true");
                if(editar){
                   System.out.println("ENTROU NO EDITAR!");
                   jA.put(i, json);
                   ArquivoAvaliacao.Write(jA.toString());
                }
                break;
                } else {achou = false;}}
            
            if(achou){
                return (false ||editar);
                
            } else {
                System.out.println("jA.get : " + jA.getJSONObject(0).getInt("idbanca"));
                System.out.println("json.get: " + json.getInt("idbanca"));
                jA.put(json);
                }   
       }
        System.out.println("jA DEPOIS da inserção: " + jA);
        ArquivoAvaliacao.Write(jA.toString());
       
        return true;
    }
    
    
    public boolean Remover (){
        boolean achou = false;
        int i = 0;
               
        JSONObject json = this.toJson();
        String base = ArquivoAvaliacao.Read();
        JSONArray jA = new JSONArray();
        if(!base.isEmpty() && base.length()>5) jA = new JSONArray(base);
        
        for(i=0; i <jA.length();i++){
                if(jA.getJSONObject(i).getInt("idbanca") == json.getInt("idbanca")){
                    achou = true;
                    break;
                }                    
        }
        if(achou){
            jA.remove(i);
            ArquivoAvaliacao.Write(jA.toString());
        }        
        return achou;
    }
    
    public static ArrayList<Avaliacao> getAvaliacoes(){
        ArrayList<Avaliacao> avaliacoes = new ArrayList();
        String base = ArquivoAvaliacao.Read();
        if(base.isEmpty() || base.length()<5)
            return null;
        
        JSONArray jA = new JSONArray(base);
        for(int i=0;i<jA.length();i++){
            Avaliacao A = new Avaliacao(jA.getJSONObject(i));
            avaliacoes.add(A);
            
        }
        return avaliacoes;
    }
    
}
