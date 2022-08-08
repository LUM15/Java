
public class TestaValores {

	public static void main(String[] args) {
		
		Conta conta = new Conta(1337, 2345);
		Conta conta2 = new Conta(1337, 9876);

		System.out.println(conta.getAgencia());
		
		Conta conta3 = new Conta(1337, 4655);
		
		System.out.println("Quantidade de contas criadas " + Conta.getQuantidade());
	}
}
