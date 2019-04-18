package ejercioAnimales;

public class Perro extends Animal implements Corredor, Nadador{

	public Perro(String nombre, Double peso, Integer edad, String especie) {
		super(nombre, peso, edad, especie);
	}

	@Override
	public String getEspecie() {
		return "Soy un perro";
	}

	@Override
	public void moverse() {
		System.out.println("Yo camino con mis cuatro patas");
	}

	@Override
	public void correr() {
		System.out.println("Corro rapido porque soy un perro");
	}

	@Override
	public void nadar() {
		System.out.println("Nado no tan rapido porque soy un perro");
	}

	@Override
	public void comer() {
		System.out.println("Como mucha comida porque soy un perro");
	}
}
