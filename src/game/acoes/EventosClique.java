package game.acoes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class EventosClique implements ActionListener {
    long contador = 0;
    long valorClique = 1;
    @SuppressWarnings("unused")
    private final JLabel labelContador;

    public EventosClique(long contador, JLabel labelContador){
        this.contador = contador;
        this.labelContador = labelContador;

    }   

    @Override
    public void actionPerformed(ActionEvent e) {
        contador += valorClique;
        labelContador.setText("Coisinhas: " + contador);
    }
}
