package game;

import java.awt.FlowLayout;

import javax.swing.*;

import game.acoes.CliqueBotaoPadrao;
import game.acoes.ListenerClique;

//TODO upgrades: Auxiliar de Clique, FuncionarioDeEscritorio, Estagiario do TI(Apresenta o primeiro dialogo de lore), Sindicatario, GerenciaCoach, AcionistasIdosos, CafeteiraGratis(Outro Diálogo), 


public class Jogo {
    //Atributos principais
    public static long contadorCoisinhas = 0;
    public static int valorClique = 1;
    public static int valorGanhoPassivo = 0;
    public static JLabel labelContador = new JLabel("Coisinhas: 0 :( ");

    public static void main(String[] args) {
        JFrame jframe = new JFrame("T.S.W.M.I.J");
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setSize(500, 500);
        jframe.setLayout(new FlowLayout());
        jframe.setVisible(true);

        // Componentes principais
        JButton botaoPrincipal = new JButton("--> CLIQUE AQUI <---");

        ListenerClique.adicionarListenerClique(botaoPrincipal, new CliqueBotaoPadrao());

        // Interface
        jframe.add(botaoPrincipal);
        jframe.add(labelContador);
    }
}
