package ejercioAnimales;

public class Pez extends Animal implements Nadador {
	public Pez(String nombre, Double peso, Integer edad, String especie) {
		super(nombre, peso, edad, especie);
	}

	@Override
	public void nadar() {
		System.out.println("Yo nado rapido porque soy un pez");
	}
}
