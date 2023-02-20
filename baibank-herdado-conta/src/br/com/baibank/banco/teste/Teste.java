package br.com.baibank.banco.teste;

import br.com.baibank.banco.modelo.Cliente;
import br.com.baibank.banco.modelo.ContaCorrente;
import br.com.baibank.banco.modelo.ContaPoupanca;

public class Teste {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(55, 66);
		Object cp = new ContaPoupanca(66, 77);
		Object cliente = new Cliente();
		
		System.out.println(cc.toString());
		System.out.println(cp);
		

	}

}
