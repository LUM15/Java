
public class TesteIR {

	public static void main(String[] args) {
		
		double salario = 3300.00;	
		
		if (salario < 2600.0)	{
			System.out.println("A sua aliquota eh de 15%");
            System.out.println("Voce pode deduzir até R$ 350");
		}
		if (salario < 3750.0)	{
			System.out.println("A sua aliquota eh de 22,5%");
            System.out.println("Voce pode deduzir ate R$ 636");
		}
		
		
		
	}
}
