package game.upgrades;

public interface UpgradeInterface {
    String getNome();
    String getDescricao();
    long getValor();
    void aplicar();
    boolean podeComprar(long contador);
}
