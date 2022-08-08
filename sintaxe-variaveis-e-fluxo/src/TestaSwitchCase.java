
public class TestaSwitchCase {

	public static void main(String[] args) {

		// Criar fluxo para determinar o mes com base no numero

		int indicaMes = 9;

		switch (indicaMes) {
		// Janeiro
		case 1:
			System.out.println("Se refere ao mes de Janeiro!");
			break;
		// Fevereiro
		case 2:
			System.out.println("Se refere ao mes de Fevereiro!");
			break;
		// Marco
		case 3:
			System.out.println("Se refere ao mes de Marco!");
			break;
		// Abriu
		case 4:
			System.out.println("Se refere ao mes de Abriu!");
			break;
		// Maio
		case 5:
			System.out.println("Se refere ao mes de Maio!");
			break;
		// Junho
		case 6:
			System.out.println("Se refere ao mes de Junho!");
			break;
		// Julho
		case 7:
			System.out.println("Se refere ao mes de Julho!");
			break;
		// Agosto
		case 8:
			System.out.println("Se refere ao mes de Agosto!");
			break;
		// Setembro
		case 9:
			System.out.println("Se refere ao mes de Setembro!");
			break;
		// Outubro
		case 10:
			System.out.println("Se refere ao mes de Outubro!");
			break;
		// Novembro
		case 11:
			System.out.println("Se refere ao mes de Novembro!");
			break;
		// Dezembro
		case 12:
			System.out.println("Se refere ao mes de Dezembro!");
			break;
		default:
			System.out.println("Nao corresponde a uma mes!");
		}

	}
}
