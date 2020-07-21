package exercicio07;

public class Veiculo {
	private String nome;
	private int numeroRodas;
	private double capacidadeTanque;
	private double consumo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumeroRodas() {
		return numeroRodas;
	}
	public void setNumeroRodas(int numeroRodas) {
		this.numeroRodas = numeroRodas;
	}
	public double getCapacidadeTanque() {
		return capacidadeTanque;
	}
	public void setCapacidadeTanque(double capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}
	public double getConsumo() {
		return consumo;
	}
	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}
	
	public Veiculo(String nome, int numeroRodas, double capacidadeTanque, double consumo) {
		this.nome = nome;
		this.numeroRodas = numeroRodas;
		this.capacidadeTanque = capacidadeTanque;
		this.consumo = consumo;
	}
	
	public double abastecer(double qtdCombustivel) {
		return this.capacidadeTanque -= qtdCombustivel;
	}
	
	public void exibirAutonomia() {
		this.consumo = this.consumo * this.capacidadeTanque;
		System.out.println("Nome: " + this.nome + " Capacidade do Tanque(L): " + this.capacidadeTanque + " Autonomia com combustível existente: " + this.consumo);
	}
}
