package exercicio03;

public class Livro {
	private String titulo;
	private String autor;
	private int numeroPaginas;
	
	public String getTitulo() {
		return titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public int getNumeroPaginas() {
		return numeroPaginas;
	}
	
	public Livro(String titulo, String autor, int numeroPaginas) {
		this.titulo = titulo;
		this.autor = autor;
		this.numeroPaginas = numeroPaginas;
	}
	
	public String mostrar() {
		return "Título: " + this.titulo + " Autor: " + this.autor + " Número de Páginas: " + this.numeroPaginas;
	}
	
}
