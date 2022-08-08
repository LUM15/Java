
public class TestaLacos2 {

	public static void main(String[] args) {
		for (int linha = 1; linha <= 10; linha++) {

			for (int colunas = 1; colunas <= 10; colunas++) {
				if (colunas > linha)
					break;
				System.out.print(colunas);
			}
			System.out.println();
		}
	}
}
