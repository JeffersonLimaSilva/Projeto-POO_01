import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class BDMineralNaoMetalico{

        private MineralNaoMetalico n_metalico;
        private List<MineralNaoMetalico> bdMNMeta = new ArrayList<MineralNaoMetalico>();

        public List<MineralNaoMetalico> getBdMNMeta(){
                return bdMNMeta;
        }
        public MineralNaoMetalico cadMNMetalico(MineralNaoMetalico n_metalico){
                if(consMNMetalico(n_metalico)== null){
                        bdMNMeta.add(n_metalico);
                        return n_metalico;
                }
                else{
                        return null;
                }
        } // fim do cadastro do mineral n_metalico
        public MineralNaoMetalico consMNMetalico(MineralNaoMetalico n_metalico){
                for(int i=0; i<bdMNMeta.size(); i++ ){
                        if(n_metalico.getCodIdentificador()== bdMNMeta.get(i).getCodIdentificador()){
                                return bdMNMeta.get(i);
                        }
                }
                return null;
        } // fim do consulta do mineral n_metalico
        public MineralNaoMetalico remvMNMetalico(MineralNaoMetalico n_metalico){
                MineralNaoMetalico m1 = consMNMetalico(n_metalico);
                if(m1 != null){
                        bdMNMeta.remove(m1);
                        return null;
                }
                else{
                        return n_metalico;
                }
        } //fim do remover
        public MineralNaoMetalico atualN_metalico(MineralNaoMetalico n_metalico){ //Não atualiza o CPF, apenas os demais campos
		for(int i = 0; i < bdMNMeta.size(); i++){
			if(n_metalico.getCodIdentificador()== bdMNMeta.get(i).getCodIdentificador()){
                            n_metalico = bdMNMeta.get(i);

                            String nome = JOptionPane.showInputDialog(
                                    null,
                                    "Informe o novo NOME",
                                    "Atulizar dados",
                                    JOptionPane.INFORMATION_MESSAGE
                            );
                            n_metalico.setNome(nome);
                            bdMNMeta.set(i, n_metalico);  
                            return bdMNMeta.get(i);
			}
		}
                return null;
	}

}