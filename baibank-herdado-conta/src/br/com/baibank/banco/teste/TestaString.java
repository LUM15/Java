package br.com.baibank.banco.teste;

public class TestaString {

	public static void main(String[] args) {
		// Boa pratica
		String nome = "Luís";

		// Nao se faz
//		String nome = new String("Luís");
		
		// Testes dos metodos da classe String
		int teste = nome.length();
		
		for (int i = 0; i < nome.length(); i++) {
			
			System.out.println(nome.charAt(i));
			
		}
		
//		String teste = nome.substring(2);
		
//		String teste = nome.replace("í", "i");

//		String teste = nome.toUpperCase();		

//		char teste = nome.charAt(3);
		
//		int teste = nome.indexOf("u");

		System.out.println(teste);

		String teste2 = "   Teste ";
		String teste2SemEspacos = teste2.trim();
		
		System.out.println(teste2);
		System.out.println(teste2SemEspacos);
		System.out.println("Tem Tes? " + teste2.contains("Tes"));
		
		String teste3 = " ";
		String teste3Vazio = teste3.trim();
		
		System.out.println("Vazio? " + teste3Vazio.isEmpty());
		
		// Filtro palavrao
		String fraseComPalavrao = "Vai se Fuder";
		
		String fraseSemPalavrao = filtrarFrase(fraseComPalavrao);
		
		System.out.println(fraseSemPalavrao);
		

	}
	
	// Substitui o palavrao 'fuder' por '*'
	public static String filtrarFrase(String fraseSuja) {
		String fraseFiltrada = fraseSuja.toLowerCase();
		fraseFiltrada = fraseFiltrada.replace("fuder", "*****");
		return fraseFiltrada;
	}
	
}
