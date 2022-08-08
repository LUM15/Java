package abastecimento;

public class Frentista {

	public void abastecer(Motorizado m) {
		if (m.checarNivelGasolina()) {
			System.out.println("Enchendo o tanque!");
		} else {
			System.out.println("Tanque cheio!");
		}
	}
	
}
