package br.com.baibank.testes;

import br.com.baibank.banco.modelo.Conta;
import br.com.baibank.banco.modelo.ContaCorrente;

public class TesteBiblioteca {

	public static void main(String[] args) {
		
		Conta c = new ContaCorrente(123, 321);
		
		c.deposita(200.3);
		
		System.out.println("Saldo: R$" + c.getSaldo());

	}

}
