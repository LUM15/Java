package br.com.baibank.banco.teste;

import br.com.baibank.banco.modelo.Cliente;
import br.com.baibank.banco.modelo.ContaCorrente;
import br.com.baibank.banco.modelo.ContaPoupanca;

public class TesteObject {

	public static void main(String[] args) {
		
		Cliente cliente01 = new Cliente("Sebastião Enrico de Paula", "561.188.376-19");
		ContaCorrente cc = new ContaCorrente(55, 66, cliente01);
		
		Cliente cliente02 = new Cliente("Sueli Tereza da Mata", "818.259.081-76");
		ContaPoupanca cp = new ContaPoupanca(66, 77, cliente02);
		
		System.out.println(cc.toString());
		System.out.println(cp);
		

	}

}
