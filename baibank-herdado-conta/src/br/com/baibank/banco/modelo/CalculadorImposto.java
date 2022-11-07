package br.com.baibank.banco.modelo;

//modelo.CalculadorImposto => Full Qualified Name(FQN)
public class CalculadorImposto {

	private static double valorImposto;
	
	public void calcularImposto(Tributavel t) {
		this.valorImposto += t.getValorImposto(); 
	}
	
	public double getValorImposto() {
		return this.valorImposto;
	}
	
}
