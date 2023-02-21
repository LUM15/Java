package br.com.baibank.banco.teste;

import br.com.baibank.banco.modelo.*;

public class TesteSaca {

	public static void main(String[] args) {

		Cliente cliente01 = new Cliente("Eloá Amanda Araújo", "861.415.648-01");
		Conta conta1 = new ContaCorrente(123, 321, cliente01);

		conta1.deposita(100);

		try {

			conta1.saca(100);

		} catch (Exception e) {

			System.out.println(e.getMessage());

		}

		try {
			conta1.saca(99);
		} catch (SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		}

	}

}
