package Model;

//imports
import Util.ArquivoPropostaTC;
import java.util.ArrayList;
import json.JSONArray;
import json.JSONObject;
//imports

public class PropostaTC {
    private String Titulo;
    private String Autor;
    private String Orientador;

    public PropostaTC() {
        
    }

    public PropostaTC(String Titulo, String Autor, String Orientador) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Orientador = Orientador;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getOrientador() {
        return Orientador;
    }

    public void setOrientador(String Orientador) {
        this.Orientador = Orientador;
    }
    
    
    public PropostaTC(JSONObject json){
        this.Titulo = json.getString("titulo");
        this.Autor = json.getString("autor");
        this.Orientador = json.getString("orientador");
    }
    
    public JSONObject toJson(){
        JSONObject json = new JSONObject();
            json.put("titulo", this.Titulo);
            json.put("autor", this.Autor);
            json.put("orientador", this.Orientador);
            return json;
    }
    
    public boolean Persistir(boolean editar){
        JSONObject json = this.toJson();
        
        String base = ArquivoPropostaTC.Read();
        JSONArray jA = new JSONArray();
        if(!base.isEmpty() && base.length()>5)
            jA = new JSONArray(base);
        
        
    System.out.println("jA antes da inserção: " + jA); //JSONs no arquivo
        System.out.println("jA tamanho:  " + jA.length());
        
        if (jA.isNull(0)){
           System.out.println("jA VAZIO - PRIMEIRA INSERçAO");
           jA.put(json);
       }else {
           // verifica se o arquivo esta vazio
            System.out.println("GET : " + jA.getJSONObject(0).getString("titulo"));
       
            //caso o arquivo nao esteja vazio, procura por matricula repetida e impede a insercao
            boolean achou = false;
            
            int i = 0;
       
            for(i=0; i <jA.length();i++){
                if(jA.getJSONObject(i).getString("titulo").equals(json.getString("titulo")))
               {
                achou = true;
                System.out.println("achou true");
                if(editar){
                   System.out.println("ENTROU NO EDITAR!");
                   jA.put(i, json);
                   ArquivoPropostaTC.Write(jA.toString());
                }
                break;
               } 
            else {achou = false;}}
            
            if(achou){
                return (false||editar);
                
            } else {
                System.out.println("jA.get : " + jA.getJSONObject(0).getString("titulo"));
                System.out.println("json.get: " + json.getString("titulo"));
                jA.put(json);
                }   
       }
        System.out.println("jA DEPOIS da inserção: " + jA);
        ArquivoPropostaTC.Write(jA.toString());
        return true;
    }
    
     public boolean Remover (){
        boolean achou = false;
        int i = 0;
               
        JSONObject json = this.toJson();
        String base = ArquivoPropostaTC.Read();
        JSONArray jA = new JSONArray();
        if(!base.isEmpty() && base.length()>5) jA = new JSONArray(base);
        
        for(i=0; i <jA.length();i++){
                if(jA.getJSONObject(i).getString("titulo").equals(json.getString("titulo"))){
                    achou = true;
                    break;
                }                    
        }
        if(achou){
            jA.remove(i);
            ArquivoPropostaTC.Write(jA.toString());
        }        
        return achou;
    }
    
    public static ArrayList<PropostaTC> getPropostas(){
        ArrayList<PropostaTC> propostas = new ArrayList();
        String base = ArquivoPropostaTC.Read();
        if(base.isEmpty() || base.length()<5)
            return null;
        
        JSONArray jA = new JSONArray(base);
        for(int i=0;i<jA.length();i++){
            PropostaTC P = new PropostaTC(jA.getJSONObject(i));
            propostas.add(P);
        }
        return propostas;
    }
}
