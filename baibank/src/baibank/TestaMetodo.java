package baibank;

public class TestaMetodo {

	public static void main(String[] args) {
		
		Conta c1 = new Conta();
		c1.saldo = 100;
		c1.deposita(50);
		
		System.out.println(c1.saldo);
		
		boolean conseguiuSacar = c1.saca(20);
		System.out.println(c1.saldo);
		System.out.println(conseguiuSacar);
		
		Conta contaMarcela = new Conta();
		contaMarcela.deposita(1000);
		
		if (contaMarcela.transferir(300, c1)) {
			
			System.out.println("Tranferencia realizada com sucesso");
			
		} else {
			
			System.out.println("Saldo insificiente");
			
		}
		
		System.out.println("Saldo Marcela: " + contaMarcela.saldo);
		System.out.println("Saldo C1: " + c1.saldo);
		
		
	}
}
