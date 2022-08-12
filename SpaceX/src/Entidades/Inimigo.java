package Entidades;

import Interfaces.surgimento.Mob;

public class Inimigo extends Entidade implements Mob {
	
	static int VELOCIDADE_x = 0;
	static int VELOCIDADE_Y = 0;

	public Inimigo(int x, int y, int velocidadeX, int velocidadeY, String s, boolean visivel) {
		super(x, y, velocidadeX, velocidadeY, s, visivel);
	}

	public void mover() {
		if (this.getY() > 780) {
			this.setY(TELEPORTAR_PARA);
		} else {
			super.mover();
		}
	}

}
