package exercicio05;

public class Lapis {
	private String ehFeitoDe;
	private String escreveCom;
	
	public String getEhFeitoDe() {
		return ehFeitoDe;
	}
	public String getEscreveCom() {
		return escreveCom;
	}
	
	public Lapis() {
		this.ehFeitoDe = "madeira";
		this.escreveCom = "grafite";
	}
	
	public void escrever() {
		System.out.println("Escrevendo com " + this.escreveCom);
	}
}
