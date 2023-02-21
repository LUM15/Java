package br.com.baibank.banco.modelo;
public class GuardadorDeContas {

	private Conta[] referencias;
	private int posicaoLivre;
	
	public GuardadorDeContas() {
		this.referencias = new Conta[99];
		this.posicaoLivre = 0;
	}

	public void adiciona(ContaCorrente ref) {
		this.referencias[this.posicaoLivre] = ref;
		this.posicaoLivre++;
	}

	public int getQuantidadeDeElementos() {
		return this.posicaoLivre;
	}

	public Conta getReferencia(int i) {
		return referencias[i];
	}
	
}
