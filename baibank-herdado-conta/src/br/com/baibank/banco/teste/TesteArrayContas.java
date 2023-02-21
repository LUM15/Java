package br.com.baibank.banco.teste;

import br.com.baibank.banco.modelo.Cliente;
import br.com.baibank.banco.modelo.Conta;
import br.com.baibank.banco.modelo.ContaCorrente;
import br.com.baibank.banco.modelo.GuardadorDeContas;

public class TesteArrayContas {

	public static void main(String[] args) {
		
		GuardadorDeContas guardador = new GuardadorDeContas();
		
		//Clientes
		Cliente cliente03 = new Cliente("Márcia Valentina Rita dos Santos", "379.648.807-21");
		Cliente cliente00 = new Cliente("Heloise Sandra da Rosa", "770.707.020-86");
		
		//Contas Correntes
		ContaCorrente conta00 = new ContaCorrente(11, 785, cliente03);
		ContaCorrente conta01 = new ContaCorrente(11, 785, cliente03);		
		
		//Adicioando contas em guardador
		guardador.adiciona(conta00);
		guardador.adiciona(conta00);
		
		int tamanho = guardador.getQuantidadeDeElementos();
		
		System.out.println(tamanho);
		
		Conta ref = guardador.getReferencia(0);
		
		System.out.println(ref.toString());
		
		
	}
}
