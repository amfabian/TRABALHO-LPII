package Controller;

//imports
import Model.PropostaTC;
import java.util.ArrayList;
//imports

public class PropostaTCControl {
    public static boolean SalvarPropostaTC(String Titulo, String Autor, String Orientador, boolean editar_proposta){
        PropostaTC p = new PropostaTC(Titulo, Autor, Orientador);
        return p.Persistir(editar_proposta);
    }
    public static boolean ExcluirPropostaTC(String Titulo, String Autor, String Orientador){
        PropostaTC p1 = new PropostaTC(Titulo, Autor, Orientador);
        return p1.Remover();
    }
    
    
    public static ArrayList<String[]> getPropostas(){
        ArrayList<String[]> Propostas = new ArrayList();
        
        ArrayList<PropostaTC> P = PropostaTC.getPropostas();
        if(P!=null){
            for(int i=0;i<P.size();i++){
                String p[] = new String[3];
                p[0] = P.get(i).getTitulo();
                p[1] = P.get(i).getAutor();
                p[2] = P.get(i).getOrientador();
                Propostas.add(p);
            }
        }
        
        return Propostas;
    }
    
}
