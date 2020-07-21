package exercicio04;

public class Funcionario extends Pessoa {

	private int numeroMatricula;

	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}
	
	public Funcionario(String nome, int idade, String cidadeNascimento, int numeroMatricula) {
		super(nome, idade, cidadeNascimento);
		this.numeroMatricula = numeroMatricula;
	}
	
	@Override
	public String exibirDados() {
		return "Nome: " + this.getNome() + " Idade: " + this.getIdade() + " Cidade Natal: " + this.getCidadeNascimento() +
				" Numero de Matrícula: " + this.numeroMatricula;
	}
}
