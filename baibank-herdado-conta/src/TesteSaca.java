
public class TesteSaca {

	public static void main(String[] args) {

		Conta conta1 = new ContaCorrente(123, 321);

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
