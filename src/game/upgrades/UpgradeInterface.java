package game.upgrades;

public interface UpgradeInterface {
    String getNome();
    String getDescricao();
    long getCusto();
    void aplicar();
    boolean podeComprar(long contador);
}
