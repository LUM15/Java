import java.awt.Image;
import java.awt.Rectangle;

import Interfaces.Colide;
import Interfaces.Grafico;
import Interfaces.Movel;
import Interfaces.Visivel;

public class Inimigo implements Visivel, Movel, Grafico, Colide{

	private static final int POSICAO_INICIAL = -30;
	
	private static int VELOCIDADE_X = 0;
	private static int VELOCIDADE_Y = 2;
	
	private Movimento movimento;
	private Visual visual;
	private Visibilidade visibilidade;

	
	public Inimigo(int x, int y) {
		movimento = new Movimento(x, y, VELOCIDADE_X, VELOCIDADE_Y);
		visual = new Visual("res\\inimigo.png");
		visibilidade = new Visibilidade(true);
	}

	@Override
	public void mover() {
		if (this.movimento.getY() > 780) {
			this.movimento.setY(POSICAO_INICIAL);
		} else {
			this.movimento.mover();
		}
	}

	@Override
	public boolean getVisibilidade() {
		return visibilidade.getVisibilidade();
	}

	@Override
	public void setVisibilidade(boolean visibilidade) {
		this.visibilidade.setVisibilidade(visibilidade);
	}

	@Override
	public void setX(int x) {
		this.movimento.setX(x);
	}

	@Override
	public int getX() {
		return this.movimento.getX();
	}

	@Override
	public void setY(int y) {
		this.movimento.setY(y);
	}

	@Override
	public int getY() {
		return this.movimento.getY();
	}

	@Override
	public Image getVisual() {
		return visual.getVisual();
	}

	@Override
	public Rectangle getBounds() {
		return new Rectangle(this.movimento.getX(), this.movimento.getY(), visual.getLargura(), visual.getAltura());
	}

}
