
public class Conta {

	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int quantidade;
	
	
	public Conta(int agencia, int numero) {
		Conta.quantidade++;
		this.agencia = agencia;
		this.numero = numero;
	}
	
	public static int getQuantidade() {
		return quantidade;
	}
	
	
	public void deposita(double valor) {
		
		this.saldo += valor;
		
	}
	
	
	public boolean saca(double valor)	{
		if	(saldo >= valor)	{
			this.saldo -= valor;
			return true;	
		}	else	{	
			return false;
		}	
	}
	
	
	public boolean transferir(double valor, Conta conta_destino) {
		//valida se o valor a ser transferido e maior do que o saldo na conta
		if (this.saldo >= valor)	{
			this.saca(valor);	//retira o valor da conta de origen
			conta_destino.deposita(valor);	//deposita o valor na conte de destino
			return true;
		}	
		
		return false;
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
	

	
}


























