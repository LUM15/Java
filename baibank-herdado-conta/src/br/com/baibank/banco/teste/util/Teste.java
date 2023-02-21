package br.com.baibank.banco.teste.util;

import java.util.ArrayList;

import br.com.baibank.banco.modelo.Cliente;
import br.com.baibank.banco.modelo.Conta;
import br.com.baibank.banco.modelo.ContaCorrente;

public class Teste {

	public static void main(String[] args) {
	
		ArrayList lista = new ArrayList();
		
		//Clientes
		Cliente cliente00 = new Cliente("Heloise Sandra da Rosa", "770.707.020-86");
		Cliente cliente01 = new Cliente("Eloá Amanda Araújo", "861.415.648-01");
		Cliente cliente02 = new Cliente("Rita Alice Alessandra Aragão", "387.431.161-91");
		Cliente cliente03 = new Cliente("Márcia Valentina Rita dos Santos", "379.648.807-21");
		
		//Contas Correntes
		ContaCorrente conta00 = new ContaCorrente(11, 785, cliente03);
		ContaCorrente conta01 = new ContaCorrente(11, 745, cliente00);		
		ContaCorrente conta02 = new ContaCorrente(11, 892, cliente02);
		ContaCorrente conta03 = new ContaCorrente(11, 154, cliente01);		
		
		//Adicioando contas em lista
		lista.add(conta00);
		lista.add(conta01);
		lista.add(conta02);
		lista.add(conta03);
		
		System.out.println("Tamanho: " + lista.size());
		
		Conta ref = (Conta) lista.get(0);
		
		System.out.println(ref.toString());
		
		lista.remove(0);
		
		System.out.println("Tamanho: " + lista.size() + "\n");
		
		//for antigo
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i).toString() + "\n");
		}
		
		System.out.println("--------------------------------------------");
		
		//for novo
		for(Object o : lista) {
			System.out.println(o + "\n");
		}
	}

}
