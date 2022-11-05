
public abstract class Conta {

	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int quantidade;
	
	
	public Conta(int agencia, int numero) { 
		Conta.quantidade++; 
		this.agencia =  agencia;
		this.numero = numero;
	}
	 
	
	public static int getQuantidade() {
		return quantidade;
	}
	
	
	public abstract void deposita(double valor);
	
	
	public void saca(double valor) {
		if	(saldo < valor)	{
			throw new SaldoInsuficienteException("Saldo insuficiente!");
		}
		this.saldo -= valor;
	}
	
	
	public void transferir(double valor, Conta conta_destino) {
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
	
	
}


























