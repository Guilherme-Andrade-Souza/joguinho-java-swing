package game.acoes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class EventosClique implements ActionListener {
    private long contador = 0;
    private int valorClique = 1;
    @SuppressWarnings("unused")
    private final JLabel labelContador;

    public EventosClique(long contador, JLabel labelContador){
        this.contador = contador;
        this.labelContador = labelContador;
    }   

    public long getContador(){return contador; }

    public int getValorClique(){return valorClique; }

    public void setValorClique(int valorClique){
        this.valorClique = valorClique;
    }

    public void setContador(long contador){
        this.contador = contador;
    }

    

    @Override
    public void actionPerformed(ActionEvent e) {
        contador += valorClique;
        labelContador.setText("Coisinhas: " + contador);
    }
}
