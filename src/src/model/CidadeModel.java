package model;

public class CidadeModel extends Entidade implements ICidadeModel {
    /* Atributos */
    private int dinheiro;

    /* Construtor */
    public CidadeModel() {
        dinheiro = 400;
        vida = 400;
        coluna = 11;
    }

    public int getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(int dinheiro) {
        this.dinheiro = dinheiro;
    }

}
