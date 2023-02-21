package br.com.baibank.banco.modelo;

/**
 * Classe que representa a moldura de uma conta
 *  
 * @author Luis Miguel
 *
 */


public abstract class Conta {

	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int quantidade;
	
	/**
	 * Construtor para inicializar o objeto Conta a partir da agencia e numero e
	 * Cliente.
	 * @param agencia
	 * @param numero
	 * @param Cliente
	 */
	
	public Conta(int agencia, int numero, Cliente titular) { 
		Conta.quantidade++; 
		this.agencia =  agencia;
		this.numero = numero;
		this.titular = titular;
		
	}
	 
	
	public static int getQuantidade() {
		return quantidade;
	}
	
	
	public abstract void deposita(double valor);
	
	/**
	 * Valor precisa ser maior que o saldo.
	 * 
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */
	
	
	public void saca(double valor) throws SaldoInsuficienteException{
		if	(saldo < valor)	{
			throw new SaldoInsuficienteException("Saldo insuficiente!");
		}
		this.saldo -= valor;
		System.out.println("Saque realizado com sucesso!");
	}
	
	
	public void transferir(double valor, Conta conta_destino) throws SaldoInsuficienteException{
		//Checa se tem saldo suficiente na conta
		this.saca(valor);
		//Essa parte so sera executada se a SaldoInsulficienteException() nao for lancada
		conta_destino.deposita(valor);
	}	
	
	
	public double getSaldo() {
		return this.saldo;
	}

	
	public int getNumero() {		
		return this.numero;
	}
	
	
	public void setNumero(int numero) {
		
		if	(numero <= 0)	{
			
			System.out.println("Valor nao pode ser menor ou igual a zero!");
			return;
		}
		
		this.numero = numero;
	}
	
	
	public int getAgencia() {
		return this.agencia;
	}
	
	
	public void setAgencia(int agencia) {
		
		if	(agencia <= 0)	{
			
			System.out.println("Valor nao pode ser menor ou igual a zero!");
			return;
		}
		
		this.agencia = agencia;
	}
	
	
	public Cliente getTitular() {
		return titular;
	}
	
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public void teste() {
		
		System.out.println("Acessei");
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nAgencia: " + this.getAgencia() +
				"\nConta: " + this.getNumero() + 
				"\nTitular: " + this.getTitular().getNome();
	}
	
}


























