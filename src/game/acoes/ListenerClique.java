package game.acoes;

//Import de bibliotecas usadas
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;

public class ListenerClique{
    //metodo usado para criar um listener de clique
    //Recebe um botão que é criado no main. Como o método recebe um AbstractButton, ele aceita qualquer tipo de botão que herde dessa classe (como JButton, JToggleButton, etc.).
    //O segundo parâmetro recebe uma implementação da interface AcaoAoClicar, que define a ação a ser executada quando o botão for clicado.
    public static void adicionarListenerClique(AbstractButton button, AcaoAoClicar acaoClicar){
        ActionListener listenerClicar = e -> acaoClicar.acaoDeClique();
        button.addActionListener(listenerClicar);
    } 

}
