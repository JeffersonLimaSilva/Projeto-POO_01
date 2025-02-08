import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class BDMineralPrecioso{

        private MineralPrecioso precioso;
        private List<MineralPrecioso> bdMPrec = new ArrayList<MineralPrecioso>();

        public List<MineralPrecioso> getBdMprec(){
                return bdMPrec;
        }
        public MineralPrecioso cadMPrecioso(MineralPrecioso precioso){
                if(consMPrecioso(precioso)== null){
                        bdMPrec.add(precioso);
                        return precioso;
                }
                else{
                        return null;
                }
        } // fim do cadastro do mineral precioso
        public MineralPrecioso consMPrecioso(MineralPrecioso precioso){
                for(int i=0; i<bdMPrec.size(); i++ ){
                        if(precioso.getNome() == bdMPrec.get(i).getNome()){
                                System.out.println("Nome encontrado");
                                return bdMPrec.get(i);
                        }
                }
                return null;
        } // fim do consulta do mineral precioso
        public MineralPrecioso remvMPrecioso(MineralPrecioso precioso){
                MineralPrecioso p1 = consMPrecioso(precioso);
                if(p1 != null){
                        bdMPrec.remove(p1);
                        return null;
                }
                else{
                        return precioso;
                }
        } //fim do remover
         

}