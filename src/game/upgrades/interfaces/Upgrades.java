package game.upgrades.interfaces;

import game.acoes.AcaoAoClicar;

public interface Upgrades extends AcaoAoClicar {
    String getNome();
    String getDescricao();
    int getValor();
    void acaoDeClique();
}
