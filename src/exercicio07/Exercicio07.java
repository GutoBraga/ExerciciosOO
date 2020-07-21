package exercicio07;

public class Exercicio07 {

	public static void main(String[] args) {
		Veiculo veic1 = new Veiculo("Siena",4,50,5);
		Veiculo veic2 = new Veiculo("Uno",4,50,10);
		
		veic1.abastecer(20);
		veic2.abastecer(20);
		
		veic1.exibirAutonomia();
		veic2.exibirAutonomia();

	}

}
