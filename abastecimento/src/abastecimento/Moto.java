package abastecimento;

public class Moto extends Veiculo implements Motorizado{

	private Tanque t;
	
	public Moto(int capacidade, int nivel_gasolina) {
		this.t = new Tanque();
		setCapacidadeTanque(capacidade);
		setNivelGasolina(nivel_gasolina);
	}
	
	public void setCapacidadeTanque(int capacidade) {
		this.t.setCapacidade(capacidade);	
	}

	public void setNivelGasolina(int nivel_gasolina) {
		this.t.setNivelGasolina(nivel_gasolina);
		
	}

	public boolean checarNivelGasolina() {
		return this.t.checarNivelGasolina();
	}

}
