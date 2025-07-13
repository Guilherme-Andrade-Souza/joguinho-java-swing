package game;

import java.awt.FlowLayout;

import javax.swing.*;

import game.acoes.EventosClique;

public class Jogo{
    public static void main(String[] args){

        JFrame jframe = new JFrame("T.S.W.M.I.J");
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setSize(500, 500);
        jframe.setLayout(new FlowLayout());


        JButton botaoPrincipal = new JButton("--> CLIQUE AQUI <---");
        JLabel labelContador = new JLabel("Coisinhas: 0 :( ");

        EventosClique cliquePadrao = new EventosClique(0, labelContador);

        botaoPrincipal.addActionListener(cliquePadrao);
        
        jframe.add(botaoPrincipal);
        jframe.add(labelContador);
        jframe.setVisible(true);

    }
}
