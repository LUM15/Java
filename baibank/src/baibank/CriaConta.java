package baibank;

public class CriaConta {

	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		
		System.out.println(primeiraConta.saldo);

		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 300;
		
		System.out.println("A primeira conta tem R$" + primeiraConta.saldo );
		System.out.println("A segunda conta tem R$" + segundaConta.saldo );
		
		
		primeiraConta.agencia = 146;
		
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
		
		segundaConta.agencia = 146;
		
		System.out.println("agora a agencia da segunda conta e " + segundaConta.agencia);
	
		if (primeiraConta == segundaConta) {

			System.out.println("Mesma conta");

		} else {
			
			System.out.println("Diferentes");
			
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		
		
	}
}
