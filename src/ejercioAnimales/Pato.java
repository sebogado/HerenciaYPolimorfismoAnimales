package ejercioAnimales;

public class Pato extends Animal implements Nadador, Volador, Corredor {

	public Pato(String nombre, Double peso, Integer edad, String especie) {
		super(nombre, peso, edad, especie);
	}

	@Override
	public void correr() {
		System.out.println("No corro tan rapido pero se correr porque soy un pato");
	}

	@Override
	public void nadar() {
		System.out.println("No nado tan rapido pero se nadar porque soy un pato");
	}

	@Override
	public void volar() {
		System.out.println("No vuelo tan bien pero se volar porque soy un pato");
	}
}
