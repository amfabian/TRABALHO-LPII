package Controller;

//imports
import Model.Avaliacao;
import java.util.ArrayList;
//imports

public class AvaliacaoControl {
    public static boolean SalvarAvaliacao(String IDBanca, String Matricula, String Nota, boolean editar_avaliacao){
        Avaliacao v = new Avaliacao(IDBanca, Matricula, Nota);
        return v.Persistir(editar_avaliacao);
    }
    
    public static boolean ExcluirAvaliacao(String IDBanca, String Matricula, String Nota){
    Avaliacao v1 = new Avaliacao(IDBanca, Matricula, Nota);        
    return v1.Remover();
    }
    
    
    public static ArrayList<String[]> getAvaliacoes(){
        ArrayList<String[]> Avaliacoes = new ArrayList();
        
        ArrayList<Avaliacao> A = Avaliacao.getAvaliacoes();
        if(A!=null){
            for(int i=0;i<A.size();i++){
                String a[] = new String[3];
                a[0] = A.get(i).getIDBanca();
                a[1] = A.get(i).getMatricula();
                a[2] = A.get(i).getNota();
                Avaliacoes.add(a);
            }
        }
        
        return Avaliacoes;
    }
}
