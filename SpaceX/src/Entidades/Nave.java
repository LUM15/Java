package Entidades;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import Interfaces.surgimento.Jogador;

public class Nave extends Entidade implements Jogador{

	private List<Missil> misseis;

	public Nave(int x, int y, int velocidadeX, int velocidadeY, String s, boolean visivel) {
		super(x, y, velocidadeX, velocidadeY, s, visivel);
		misseis = new ArrayList<Missil>();
	}

	public List<Missil> getMisseis() {
		return misseis;
	}
	
	public void mover() {
		super.mover();
		// Valida se a nave está dentro do mapa
		if (getX() < LIMITE_E)
			setX(LIMITE_E);
		if (getX() > LIMITE_D)
			setX(LIMITE_D);
		if (getY() < LIMITE_T)
			setY(LIMITE_T);
		if (getY() > LIMITE_C)
			setY(LIMITE_C);
	}

	public void atirar() {
		this.misseis.add(new Missil(getX() + Missil.POSICAO_INICIAL_X, getY() + Missil.POSICAO_INICIAL_Y,
				Missil.VELOCIDADE_X, Missil.VELOCIDADE_Y, Missil.SPRITE, true));
	}
	
	public void keyPressed(KeyEvent ke) {
		int codigo = ke.getKeyCode();

		if (codigo == KeyEvent.VK_Z) {
			this.atirar();
		}

		switch (codigo) {
		case KeyEvent.VK_Z:
			this.atirar();
			break;
		case KeyEvent.VK_UP:
			getMovimento().setVelocidadeY(-VELOCIDADE_Y);
			break;
		case KeyEvent.VK_DOWN:
			getMovimento().setVelocidadeY(VELOCIDADE_Y);
			break;
		case KeyEvent.VK_LEFT:
			getMovimento().setVelocidadeX(-VELOCIDADE_X);
			break;
		case KeyEvent.VK_RIGHT:
			getMovimento().setVelocidadeX(VELOCIDADE_X);
			break;
		}
	}
	
	public void keyReleased(KeyEvent ke) {

		int codigo = ke.getKeyCode();

		switch (codigo) {
		case KeyEvent.VK_UP:
			getMovimento().setVelocidadeY(0);
			break;
		case KeyEvent.VK_DOWN:
			getMovimento().setVelocidadeY(0);
			break;
		case KeyEvent.VK_LEFT:
			getMovimento().setVelocidadeX(0);
			break;
		case KeyEvent.VK_RIGHT:
			getMovimento().setVelocidadeX(0);
			break;
		}
	}

}
