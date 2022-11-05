
public class TestaConexao {

	public static void main(String[] args) {		
		
	/*---------------- Forma antiga e confusa	
	    Conexao con = null;
	    try {
	        con = new Conexao();
	        con.leDados();
	    } catch(IllegalStateException ex) {
	        System.out.println("Deu erro na conexao");
	    } finally {
	        System.out.println("finally");
	        if(con != null) {
	            con.fecha();
	        }
	    }
	 */
		// Mesma coisa que o try com Finally
		try(Conexao conexao = new Conexao())	{
			conexao.leDados();
		} catch (Exception e) {
			System.out.println("Conexão não estabelecida");	
		}
		
	}
}