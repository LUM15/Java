package br.com.baibank.banco.teste;

import br.com.baibank.banco.modelo.Cliente;
import br.com.baibank.banco.modelo.Conta;
import br.com.baibank.banco.modelo.ContaCorrente;
import br.com.baibank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
		Conta[] contas = new Conta[5];
		
		Cliente cliente00 = new Cliente("Heloise Sandra da Rosa", "770.707.020-86");
		Cliente cliente01 = new Cliente("Eloá Amanda Araújo", "861.415.648-01");
		Cliente cliente02 = new Cliente("Rita Alice Alessandra Aragão", "387.431.161-91");
		Cliente cliente03 = new Cliente("Márcia Valentina Rita dos Santos", "379.648.807-21");
		Cliente cliente04 = new Cliente("Stella Isadora da Silva", "817.984.388-28");
		
		ContaCorrente cc1 = new ContaCorrente(33, 798, cliente00);
		contas[0] = cc1;
		
		ContaCorrente cc2 = new ContaCorrente(44, 845, cliente01);
		contas[1] = cc2;
		
		ContaPoupanca cc3 = new ContaPoupanca(88, 946, cliente02);
		contas[2] = cc3;
		
		ContaCorrente cc4 = new ContaCorrente(99, 156, cliente03);
		contas[3] = cc4;
		
		ContaCorrente cc5 = new ContaCorrente(66, 374, cliente04);
		contas[4] = cc5;
		
		//Run Time Exception: só funciona porque conheço o tipo de objeto que 
		//fica naquela posição do array, se alterar o tipo irá dar erro durante a execução.
		ContaCorrente ref = (ContaCorrente) contas[0];
		System.out.println(ref.getNumero() + "\n");
		
		for (int i = 0; i < contas.length; i++) {
			
			System.out.println(contas[i].toString() + "\n");
		
		}
	}
}
