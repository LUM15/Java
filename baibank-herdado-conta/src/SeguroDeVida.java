
public class SeguroDeVida implements Tributavel{

	private double taxaPercentual = 0.15;
	private double valorSeguro;

	public void setValorSeguro(double valorSeguro) {
		this.valorSeguro = valorSeguro;
	}
	
	@Override
	public double getValorImposto() {
		return this.valorSeguro * this.taxaPercentual;
	}
	

}
