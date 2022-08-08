package abastecimento;

public class Tanque {

	private int capacidade;
	private int nivel_gasolina;

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	
	public void setNivelGasolina(int nivel_gasolina) {
		this.nivel_gasolina = nivel_gasolina;
	}
	
	public boolean checarNivelGasolina() {
		if (this.nivel_gasolina < this.capacidade) {
			return true;
		} else {
			return false;
		}
	}
}
