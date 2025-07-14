package game.upgrades;

import game.acoes.EventosClique;

public class AuxiliarClique implements UpgradeInterface{
    private String nome = "Auxiliar de Clique";
    private String descricao = "<html> São seres hipoteticos que ajudam você clicar em botões,<br> cada um comprado garante +1 no valor de clique. <br>Eles apenas cobram uma taxa de serviço, que seres mais capitalistas, <br>eles nem existem. </html>"; 
    private long valor = 10;
    private EventosClique evtAuxClique;

    public AuxiliarClique(EventosClique evtAuxClique){
        this.evtAuxClique = evtAuxClique;
    }

    public String getNome(){return nome; }

    public String getDescricao(){return descricao; }

    public long getValor(){return valor; }

    public void aplicar(){
        evtAuxClique.setValorClique(evtAuxClique.getValorClique() + 1);
        valor += 10;
        evtAuxClique.setContador(evtAuxClique.getContador() - valor);
    }

    public boolean podeComprar(long contador){
        return  contador >= valor;
    }

}
