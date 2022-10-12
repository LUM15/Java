package Entidades;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

import Interfaces.surgimento.Jogador;

public class Mapa extends JPanel implements ActionListener {

	/**
	 * Nao sei pra que serve, mas faz o Warning sumir!
	 */
	private static final long serialVersionUID = 1L;
	
	private Image fundo;
	private Image gameover;
	private Image gif;
	private Image intro;
	private Nave nave;
	private Timer t;
	private GerenciadorDeInimigos gdi;
	private int emJogo = 0;

	public Mapa() {
		setFocusable(true);
		setDoubleBuffered(false);
		addKeyListener(new TecladoAdapter());
		inicializaInimigos();
		ImageIcon image_path = new ImageIcon("res\\fundo.png");
		fundo = image_path.getImage();

		iniciarJogador();

		// Inicia o timer que a cada 5ms chama o ActionListener
		t = new Timer(1, this);
		t.start();
	}

	public void inicializaInimigos() {
		gdi = new GerenciadorDeInimigos();
	}

	String placar = "Inimigos: ";

	public void paint(Graphics g) {

		Graphics2D graficos = (Graphics2D) g;
		graficos.drawImage(fundo, 0, 0, null);

		// 0 == 'Intro'
		if (emJogo == 0) {

			ImageIcon image_path = new ImageIcon("res\\intro.png");
			intro = image_path.getImage();
			graficos.drawImage(intro, 0, 0, null);

			// 1 == 'Em Jogo'
		} else if (emJogo == 1) {
			
			graficos.drawImage(nave.getVisual(), nave.getX(), nave.getY(), this);

			// Placar
			graficos.setColor(Color.WHITE);
			graficos.drawString(placar + gdi.getInimigos().size(), 20, 20);
			graficos.draw(nave.getBounds());

			// Inicializa misseis
			List<Missil> misseis = nave.getMisseis();
			for (int i = 0; i < misseis.size(); i++) {
				Missil m = (Missil) misseis.get(i);
				graficos.drawImage(m.getVisual(), m.getX(), m.getY(), null);
				graficos.setColor(Color.WHITE);
				graficos.draw(m.getBounds());
			}

			// Desenhar inimigos
			for (int i = 0; i < gdi.getInimigos().size(); i++) {
				Inimigo in = (Inimigo) gdi.getInimigos().get(i);
				graficos.drawImage(in.getVisual(), in.getX(), in.getY(), null);
				graficos.setColor(Color.WHITE);
				graficos.draw(in.getBounds());
			}

			// 2 == 'Derrota'
		} else if (emJogo == 2) {

			ImageIcon image_path = new ImageIcon("res\\sefudeu.png");
			gameover = image_path.getImage();
			graficos.drawImage(gameover, 0, 0, null);

			ImageIcon image_cat = new ImageIcon("res\\loser.gif");
			gif = image_cat.getImage();
			graficos.drawImage(gif, 130, 300, null);

		} else {
			ImageIcon image_path = new ImageIcon("res\\vitoria.png");
			gameover = image_path.getImage();
			graficos.drawImage(gameover, 0, 0, null);
		}

		// Limpa tela para redesenhar tudo novamente
		graficos.dispose();
	}

	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		nave.mover();
		List<Missil> misseis = nave.getMisseis();

		for (int i = 0; i < misseis.size(); i++) {
			if (misseis.get(i).getVisibilidade()) {
				misseis.get(i).mover();
			} else {
				misseis.remove(i);
			}
		}

		for (int i = 0; i < gdi.getInimigos().size(); i++) {
			if (gdi.getInimigos().get(i).getVisibilidade()) {
				gdi.getInimigos().get(i).mover();
			} else {
				gdi.getInimigos().remove(i);
			}
		}

		if (gdi.getInimigos().size() == 0)
			emJogo = 3;

		checarColisoes();
		repaint();
	}

	public void checarColisoes() {
		Rectangle hitBoxNave = nave.getBounds();
		Rectangle hitBoxInimigo;
		Rectangle hitBoxMissil;

		List<Missil> misseis = nave.getMisseis();
		for (int i = 0; i < misseis.size(); i++) {

			hitBoxMissil = misseis.get(i).getBounds();

			for (int j = 0; j < gdi.getInimigos().size(); j++) {

				hitBoxInimigo = gdi.getInimigos().get(j).getBounds();

				if (hitBoxMissil.intersects(hitBoxInimigo)) {
					misseis.get(i).setVisibilidade(false);
					gdi.getInimigos().get(j).setVisibilidade(false);

				}
			}
		}

		for (int i = 0; i < gdi.getInimigos().size(); i++) {

			hitBoxInimigo = gdi.getInimigos().get(i).getBounds();

			if (hitBoxNave.intersects(hitBoxInimigo)) {
				nave.setVisibilidade(false);
				gdi.getInimigos().get(i).setVisibilidade(false);
				emJogo = 2;
			}
		}
	}

	public void iniciarJogador() {
		nave = new Nave(Jogador.POSICAO_INICIAL_X, Jogador.POSICAO_INICIAL_Y, 0, 0, Jogador.SPRITE, true);
	}

	private class TecladoAdapter extends KeyAdapter {

		@Override
		public void keyPressed(KeyEvent e) {
			if (e.getKeyCode() == KeyEvent.VK_ENTER) {
				emJogo = 1;
				iniciarJogador();
				inicializaInimigos();
			}
			nave.keyPressed(e);
		}

		@Override
		public void keyReleased(KeyEvent e) {
			nave.keyReleased(e);
		}
	}

}