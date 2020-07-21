package exercicio05;

public class PenaMosquito {
	private String ehFeitoDe;
	private String escreveCom;
	
	public String getEhFeitoDe() {
		return ehFeitoDe;
	}
	public String getEscreveCom() {
		return escreveCom;
	}
	
	public PenaMosquito() {
		this.ehFeitoDe = "metal";
		this.escreveCom = "nanquin";
	}
	
	public void escrever() {
		System.out.println("Escrevendo com " + this.escreveCom);
	}
}
