package Composicao;
import java.awt.Image;

import javax.swing.ImageIcon;

import Interfaces.Delimitado;

public class Visual implements Delimitado{
	
	private Image visual;

	public Visual(String caminho_imagen) {
		visual = new ImageIcon(caminho_imagen).getImage();
	}

	public Image getVisual() {
		return this.visual;
	}
	
	public int getAltura() {
		return visual.getHeight(null);
	}
	
	public int getLargura() {
		return visual.getWidth(null);
	}
	
}
