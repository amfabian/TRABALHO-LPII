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
    //Utilizada inserir e editar os itens e armazená-los em arquivo
    public boolean Persistir(boolean editar){
        JSONObject json = this.toJson();
        String base = ArquivoPropostaTC.Read();
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
                if(jA.getJSONObject(i).getString("titulo").equals(json.getString("titulo"))){
                    achou = true;
                    if(editar){
                        jA.put(i, json);
                        ArquivoPropostaTC.Write(jA.toString());
                    }
                    break;
                } 
            else {achou = false;}}
            if(achou){
                return (false||editar);
            }   else {
                    jA.put(json);
                }   
        }
        //escreve no arquivo
        ArquivoPropostaTC.Write(jA.toString());
        //retorna true caso tenha conseguido inserir/editar
        return true;
    }
    //Utilizada para Remover item do arquivo
     public boolean Remover (){
        boolean achou = false;
        int i = 0;
               
        JSONObject json = this.toJson();
        String base = ArquivoPropostaTC.Read();
        JSONArray jA = new JSONArray();
        if(!base.isEmpty() && base.length()>5) jA = new JSONArray(base);
        //Caso não esteja vazio, procura pela id que será removida.
        for(i=0; i <jA.length();i++){
                if(jA.getJSONObject(i).getString("titulo").equals(json.getString("titulo"))){
                    achou = true;
                    break;
                }                    
        }
        //caso ache, remove o item.
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
