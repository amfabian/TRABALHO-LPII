package Controller;

//imports
import Model.Aluno;
import java.util.ArrayList;
//imports

public class AlunoControl {
    public static boolean SalvarAluno(String Matricula, String Nome, String Email, String Telefone, boolean editar_aluno){
        Aluno a = new Aluno(Matricula, Nome, Email, Telefone);
        return a.Persistir(editar_aluno);
    }
    
    public static boolean ExcluirAluno(String Matricula, String Nome, String Email, String Telefone){
        Aluno b = new Aluno(Matricula, Nome, Email, Telefone);
        return b.Remover();
    }
    
    public static ArrayList<String[]> getAlunos(){
        ArrayList<String[]> Alunos = new ArrayList();
        
        ArrayList<Aluno> A = Aluno.getAlunos();
        if(A!=null){
            for(int i=0;i<A.size();i++){
                String a[] = new String[4];
                a[0] = A.get(i).getMatricula();
                a[1] = A.get(i).getNome();
                a[2] = A.get(i).getEmail();
                a[3] = A.get(i).getTelefone();
                Alunos.add(a);
            }
        }
        
        return Alunos;
    }
}
