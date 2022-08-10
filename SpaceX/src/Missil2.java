import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

import Interfaces.Colide;
import Interfaces.Grafico;
import Interfaces.Movel;
import Interfaces.Visivel;

public class Missil2 implements Visivel, Movel, Grafico, Colide{

	private Movimento movimento;
	private Visual visual;
	private Visibilidade visibilidade;
	
	private static final int ALTURA_DA_TELA = 0;
	private static int VELOCIDADE_X = 0;
	private static int VELOCIDADE_Y = 2;
	
	@Override
	public Rectangle getBounds() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Image getVisual() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setX(int x) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setY(int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void mover() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean getVisibilidade() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setVisibilidade(boolean visibilidade) {
		// TODO Auto-generated method stub
		
	}
}
