package exercicio04;

public class Exercicio04 {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario("Gutemberg",24,"Brasília",275234);
		Cliente cliente = new Cliente("Pedro",23,"São José do Rio Preto","45236458725");
		
		System.out.println(funcionario.exibirDados());
		System.out.println(cliente.exibirDados());

	}

}
