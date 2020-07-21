package exercicio04;

public class Pessoa {
	private String nome;
	private int idade;
	private String cidadeNascimento;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCidadeNascimento() {
		return cidadeNascimento;
	}
	public void setCidadeNascimento(String cidadeNascimento) {
		this.cidadeNascimento = cidadeNascimento;
	}
	
	public Pessoa(String nome, int idade, String cidadeNascimento) {
		this.nome = nome;
		this.idade = idade;
		this.cidadeNascimento = cidadeNascimento;
	}
	
	public String exibirDados() {
		return "Nome: " + this.nome + " Idade: " + this.idade + " Cidade Natal: " + this.cidadeNascimento;
	}
}
