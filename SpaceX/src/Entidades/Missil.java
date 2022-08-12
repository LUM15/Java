package Entidades;


import Interfaces.surgimento.Projetil;

public class Missil extends Entidade implements Projetil{

	public Missil(int x, int y, int velocidadeX, int velocidadeY, String s, boolean visivel) {
		super(x, y, velocidadeX, velocidadeY, s, visivel);
	}

	public void mover() {
		super.mover();
		if(getY() < ALTURA_DA_TELA) setVisibilidade(false);
	}


}
