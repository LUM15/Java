
public class TestaGetESet {

	public static void main(String[] args) {
		
		Conta conta = new Conta(1337, 2345678);

		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		//conta.titular = "Paulo";
		paulo.setNome("Luis Miguel");
		
		conta.setTitular(paulo);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programador");
		
		System.out.println(conta.getTitular().getProfissao());
		
	}
}
