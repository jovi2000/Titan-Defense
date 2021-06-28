package controller;

import model.CidadeModel;

public interface ICidadeController {
    public void diminuirVida(int dano);

    public void aumentarDinheiro(int recompensa);

    public void diminuirDinheiro(int gasto);

    public int getColuna();

    public int getVida();

    public int getDinheiro();
}
