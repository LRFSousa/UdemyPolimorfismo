// Polimorfismo são métodos com mesmo nome, mas ações diferentes.
public class Main {

	public static void main(String[] args) {
		Circulo c1 = new Circulo();
		c1.desenhar();
		
		Quadrado q1 = new Quadrado();
		q1.desenhar();
		
		Poligono p1 = new Poligono();
		p1.desenhar();

	}

}
