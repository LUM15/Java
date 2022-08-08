package baibank;

public class Conta {

	double saldo;
	int agencia;
	int numero;
	String titular;
	
	
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
	
	
}
