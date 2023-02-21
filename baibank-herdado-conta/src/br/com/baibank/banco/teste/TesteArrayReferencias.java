package br.com.baibank.banco.teste;

import br.com.baibank.banco.modelo.Cliente;
import br.com.baibank.banco.modelo.ContaCorrente;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
		ContaCorrente[] contasCorrentes = new ContaCorrente[5];
		
		Cliente cliente00 = new Cliente("Heloise Sandra da Rosa", "770.707.020-86");
		Cliente cliente01 = new Cliente("Eloá Amanda Araújo", "861.415.648-01");
		Cliente cliente02 = new Cliente("Rita Alice Alessandra Aragão", "387.431.161-91");
		Cliente cliente03 = new Cliente("Márcia Valentina Rita dos Santos", "379.648.807-21");
		Cliente cliente04 = new Cliente("Stella Isadora da Silva", "817.984.388-28");
		
		ContaCorrente cc1 = new ContaCorrente(33, 798, cliente00);
		contasCorrentes[0] = cc1;
		
		ContaCorrente cc2 = new ContaCorrente(44, 845, cliente01);
		contasCorrentes[1] = cc2;
		
		ContaCorrente cc3 = new ContaCorrente(88, 946, cliente02);
		contasCorrentes[2] = cc3;
		
		ContaCorrente cc4 = new ContaCorrente(99, 156, cliente03);
		contasCorrentes[3] = cc4;
		
		ContaCorrente cc5 = new ContaCorrente(66, 374, cliente04);
		contasCorrentes[4] = cc5;
		
		for (int i = 0; i < contasCorrentes.length; i++) {
			
			System.out.println(contasCorrentes[i].toString() + "\n");
		
		}
	}
}
