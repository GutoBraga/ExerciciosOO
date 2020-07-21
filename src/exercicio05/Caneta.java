package exercicio05;

public class Caneta {
	private String ehFeitoDe;
	private String escreveCom;
	
	public String getEhFeitoDe() {
		return ehFeitoDe;
	}
	public String getEscreveCom() {
		return escreveCom;
	}
	
	public Caneta() {
		this.ehFeitoDe = "platico";
		this.escreveCom = "tinta";
	}
	
	public void escrever() {
		System.out.println("Escrevendo com " + this.escreveCom);
	}
}
