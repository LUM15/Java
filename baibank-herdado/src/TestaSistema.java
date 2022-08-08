
public class TestaSistema {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setSenha(465);
		
		Administrador a1 = new Administrador();
		a1.setSenha(465);
		
		Cliente c1 = new Cliente();
		c1.setSenha(465);
		
		SistemaInterno s1 = new SistemaInterno();
		s1.autentica(g1);
		s1.autentica(a1);
		s1.autentica(c1);
		
		
	}
}
