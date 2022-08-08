
public class TestaCaracteres {

	public static void main(String[] args) {
		
		char letra = 'a';
		System.out.println(letra);
		
		char valor = 66;
		System.out.println(valor);
		
		valor = (char) (valor + 1);
		System.out.println(valor);
		
		String frase = "alura cursos online de tecnologia";
		System.out.println(frase);
		//Java converte sempre para o maior, 2020 e entendido como String e eh concatenado com frase
		String fraseDois = frase + 2020;
		System.out.println(fraseDois);
		
	}
}
