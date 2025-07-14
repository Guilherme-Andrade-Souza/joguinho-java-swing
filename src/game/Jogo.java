package game;

import java.awt.FlowLayout;
import javax.swing.*;

//TODO FuncionarioDeEscritorio, Estagiario do TI(Apresenta o primeiro dialogo de lore), Sindicatario, GerenciaCoach, AcionistasIdosos, CafeteiraGratis(Outro Diálogo), 


public class Jogo {
    public static void main(String[] args) {
        JFrame jframe = new JFrame("T.S.W.M.I.J");
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setSize(500, 500);
        jframe.setLayout(new FlowLayout());
        jframe.setVisible(true);

        // Componentes principais
        JButton botaoPrincipal = new JButton("--> CLIQUE AQUI <---");
        JLabel labelContador = new JLabel("Coisinhas: 0 :( ");

        // Interface
        jframe.add(botaoPrincipal);
        jframe.add(labelContador);
    }
}
