package br.com.baibank.banco.teste;

import br.com.baibank.banco.modelo.*;

public class TestaContas {

	public static void main(String[] args) {
		//Full Qualified Name => FQN
		Cliente cliente04 = new Cliente("Stella Isadora da Silva", "817.984.388-28");
		ContaCorrente cc1 = new ContaCorrente(111, 222, cliente04);
		cc1.deposita(100.0);
		
		Cliente cliente02 = new Cliente("Rita Alice Alessandra Aragão", "387.431.161-91");	
		ContaPoupanca cp1 = new ContaPoupanca(111, 333, cliente02);
		cp1.deposita(200.0);
			
		try {
			cc1.transferir(10.0, cp1);
		} catch (SaldoInsuficienteException e) {
			
			System.out.println(e.getMessage());
		}
			
		System.out.println("CC: " + cc1.getSaldo());
		System.out.println("CP: " + cp1.getSaldo());
		
		System.out.println("Quantidade de contas: " + Conta.getQuantidade());
			
		}
}
