
public class CalculadorImposto {

	private static double valorImposto;
	
	public void calcularImposto(Tributavel t) {
		this.valorImposto += t.getValorImposto(); 
	}
	
	public double getValorImposto() {
		return this.valorImposto;
	}
	
}
