package game.upgrades;

import game.Jogo;
import game.upgrades.interfaces.UpgradesPassivos;

public class FuncionarioDeEscritorio implements UpgradesPassivos{
    private String nome = "Funcionarios de escritorio";
    private String descricao = "Funcionario de escritorio, ninguem sabe exatamente que eles fazem dizem que eles geram lucro mas como? Talvez hipoteticamente eles me ajudaram produzir este joguinho, eles ganham mal, trabalham muito, e garantem +1 coisinha passivamente, e um ótimo negocio.";
    private int valor = 200;
    private int incrementoValorPassivo = 1;

    @Override
    public String getNome() {return nome;}
    @Override 
    public String getDescricao(){return descricao;}
    @Override
    public int getValor(){return valor;}
    @Override
    public int getIncrementoValorPassivo(){return incrementoValorPassivo;}

    @Override
    public void acaoDeClique(){
        if(valor <= Jogo.contadorCoisinhas){
            Jogo.valorGanhoPassivo += incrementoValorPassivo;
            Jogo.contadorCoisinhas -= valor;
            valor += 100;
            Jogo.labelContador.setText("Coisinhas: " + Jogo.contadorCoisinhas);
            Jogo.upgFuncEscritorio.setText("Funcionario de Escritorio: " + valor);
        }
    }

}
