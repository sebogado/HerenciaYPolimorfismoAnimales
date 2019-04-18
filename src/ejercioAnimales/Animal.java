package ejercioAnimales;

public abstract class Animal implements Comedor {
	private String nombre;
	private Double peso;
	private Integer edad;
	private String especie;


	public Animal() {
	}

	public Animal(String nombre, String especie) {
		this.nombre = nombre;
		this.especie = especie;
	}

	public Animal(String nombre, Double peso, Integer edad, String especie) {
		this.nombre = nombre;
		this.peso = peso;
		this.edad = edad;
		this.especie = especie;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public void comer() {
		System.out.println("Como solamente como un animal");
	}

	public void moverse() {
		System.out.println("Me muevo de alguna manera no conocida");
	}

	@Override
	public String toString() {
		return "Animal{" +
				"nombre='" + nombre + '\'' +
				", peso=" + peso +
				", edad=" + edad +
				", especie='" + especie + '\'' +
				'}';
	}

	public void darInfo(){
		System.out.println(toString());
	}
}
