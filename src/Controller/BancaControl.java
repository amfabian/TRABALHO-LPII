package Controller;

//imports
import Model.Banca;
import java.util.ArrayList;
//imports

public class BancaControl {
    public static boolean SalvarBanca(String Av1, String Av2, String Orientador, String IDBanca, boolean editar_banca){
        Banca b = new Banca(Av1, Av2, Orientador, IDBanca);
        return b.Persistir(editar_banca);
    }
    
     public static boolean ExcluirBanca(String Av1, String Av2, String Orientador, String IDBanca){
    Banca b1 = new Banca(Av1, Av2, Orientador, IDBanca);
    return b1.Remover();
    }
   
    
    public static ArrayList<String[]> getBancas(){
        ArrayList<String[]> Bancas = new ArrayList();
        
        ArrayList<Banca> B = Banca.getBancas();
        if(B!=null){
            for(int i=0;i<B.size();i++){
                String b[] = new String[4];
                b[0] = B.get(i).getAv1();
                b[1] = B.get(i).getAv2();
                b[2] = B.get(i).getOrientador();
                b[3] = B.get(i).getIDBanca();
                Bancas.add(b);
            }
        }
        
        return Bancas;
    }
    
}
