package Composicao;
import java.awt.Rectangle;

import Interfaces.Delimitado;
import Interfaces.Posicionado;

public class HitBox {

	private Rectangle hitbox;
	
	public Rectangle getHitBox(Posicionado p, Delimitado d) {
		return this.hitbox = new Rectangle(p.getX(), p.getY(), d.getLargura(), d.getAltura());
	}
}
