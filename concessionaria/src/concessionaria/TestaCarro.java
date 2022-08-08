package concessionaria;

public class TestaCarro {

	public static void main(String[] args) {
		
		System.out.println("\n--- CARRO 1 ---");
		
		Carro carro = new Carro("Corsa", 15000.0);
		
		System.out.println("Ano: " + carro.getAno());
		System.out.println("Modelo: " + carro.getModelo());
		System.out.println("Preco: " + carro.getPreco());
		
		System.out.println("\n--- CARRO 2 ---");
		
		Carro carro2 = new Carro(1959, 40000.0);
		
		System.out.println("Ano: " + carro2.getAno());
		System.out.println("Modelo: " + carro2.getModelo());
		System.out.println("Preco: " + carro2.getPreco());
		
		System.out.println("\n--- CARRO 3 ---");
		
		Carro carro3 = new Carro(1998, "Kombi", 35000.0);
		
		System.out.println("Ano: " + carro3.getAno());
		System.out.println("Modelo: " + carro3.getModelo());
		System.out.println("Preco: " + carro3.getPreco());
		
		
	}
	
	
}
