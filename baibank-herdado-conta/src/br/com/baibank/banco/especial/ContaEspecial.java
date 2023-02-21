package br.com.baibank.banco.especial;

import br.com.baibank.banco.modelo.Cliente;
import br.com.baibank.banco.modelo.Conta;

public class ContaEspecial extends Conta {

	public ContaEspecial(int agencia, int numero, Cliente titular) {
		super(agencia, numero, titular);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor; 

	}

}
