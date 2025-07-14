package game;

import java.awt.FlowLayout;
import javax.swing.*;

import game.acoes.AplicarUpgrade;
import game.acoes.EventosClique;
import game.upgrades.*;

public class Jogo {
    public static void main(String[] args) {
        JFrame jframe = new JFrame("T.S.W.M.I.J");
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setSize(500, 500);
        jframe.setLayout(new FlowLayout());

        // Componentes principais
        JButton botaoPrincipal = new JButton("--> CLIQUE AQUI <---");
        JLabel labelContador = new JLabel("Coisinhas: 0 :( ");

        // Eventos de clique
        EventosClique cliquePadrao = new EventosClique(0, labelContador);

        // Upgrade auxiliar
        AuxiliarClique auxiliarClique = new AuxiliarClique(cliquePadrao);
        JButton upgAuxClique = new JButton("Auxiliar de Clique C$: " + auxiliarClique.getValor());
        upgAuxClique.setToolTipText(auxiliarClique.getDescricao());

        // Ações
        botaoPrincipal.addActionListener(cliquePadrao);
        upgAuxClique.addActionListener(new AplicarUpgrade(cliquePadrao, auxiliarClique));

        // Interface
        jframe.add(botaoPrincipal);
        jframe.add(labelContador);
        jframe.add(upgAuxClique);
        jframe.setVisible(true);
    }
}
