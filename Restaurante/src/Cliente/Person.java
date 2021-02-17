package Cliente;

/**
 * Clase principal de la que hereda cliente.
 * 
 * @author Abepuoh
 *
 */

public class Person {
	
	protected String name;
	protected String dni;
	private int age;
	
	public Person() {
		this("Desconocido","00000000X",-1);
	}
	

	public Person(String name, String dni, int age) {
		super();
		this.name = name;
		this.dni = dni;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	//Check para quitar
	public void setName(String name) {
		this.name = name;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Usuario con nombre=" + name + ", dni=" + dni + ", edad=" + age + ".";
	}
	
	
	

}
