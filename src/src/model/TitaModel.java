package model;

public class TitaModel extends Entidade implements ITitaModel {
    /* Atributos */
    private int dano;
    private int recompensa;
    private int vidaTotal;

    /* Construtor */
    public TitaModel() {
        vida = 100;
        dano = 10;
        recompensa = 25;
    }

    /* Getters e Setters */

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public int getRecompensa() {
        return recompensa;
    }

    public void setRecompensa(int recompensa) {
        this.recompensa = recompensa;
    }

    public int getVidaTotal() {
        return vidaTotal;
    }

    public void setVidaTotal(int vidaTotal) {
        this.vidaTotal = vidaTotal;
    }
}
