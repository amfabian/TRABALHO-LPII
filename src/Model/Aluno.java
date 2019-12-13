package Model;

//imports
import Util.ArquivoAluno;
import java.util.ArrayList;
import json.JSONArray;
import json.JSONObject;
//imports

public class Aluno {
    private String Matricula;
    private String Nome;
    private String Email;
    private String Telefone;

    public Aluno() {
    }

    public Aluno(String Matricula, String Nome, String Email, String Telefone) {
        this.Matricula = Matricula;
        this.Nome = Nome;
        this.Email = Email;
        this.Telefone = Telefone;
        
    }
        
    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
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

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }
    
    public Aluno(JSONObject json) {
        this.Matricula = json.getString("matricula");
        this.Nome = json.getString("nome");
        this.Email = json.getString("email");
        this.Telefone = json.getString("telefone");
    }
    
    public JSONObject toJson(){
        JSONObject json = new JSONObject();
        json.put("matricula",this.Matricula);
        json.put("nome",this.Nome);
        json.put("email", this.Email);
        json.put("telefone", this.Telefone);
        return json;
    }
    
    //Utilizada inserir e editar os itens e armazená-los em arquivo
    public boolean Persistir(boolean editar_aluno){
        JSONObject json = this.toJson();
        String base = ArquivoAluno.Read();
        JSONArray jA = new JSONArray();

        // verifica se o arquivo esta vazio
        if(!base.isEmpty() && base.length()>5) 
            jA = new JSONArray(base);
       // verifica se o JSON esta vazio
       if (jA.isNull(0)){
           jA.put(json);
       }else {
       //caso o arquivo nao esteja vazio, 
       //procura pela id repetida e impede a insercao caso o usuario nao tenha clicado no botao editar
            boolean achou = false;
            int i = 0;
            for(i=0; i <jA.length();i++){
                if(jA.getJSONObject(i).getString("matricula").equals(json.getString("matricula"))){
                    achou = true;
                    if(editar_aluno){
                        jA.put(i, json);
                        ArquivoAluno.Write(jA.toString());
                    }   
                break;
                } else {achou = false;}
            }
            
            if(achou){
                return (false ||editar_aluno);
                
            }   else {
                jA.put(json);
            }
        }
        //escreve no arquivo
        ArquivoAluno.Write(jA.toString());
        //retorna true caso tenha conseguido inserir/editar
        return true;
    }
    //Utilizada para Remover item do arquivo
    public boolean Remover (){
        boolean achou = false;
        int i = 0;
        JSONObject json = this.toJson();
        String base = ArquivoAluno.Read();
        JSONArray jA = new JSONArray();
        //Verifica se não está vazio.
        if(!base.isEmpty() && base.length()>5) jA = new JSONArray(base);
        //Caso não esteja vazio, procura pela id que será removida.
        for(i=0; i <jA.length();i++){
                if(jA.getJSONObject(i).getInt("matricula") == json.getInt("matricula")){
                    achou = true;
                    break;
                } 
        }
        //caso ache, remove o item.
        if(achou){
            jA.remove(i);
            ArquivoAluno.Write(jA.toString());
        }
        return achou;
    }
       
    public static ArrayList<Aluno> getAlunos(){
        ArrayList<Aluno> alunos = new ArrayList();
        String base = ArquivoAluno.Read();
        if(base.isEmpty() || base.length()<5)
            return null;
        
        JSONArray jA = new JSONArray(base);
        for(int i=0;i<jA.length();i++){
            Aluno A = new Aluno(jA.getJSONObject(i));
            alunos.add(A);
        }
        return alunos;
    }
}