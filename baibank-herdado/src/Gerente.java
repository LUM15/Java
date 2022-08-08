//Gerente e uma extensao da classe Funcionario e obedece as regras de contrato Atutenticavel
public class Gerente extends Funcionario implements Autenticavel{
	
	private AutenticacaoUtil autenticador;
	
	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}
	
	@Override
	public boolean autenticacao(int senha) {
		 return this.autenticador.autenticacao(senha);
	}
	
	//super aponta para a classe mae
	//this aponta para dentro desta classe
	public double getBonificacao() { 
		return super.getSalario(); 
	}
}
