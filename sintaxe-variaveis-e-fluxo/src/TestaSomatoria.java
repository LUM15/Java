
public class TestaSomatoria {

	public static void main(String[] args) {

		int valorInicial = 0;
		int valorFinal = 0;
		while (valorInicial <= 1000) {
			//adiciona o valor atual de inicio a valorFinal
			valorFinal = valorFinal + valorInicial;
			valorInicial++;
		}
		//imprimi o valorFinal
		System.out.println("Soma total de 1 ate 1000 eh " + valorFinal);
	}
}
