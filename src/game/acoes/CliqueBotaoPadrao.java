package game.acoes;

import game.Jogo;

public class CliqueBotaoPadrao implements AcaoAoClicar{

    @Override
    public void acaoDeClique(){
        Jogo.contadorCoisinhas += Jogo.valorClique;
    }
}
