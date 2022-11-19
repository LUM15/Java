package br.com.baibank.banco.teste;

import br.com.baibank.banco.modelo.*;

public class TestaContas {

	public static void main(String[] args) {
		//Full Qualified Name => FQN
		ContaCorrente cc1 = new ContaCorrente(111, 222);
		cc1.deposita(100.0);
			
		ContaPoupanca cp1 = new ContaPoupanca(111, 333);
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
