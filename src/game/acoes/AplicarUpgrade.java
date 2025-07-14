package game.acoes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import game.upgrades.AuxiliarClique;

public class AplicarUpgrade implements ActionListener {

    private final EventosClique eventosClique;
    private final AuxiliarClique auxiliarClique;

    public AplicarUpgrade(EventosClique eventosClique, AuxiliarClique auxiliarClique) {
        this.eventosClique = eventosClique;
        this.auxiliarClique = auxiliarClique;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (auxiliarClique.podeComprar(eventosClique.getContador())) {
            auxiliarClique.aplicar();
        }
    }
}
