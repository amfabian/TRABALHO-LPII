package Controller;

//imports
import Model.Professor;
import java.util.ArrayList;
//imports

public class ProfessorControl {
    public static boolean SalvarProfessor(String Nome, String Email, String Area, String Sujestao, boolean editar_professor){
        Professor p = new Professor(Nome, Email, Area, Sujestao);
        return p.Persistir(editar_professor);
    }
    public static boolean ExcluirProfessor(String Nome, String Email, String Area, String Sujestao){
    Professor p1 = new Professor(Nome, Email, Area, Sujestao);
    return p1.Remover();
    }
    public static ArrayList<String[]> getProfessores(){
        ArrayList<String[]> Professores = new ArrayList();
        
        ArrayList<Professor> P = Professor.getProfessores();
        if(P!=null){
            for(int i=0;i<P.size();i++){
                String p[] = new String[4];
                p[0] = P.get(i).getNome();
                p[1] = P.get(i).getEmail();
                p[2] = P.get(i).getArea();
                p[3] = P.get(i).getSujestao();
                Professores.add(p);
            }
        }
        
        return Professores;
    }
    
}
