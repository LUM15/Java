//Nao se pode criar objetos de classes abstratas
public abstract class Funcionario {

	private String nome;
	private String cpf;
	private double salario;

	//Metodos abstratos nao sao executaveis e nem podem ser 
	//chamados, mas sua implementacao passa a ser obrigatoria
	//para todas as classes filho
	public abstract double getBonificacao();
	
	
	public String getNome() {
		return nome;
	}
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public String getCpf() {
		return cpf;
	}
	
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	public double getSalario() {
		return salario;
	}
	
	
	public void setSalario(double salario) {
		this.salario = salario;
	}

	
	
}
