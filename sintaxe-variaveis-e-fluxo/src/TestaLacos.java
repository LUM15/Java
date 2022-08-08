
public class TestaLacos {

	public static void main(String[] args) {
		// imprimir tabuadas de 1 a 10

		// Ira reptir 10 vezes
		for (int tabuada = 1; tabuada <= 10; tabuada++) {
			// Imprime de 0 a 10
			System.out.println("\n------Tabuado do " + tabuada + "------");
			for (int valor = 1; valor <= 10; valor++) {
				// Imprime valor
				System.out.print(" " + valor * tabuada);
			}
			System.out.println();
		}

	}
}
