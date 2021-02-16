package Clients;

/**
 * Clase principal de la que hereda cliente.
 * 
 * @author Abepuoh
 *
 */
public class Person {

  private String dni;
  private String name;
  private int age;

  public Person(String dni, String name, int age) {
    super();
    this.dni = dni;
    this.name = name;
    this.age = age;
  }

  public String getDni() {
    return dni;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Person other = (Person) obj;
    if (dni == null) {
      if (other.dni != null)
        return false;
    } else if (!dni.equals(other.dni))
      return false;
    return true;
  }
  
  

}
