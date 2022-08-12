package Entidades;

import java.util.ArrayList;
import java.util.List;

import Interfaces.surgimento.Mob;

public class GerenciadorDeInimigos {
	private List<Inimigo> inimigos;
	private int[][] posicoes = {
			// Lista de coordenadas dos inimigos
			{ 26, -276 }, { 426, -443 }, { 368, -33 }, { 74, -34 }, { 16, -322 }, { 358, -261 },
			{ 87, -656 }, { 268, -416 }, { 247, -66 }, { 378, -336 }, { 10, -30 }, { 52, -654 }, { 400, -376 },
			{ 22, -46 }, };

	public GerenciadorDeInimigos() {
		inimigos = new ArrayList<Inimigo>();
		for (int i = 0; i < posicoes.length; i++) {
			inimigos.add(
					new Inimigo(posicoes[i][0], posicoes[i][1], Mob.VELOCIDADE_X, Mob.VELOCIDADE_Y, Mob.SPRITE, true));
		}
	
	}

	public List<Inimigo> getInimigos() {
		return inimigos;
	}
	
}
