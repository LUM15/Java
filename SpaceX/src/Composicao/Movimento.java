package Composicao;
import Interfaces.Posicionado;

public class Movimento implements Posicionado{

	private int x;
	private int y;
	private int velocidadeX;
	private int velocidadeY;
	
	public Movimento(int x, int y, int velocidadeX, int velocidadeY) {
		this.x = x;
		this.y = y;
		this.velocidadeX = velocidadeX;
		this.velocidadeY = velocidadeY;
	}
	
	public void mover() {
		this.x += velocidadeX;
		this.y += velocidadeY;
	}

	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void setVelocidadeX(int velocidadeX) {
		this.velocidadeX = velocidadeX;
	}

	public void setVelocidadeY(int velocidadeY) {
		this.velocidadeY = velocidadeY;
	}

}
