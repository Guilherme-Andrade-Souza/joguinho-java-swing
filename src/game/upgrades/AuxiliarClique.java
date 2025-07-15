package game.upgrades;

import game.Jogo;
import game.upgrades.interfaces.UpgradesAtivos;

public class AuxiliarClique implements UpgradesAtivos{
    private String nome = "Auxiliar de Clique";
    private String descricao = "<html> São seres hipoteticos que ajudam você clicar em botões,<br> cada um comprado garante +1 no valor de clique. <br>Eles apenas cobram uma taxa de serviço, que seres mais capitalistas, <br>eles nem existem. </html>";
    private int valor = 10;
    private int incrementoValorClique = 1;

    @Override
    public String getNome() {return nome;}
    @Override 
    public String getDescricao(){return descricao;}
    @Override
    public int getValor(){return valor;}
    @Override
    public int getIncrementoValorClique(){return incrementoValorClique;}

    @Override
    public void acaoDeClique(){
        if(valor <= Jogo.contadorCoisinhas){
            Jogo.valorClique += incrementoValorClique;
            Jogo.contadorCoisinhas -= valor;
            valor += 10;
            Jogo.labelContador.setText("Coisinhas: " + Jogo.contadorCoisinhas);
        }
    }

}
