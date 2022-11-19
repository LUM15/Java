package br.com.baibank.banco.teste;

public class TestaString {

	public static void main(String[] args) {
		// Boa pratica
		String nome = "Luís";

		// String sobrenome = new String ("Miguel");

		// Econtra o primeiro char e substitui pelo segundo
		String nomeNovo = nome.replace("í", "i");

		String nomeMaiusculo = nome.toUpperCase();

		// String sao imutaveis no java
		System.out.println(nome);
		System.out.println(nomeNovo);
		System.out.println(nomeMaiusculo);
		
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
