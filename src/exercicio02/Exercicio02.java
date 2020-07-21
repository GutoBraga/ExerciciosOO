package exercicio02;

public class Exercicio02 {

	public static void main(String[] args) {
		Triangulo tri = new Triangulo();
		
		tri.setBase(7.0);
		tri.setAltura(5.0);

		System.out.println(tri.calcularArea());
	}

}
