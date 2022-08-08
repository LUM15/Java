
public class TestaReferencias {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Marcos");
		g1.setSalario(5000.0);
		
		EditorVideo ev = new EditorVideo();
		ev.setSalario(2500.0);
		
		Designer d1 = new Designer();
		d1.setSalario(2000.0);
		
		ControlaBonificacao b1 = new ControlaBonificacao();
		b1.registra(g1);
		b1.registra(ev);
		b1.registra(d1);
		
		System.out.println(b1.getSoma());

		
	}
}
