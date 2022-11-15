package br.com.baibank.banco.modelo;

public class ContaCorrente extends Conta implements Tributavel {

	private double taxaTransacao = 0.20;
	private double taxaPercentual = 0.03;

	// Esse construtor nao funciona uma vez que
	// os atributos da Classe Conta estao com a
	// visibilidade private
//	public ContaCorrente(int agencia, int numero) {
//		Conta.quantidade++; 
//		super.agencia =  agencia;
//		super.numero = numero;
//	}

	public ContaCorrente(int agencia, int numero) {
//		Apenas a classe mae consegue acessar os atributos
//		sendo assim aqui eu solicito que a Class Conta
//		inicialize o obejto do tipo Conta recebendo
//		agencia e numero
		super(agencia, numero);
	}

	@Override
	public void saca(double valor) throws SaldoInsuficienteException{
		double valorComTaxa = valor + taxaTransacao;
		super.saca(valorComTaxa);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}

	@Override
	public double getValorImposto() {
		return this.taxaPercentual * this.saldo;
	}
}
