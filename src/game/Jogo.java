package game;

import java.awt.FlowLayout;

import javax.swing.*;

import game.acoes.CliqueBotaoPadrao;
import game.acoes.ListenerClique;
import game.upgrades.AuxiliarClique;

//TODO upgrades: Auxiliar de Clique, FuncionarioDeEscritorio, Estagiario do TI(Apresenta o primeiro dialogo de lore), Sindicatario, GerenciaCoach, AcionistasIdosos, CafeteiraGratis(Outro Diálogo), 


public class Jogo {
    //Atributos principais
    public static long contadorCoisinhas = 0;
    public static int valorClique = 1;
    public static int valorGanhoPassivo = 0;
    public static JLabel labelContador = new JLabel("Coisinhas: 0 :( ");

    public static void main(String[] args) {
        AuxiliarClique auxiliarClique = new AuxiliarClique();


        JFrame jframe = new JFrame("T.S.W.M.I.J");
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setSize(500, 500);
        jframe.setLayout(new FlowLayout());
        jframe.setVisible(true);

        // Componentes principais
        JButton botaoPrincipal = new JButton("--> CLIQUE AQUI <---");
        JButton upgAuxClique = new JButton("Auxiliar de Clique "+ auxiliarClique.getValor());

        //ToolTipTexts
        upgAuxClique.setToolTipText(auxiliarClique.getDescricao());

        //Adicionando os Listeners
        ListenerClique.adicionarListenerClique(upgAuxClique, new AuxiliarClique());
        ListenerClique.adicionarListenerClique(botaoPrincipal, new CliqueBotaoPadrao());

        // Interface
        jframe.add(botaoPrincipal);
        jframe.add(upgAuxClique);
        jframe.add(labelContador);
    }
}
