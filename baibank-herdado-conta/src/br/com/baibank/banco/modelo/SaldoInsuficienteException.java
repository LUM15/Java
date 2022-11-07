package br.com.baibank.banco.modelo;

public class SaldoInsuficienteException extends Exception{

	public SaldoInsuficienteException (String message) {
		super(message);
	}
}
