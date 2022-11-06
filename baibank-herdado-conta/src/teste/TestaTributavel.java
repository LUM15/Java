package teste;

public class TestaTributavel {

	public static void main(String[] args) {
		
		modelo.ContaCorrente cc = new modelo.ContaCorrente(1, 2);
		cc.deposita(50.0);
		
		modelo.SeguroDeVida sv = new modelo.SeguroDeVida();
		sv.setValorSeguro(1500.0);
		
		modelo.CalculadorImposto ci = new modelo.CalculadorImposto();
		ci.calcularImposto(sv);
		ci.calcularImposto(cc);
		
		System.out.println(ci.getValorImposto());

		
	}
}
