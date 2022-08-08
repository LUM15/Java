
public class TestaConversao {

		public static void main(String[] args) {
			
	        float pontoFlutuante = 3.14f;

	        double salario = 1270.50;
	        //int vai de 2x10^(-31) ate 2x10^(31) - 1 = -2147483648 ate 2147483647
	        int valor = (int) salario;
	        System.out.println(valor);
	        
			//long vai de -9,223,372,036,854,775,808 ate 9,223,372,036,854,775,807
			long numeroGrande = 6584135631455L;
			System.out.println(numeroGrande);

	        double valor1 = 0.2;
	        double valor2 = 0.1;
	        double total = valor1 + valor2;

	        System.out.println(total);
	        
		}
}
