
public class ControlaBonificacao {

	private double soma;
	
	
	public void registra(Funcionario f) {
		double bonus = f.getBonificacao();
		this.soma = this.soma + bonus;
	}
	
	public double getSoma() {
		return soma;
	}
	
}
