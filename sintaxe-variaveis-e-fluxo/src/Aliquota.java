
public class Aliquota {

	public static void main(String[] args) {
		
//		De 1900.0 até 2800.0, o IR é de 7.5% e pode deduzir na declaração o valor de R$ 142
//		De 2800.01 até 3751.0, o IR é de 15% e pode deduzir R$ 350
//		De 3751.01 até 4664.00, o IR é de 22.5% e pode deduzir R$ 636	
		
		double salario = 3300.0;
		
		if (salario >= 1900.0 && salario <= 2800.0)	{
			
				System.out.println("O IR e de 7.5% e pode deduzir na declaracao o valor de R$142");
		}	else if (salario > 2800.0 && salario <= 3751.0)	{
			
				System.out.println("O IR e de 15% e pode deduzir na declaracao o valor de R$350");
		}	else if (salario > 3751.0 && salario <= 4664.0)	{
				
				System.out.println("O IR e de 22.5% e pode deduzir na declaracao o valor de R$636");
		}	else	{
			
			System.out.println("Nao tem taxa para esse valor");
		}
		
		
	}
}
