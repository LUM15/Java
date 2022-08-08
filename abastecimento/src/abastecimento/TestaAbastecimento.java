package abastecimento;

public class TestaAbastecimento {

	public static void main(String[] args) {
		
		Moto m1 = new Moto(16, 8);
		m1.setDono("Baiano");
		m1.setFabricante("Honda");
			
		Frentista jao = new Frentista();
		jao.abastecer(m1);
		
		Bicicleta b1 = new Bicicleta();
		b1.setDono("Lucas");
		b1.setFabricante("Kaloy");
		
		System.out.println("A Fabricante da bicicleta do " + b1.getDono() + " é a " + b1.getFabricante());
		
		Carro c1 = new Carro(45, 45);
		jao.abastecer(c1);
		
		
	}
}
