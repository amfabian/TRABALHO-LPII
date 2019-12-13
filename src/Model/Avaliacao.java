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
    //Utilizada inserir e editar os itens e armazená-los em arquivo
    public boolean Persistir(boolean editar){
        JSONObject json = this.toJson();
        String base = ArquivoAvaliacao.Read();
        JSONArray jA = new JSONArray();
        if(!base.isEmpty() && base.length()>5) 
               jA = new JSONArray(base);
        // verifica se o arquivo esta vazio
        if (jA.isNull(0)){
           jA.put(json);
        } else {
            //caso o arquivo nao esteja vazio, 
            //procura pela id repetida e impede a insercao caso o usuario nao tenha clicado no botao editar
            boolean achou = false;
            int i = 0;
            for(i=0; i <jA.length();i++){
                if(jA.getJSONObject(i).getString("idbanca").equals(json.getString("idbanca"))){
                    achou = true;
                    if(editar){
                        jA.put(i, json);
                        ArquivoAvaliacao.Write(jA.toString());
                    }
                    break;
                }   else {achou = false;}
            }
            if(achou){
                return (false ||editar);
            }   else {
                    jA.put(json);
                }   
       }
        //escreve no arquivo
        ArquivoAvaliacao.Write(jA.toString());
        //retorna true caso tenha conseguido inserir/editar
        return true;
    }
    
    //Utilizada para Remover item do arquivo
    public boolean Remover (){
        boolean achou = false;
        int i = 0;
               
        JSONObject json = this.toJson();
        String base = ArquivoAvaliacao.Read();
        JSONArray jA = new JSONArray();
        //Verifica se não está vazio.
        if(!base.isEmpty() && base.length()>5) jA = new JSONArray(base);
        //Caso não esteja vazio, procura pela id que será removida.
        for(i=0; i <jA.length();i++){
             //  if(jA.getJSONObject(i).getInt("idbanca") == json.getInt("idbanca")){
              if(jA.getJSONObject(i).getString("matricula").equals(json.getString("matricula"))){

                    achou = true;
                    break;
                }                    
        }
        //caso ache, remove o item.
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
