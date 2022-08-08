
public class TestaValores {

	public static void main(String[] args) {
		
		int primeiro = 5;	//primeiro vale 5
		int segundo = 7;	//segundo vale 7
		segundo = primeiro; //atribui o valor atual de primeiro para segundo
		primeiro = 10;		//valor de primeiro passa a ser 10
		System.out.println(segundo);	//5
		System.out.println(primeiro);	//10
		
	}
}
