
public class TestaBanco {

	public static void main(String[] args) {
		
		Cliente paulo = new Cliente();
			paulo.nome = "Paulo Silveira";
			paulo.cpf = "984.841.324-55";
			paulo.profissao = "Programador";
			
		Conta contaPaulo = new Conta();
			contaPaulo.deposita(100);
			contaPaulo.titular = paulo;	//associa o cliente Paulo ao titular da contaPaulo
			
		System.out.println(contaPaulo.titular.nome);
	}
}
