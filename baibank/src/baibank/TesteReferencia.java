package baibank;

public class TesteReferencia {

	public static void main(String[] args) {
		
		Conta c1 = new Conta();
		c1.saldo = 300;
		 
		System.out.println("Saldo c1 R$" + c1.saldo);
		Conta c2 = c1;
		
		System.out.println("Saldo c2 R$" + c2.saldo);

		c2.saldo += 100;
		
		System.out.println("Saldo c2 R$" + c2.saldo);
		
		System.out.println("Saldo c1 R$" + c1.saldo);
		
		System.out.println(c1);
		System.out.println(c2);
		
		if(c1 == c2) {
			
			System.out.println("Contas iguais");
			
		}
		
		
		
	}
}
