package Model;

//imports
import Util.ArquivoProfessor;
import java.util.ArrayList;
import json.JSONArray;
import json.JSONObject;
//imports

public class Professor {
    private String Nome;
    private String Email;
    private String Area;
    private String Sujestao;

    public Professor() {
        
    }

    public Professor(String Nome, String Email, String Area, String Sujestao) {
        this.Nome = Nome;
        this.Email = Email;
        this.Area = Area;
        this.Sujestao = Sujestao;
    }
    
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }

    public String getSujestao() {
        return Sujestao;
    }

    public void setSujestao(String Sujestao) {
        this.Sujestao = Sujestao;
    }
    
    public Professor(JSONObject json){
        this.Nome = json.getString("nome");
        this.Email = json.getString("email");
        this.Area = json.getString("area");
        this.Sujestao = json.getString("sujestao");
    }
    
    public JSONObject toJson(){
        JSONObject json = new JSONObject();
            json.put("nome", this.Nome);
            json.put("email", this.Email);
            json.put("area", this.Area);
            json.put("sujestao", this.Sujestao);
            return json;
    }
    
    public boolean Persistir(boolean editar){
        JSONObject json = this.toJson();
        
        String base = ArquivoProfessor.Read();
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
            System.out.println("GET : " + jA.getJSONObject(0).getString("nome"));
       
            //caso o arquivo nao esteja vazio, procura por matricula repetida e impede a insercao
            boolean achou = false;
            
            int i = 0;
       
            for(i=0; i <jA.length();i++){
                if(jA.getJSONObject(i).getString("nome").equals(json.getString("nome")))
               {
                achou = true;
                System.out.println("achou true");
                if(editar){
                   System.out.println("ENTROU NO EDITAR!");
                   jA.put(i, json);
                   ArquivoProfessor.Write(jA.toString());
                }
                break;
               } 
            else {achou = false;}}
            
            if(achou){
                return (false||editar);
                
            } else {
                System.out.println("jA.get : " + jA.getJSONObject(0).getString("nome"));
                System.out.println("json.get: " + json.getString("nome"));
                jA.put(json);
                }   
       }
        System.out.println("jA DEPOIS da inserção: " + jA);
        ArquivoProfessor.Write(jA.toString());
         
        return true;
    }
    
     public boolean Remover (){
        boolean achou = false;
        int i = 0;
               
        JSONObject json = this.toJson();
        String base = ArquivoProfessor.Read();
        JSONArray jA = new JSONArray();
        if(!base.isEmpty() && base.length()>5) jA = new JSONArray(base);
        
        for(i=0; i <jA.length();i++){
                if(jA.getJSONObject(i).getString("nome").equals(json.getString("nome"))){
                    achou = true;
                    break;
                }                    
        }
        if(achou){
            jA.remove(i);
            ArquivoProfessor.Write(jA.toString());
        }        
        return achou;
    }
    
   
    
    
    public static ArrayList<Professor> getProfessores(){
        ArrayList<Professor> professores = new ArrayList();
        String base = ArquivoProfessor.Read();
        if(base.isEmpty() || base.length()<5)
            return null;
        
        JSONArray jA = new JSONArray(base);
        for(int i=0;i<jA.length();i++){
            Professor P = new Professor(jA.getJSONObject(i));
            professores.add(P);
        }
        return professores;
    }
}