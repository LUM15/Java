package concessionaria;

public class Carro {

	private int ano;
	private String modelo;
	private double preco;
	
	
	public Carro(int ano, String modelo, double preco) {
		//valida ano
		if	(ano >= 1891)	{
			this.ano = ano;
		}	else	{
			System.out.println("O ano informado esta invalido. Por isso usaremos 2017!");
            this.ano = 2017;
		}
		
		//valida modelo
		if	(modelo != null)	{
            this.modelo = modelo;
        }	else	{
            System.out.println("O modelo nao foi informado. Por isso usaremos Gol!");
            this.modelo = "Gol";
        }
		
		//valida preco
		if	(preco > 0)	{
            this.preco = preco;
        }	else	{
            System.out.println("O preço nao e valido. Por isso usaremos 40000.0!");
            this.preco = 40000.0;
        }    
	}

	//criar objeto: intanciar, inicializar e atribuir valores.	
	//permite criar um objeto sem informar o ano.
	public Carro(String modelo, double preco){
	    //chamando o construtor que recebe String e double.
	        this(0, modelo, preco);
	}
	
	//permite criar um objeto sem informar o modelo.
	public Carro(int ano, double preco){
	    //chamando o construtor que recebe int e double.
	        this(ano, null, preco);
	}
	
	
    
	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
}
