
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("Testando condicionais.");
		
		int idade = 17;
		int quantidadePessoas = 1;
		if (idade >= 18) {
			System.out.println("Voce tem mais de dezoito anos");
			System.out.println("Seja bem vindo");
		}
		else {
			if (quantidadePessoas >= 2) {
				System.out.println("Voce nao tem 18, mas pode entrar porque esta acompanhado");
			} else	{
				System.out.println("infelizmente voce nao pode entrar");
			}
		}
	}
}
