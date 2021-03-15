package Interfaces;
/**
 * Interfaz de persona la cual usaremos para
 *  recordar que metodos tenemos que implementar en nuestra clase.
 */
public interface IPerson {

  /**
   * Devuelve el dni de la persona
   * 
   * @return dni
   */
  public String getDni();

  /**
   * Devuelve el nombre de la persona
   * 
   * @return nombre
   */
  public String getName();

  /**
   * Devuelve la edad de la persona
   * 
   * @return edad
   */
  public int getAge();
  

  /**
   * Actualiza el nombre de la persona
   * 
   * @param name
   */
  public void setName(String name);
  
  /**
   * Actualiza el dni de la persona
   * 
   * @param name
   */
  public void setDni(String dni);
  
  /**
   * Actualiza la edad de la persona
   * @param age
   */
  public void setAge(int age);

}
