package game;

import java.awt.FlowLayout;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.*;

import game.acoes.CliqueBotaoPadrao;
import game.acoes.ListenerClique;
import game.upgrades.AuxiliarClique;
import game.upgrades.FuncionarioDeEscritorio;

//TODO upgrades: Estagiario do TI(Apresenta o primeiro dialogo de lore), Sindicatario, GerenciaCoach, AcionistasIdosos, CafeteiraGratis(Outro Diálogo), 


public class Jogo{
    //Atributos principais
    public static long contadorCoisinhas = 0;
    public static int valorClique = 1;
    public static int valorGanhoPassivo = 0;
    public static JLabel labelContador = new JLabel("Coisinhas: 0 :( ");
    public static final int TEMPORIZADOR = 1000;

    //instancias upgrades 

    static AuxiliarClique auxiliarClique = new AuxiliarClique();
    static FuncionarioDeEscritorio funcDeEscritorio = new FuncionarioDeEscritorio();


    // Botoes upgrades
    public static JButton upgAuxClique = new JButton("Auxiliar de Clique: C$ 100");
    public static JButton upgFuncEscritorio = new JButton("Funcionario de Escritorio: C$ 200");

    public static void main(String[] args) {


        JFrame jframe = new JFrame("T.S.W.M.I.J");
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setSize(500, 500);
        jframe.setLayout(new FlowLayout());
        
        //Timer Cliques Passivos
        
        Timer timer = new Timer();

        TimerTask cliquesPassivo = new TimerTask() {
            @Override
            public void run() {
                contadorCoisinhas += valorGanhoPassivo;
                labelContador.setText("Coisinhas: "+ contadorCoisinhas);
            }
        };

        timer.scheduleAtFixedRate(cliquesPassivo, 0, TEMPORIZADOR);

        // Componentes principais
        JButton botaoPrincipal = new JButton("--> CLIQUE AQUI <---");
        
        //ToolTipTexts
        upgAuxClique.setToolTipText(auxiliarClique.getDescricao());

        //Adicionando os Listeners
        ListenerClique.adicionarListenerClique(botaoPrincipal, new CliqueBotaoPadrao());
        ListenerClique.adicionarListenerClique(upgAuxClique, new AuxiliarClique());
        ListenerClique.adicionarListenerClique(upgFuncEscritorio, new FuncionarioDeEscritorio());

        // Interface
        jframe.add(botaoPrincipal);
        jframe.add(upgAuxClique);
        jframe.add(upgFuncEscritorio);
        jframe.add(labelContador);
        jframe.setVisible(true);
    }

}
