package Entidades;

import java.awt.Image;
import java.awt.Rectangle;

import Composicao.HitBox;
import Composicao.Movimento;
import Composicao.Visibilidade;
import Composicao.Visual;
import Interfaces.Colide;
import Interfaces.Grafico;
import Interfaces.Movel;
import Interfaces.Visivel;

public abstract class Entidade implements Visivel, Movel, Grafico, Colide {

	// Visivel
	private Visibilidade visibilidade;
	// Movel
	private Movimento movimento;
	// Grafico
	private Visual visual;
	// Colide
	private HitBox hit_box;

	public Entidade(int x, int y, int velocidadeX, int velocidadeY, String s, boolean visivel) {
		hit_box = new HitBox();
		movimento = new Movimento(x, y, velocidadeX, velocidadeY);
		visual = new Visual(s);
		visibilidade = new Visibilidade(visivel);
	}

	public void setMovimento(int x, int y, int velocidade_x, int velocidade_y) {
		this.movimento = new Movimento(x, y, velocidade_x, velocidade_y);
	}

	public Movimento getMovimento() {
		return movimento;
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

	public void mover() {
		this.movimento.mover();
	}

	@Override
	public Image getVisual() {
		return this.visual.getVisual();
	}

	public void setBounds() {
		this.hit_box = new HitBox();
	}

	@Override
	public Rectangle getBounds() {
		return this.hit_box.getHitBox(movimento, visual);
	}
}
