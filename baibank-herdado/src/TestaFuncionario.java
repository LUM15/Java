
public class TestaFuncionario {

	public static void main(String[] args) {

		Funcionario f1 = new Gerente();
		f1.setNome("Luis");
		f1.setCpf("654.873.184-95");
		f1.setSalario(1700.0);
		
		System.out.println(f1.getNome());
		System.out.println(f1.getBonificacao());
		
		
		
	}

}
