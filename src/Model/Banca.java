package Model;

//imports
import Util.ArquivoBanca;
import java.util.ArrayList;
import json.JSONArray;
import json.JSONObject;
//imports

public class Banca {
    private String Av1;
    private String Av2;
    private String Orientador;
    private String IDBanca;
    
    public Banca() {
        
    }
    
    public Banca(String Av1, String Av2, String Orientador, String IDBanca) {
        this.Av1 = Av1;
        this.Av2 = Av2;
        this.Orientador = Orientador;
        this.IDBanca = IDBanca;
    }

    public String getAv1() {
        return Av1;
    }

    public void setAv1(String Av1) {
        this.Av1 = Av1;
    }

    public String getAv2() {
        return Av2;
    }

    public void setAv2(String Av2) {
        this.Av2 = Av2;
    }

    public String getOrientador() {
        return Orientador;
    }

    public void setOrientador(String Orientador) {
        this.Orientador = Orientador;
    }
    
    public String getIDBanca(){
        return IDBanca;
    }
    
    public void setIDBanca(String IDBanca){
        this.IDBanca = IDBanca;
    }
    
    public Banca(JSONObject json){
        this.Av1 = json.getString("av1");
        this.Av2 = json.getString("av2");
        this.Orientador = json.getString("orientador");
        this.IDBanca = json.getString("idbanca");
    }
    
    public JSONObject toJson(){
        JSONObject json = new JSONObject();
            json.put("av1", this.Av1);
            json.put("av2", this.Av2);
            json.put("orientador", this.Orientador);
            json.put("idbanca", this.IDBanca);
            return json;
    }
    //Utilizada inserir e editar os itens e armazená-los em arquivo
    public boolean Persistir(boolean editar){
        JSONObject json = this.toJson();
        String base = ArquivoBanca.Read();
        JSONArray jA = new JSONArray();
        if(!base.isEmpty() && base.length()>5)
            jA = new JSONArray(base);
        // verifica se o arquivo esta vazio
        if (jA.isNull(0)){
           jA.put(json);
       }else {
            //caso o arquivo nao esteja vazio, 
            //procura pela id repetida e impede a insercao caso o usuario nao tenha clicado no botao editar
            boolean achou = false;
            int i = 0;
            for(i=0; i <jA.length();i++){
                if(jA.getJSONObject(i).getString("idbanca").equals(json.getString("idbanca"))){
                    achou = true;
                    if(editar){
                        jA.put(i, json);
                        ArquivoBanca.Write(jA.toString());
                    }
                break;
                } else {achou = false;}
            }
            if(achou){
                return (false||editar);
            }   else {
                    jA.put(json);
                }   
        }
        //escreve no arquivo
         ArquivoBanca.Write(jA.toString());
        //retorna true caso tenha conseguido inserir/editar
        return true;
    }
    //Utilizada para Remover item do arquivo
    public boolean Remover (){
        boolean achou = false;
        int i = 0;
        JSONObject json = this.toJson();
        String base = ArquivoBanca.Read();
        JSONArray jA = new JSONArray();
        //Verifica se não está vazio.
        if(!base.isEmpty() && base.length()>5) jA = new JSONArray(base);
        //Caso não esteja vazio, procura pela id que será removida.
        for(i=0; i <jA.length();i++){
                if(jA.getJSONObject(i).getString("idbanca").equals(json.getString("idbanca"))){
                    achou = true;
                    break;
                }                    
        }
        //caso ache, remove o item.
        if(achou){
            jA.remove(i);
            ArquivoBanca.Write(jA.toString());
        }        
        return achou;
    }
    
    
    public static ArrayList<Banca> getBancas(){
        ArrayList<Banca> bancas = new ArrayList();
        String base = ArquivoBanca.Read();
        if(base.isEmpty() || base.length()<5)
            return null;
        
        JSONArray jA = new JSONArray(base);
        for(int i=0;i<jA.length();i++){
            Banca B = new Banca(jA.getJSONObject(i));
            bancas.add(B);
        }
        return bancas;
    }
    
}