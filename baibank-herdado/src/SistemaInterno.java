
public class SistemaInterno {

	private int senha = 465;
	
	public void autentica(Autenticavel a)	{
		boolean autenticou = a.autenticacao(this.senha);
		if	(autenticou)	{			
			System.out.println("Pode entrar no sistema!");
		} else {
			System.out.println("Senha inválida!");
		}	
	}
	
	
}
