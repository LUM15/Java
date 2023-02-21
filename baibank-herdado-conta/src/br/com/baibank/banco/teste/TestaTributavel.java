package br.com.baibank.banco.teste;

import br.com.baibank.banco.modelo.*;

public class TestaTributavel {

	public static void main(String[] args) {
		
		Cliente cliente01 = new Cliente("Eloá Amanda Araújo", "861.415.648-01");
		ContaCorrente cc = new ContaCorrente(1, 2, cliente01);
		cc.deposita(50.0);
		
		SeguroDeVida sv = new SeguroDeVida();
		sv.setValorSeguro(1500.0);
		
		CalculadorImposto ci = new CalculadorImposto();
		ci.calcularImposto(sv);
		ci.calcularImposto(cc);
		
		System.out.println(ci.getValorImposto());

		
	}
}
