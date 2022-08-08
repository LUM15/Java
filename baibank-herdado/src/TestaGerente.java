
public class TestaGerente {
	public static void main(String[] args) {
	
		Gerente g1 = new Gerente();
		g1.setNome("Luis Miguel");
		g1.setCpf("031.949.835-20");
		g1.setSalario(5000.0);
		
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		g1.setSenha(953265);
		boolean autenticado = g1.autenticacao(953265);

		System.out.println(autenticado);
		
		System.out.println(g1.getBonificacao());
		
	}
}
