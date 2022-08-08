
public class TestaTributavel {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(1, 2);
		cc.deposita(50.0);
		
		SeguroDeVida sv = new SeguroDeVida();
		sv.setValorSeguro(1500.0);
		
		CalculadorImposto ci = new CalculadorImposto();
		ci.calcularImposto(sv);
		ci.calcularImposto(cc);
		
		System.out.println(ci.getValorImposto());

		
	}
}
