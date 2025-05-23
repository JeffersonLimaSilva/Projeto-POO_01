import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class BDMineralMetalico{

    private MineralMetalico metalico;
    private List<MineralMetalico> bdMMeta = new ArrayList<MineralMetalico>();

    public List<MineralMetalico> getBdMMeta(){
            return bdMMeta;
    }
    public MineralMetalico cadMMetalico(MineralMetalico metalico){
            if(consMMetalico(metalico)== null){
                bdMMeta.add(metalico);
                return metalico;
            }
            else{
                return null;
            }
    } // fim do cadastro do mineral metalico
    public MineralMetalico consMMetalico(MineralMetalico metalico){
        for(int i=0; i<bdMMeta.size(); i++ ){
            if(metalico.getCodIdentificador()== bdMMeta.get(i).getCodIdentificador()){
                return bdMMeta.get(i);
            }
        }
        return null;
    } // fim do consulta do mineral metalico
    public MineralMetalico remvMMetalico(MineralMetalico metalico){
        MineralMetalico p1 = consMMetalico(metalico);
        if(p1 != null){
            bdMMeta.remove(p1);
            return null;
        }
        else{
            return metalico;
        }
    } //fim do remover
    public MineralMetalico atualMetalico(MineralMetalico metalico){ //Não atualiza o CPF, apenas os demais campos
        for(int i = 0; i < bdMMeta.size(); i++){
            if(metalico.getCodIdentificador()== bdMMeta.get(i).getCodIdentificador()){
                metalico = bdMMeta.get(i);

                String nome = JOptionPane.showInputDialog(
                    null,
                    "Informe o novo NOME",
                    "Atulizar dados",
                    JOptionPane.INFORMATION_MESSAGE
                );
                metalico.setNome(nome);
                bdMMeta.set(i, metalico);  
                return bdMMeta.get(i);
            }
        }
        return null;
    }

}