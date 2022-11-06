package teste;

public class TesteSaca {

	public static void main(String[] args) {

		modelo.Conta conta1 = new modelo.ContaCorrente(123, 321);

		conta1.deposita(100);

		try {

			conta1.saca(100);

		} catch (Exception e) {

			System.out.println(e.getMessage());

		}

		try {
			conta1.saca(99);
		} catch (modelo.SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		}

	}

}
