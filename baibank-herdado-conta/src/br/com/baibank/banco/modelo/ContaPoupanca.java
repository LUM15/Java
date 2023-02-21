package br.com.baibank.banco.modelo;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(int agencia, int numero, Cliente titular) {	
		super(agencia, numero, titular);		
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Conta Poupança " + super.toString();
	}
}
