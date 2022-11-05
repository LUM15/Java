
public class TestaConexao {

	public static void main(String[] args) {

		Conexao c = null;
		
		try {
			//Tenta estabelecer uma conexao com o servidor
			c = new Conexao();
			c.leDados();
			
		} catch (Exception e) {
			//Caso a conexao seja mal sucedida 
			System.out.println("Erro ao tentar realizar a coneção com o servidor.");
			
		} finally {
			//Sempre sera executado
			c.fecha();
		}
		
	}

}
