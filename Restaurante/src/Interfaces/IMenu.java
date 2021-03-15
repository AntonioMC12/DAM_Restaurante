package Interfaces;

/**
 * Interfaz del Menu la cual usaremos para
 *  recordar que metodos tenemos que implementar en nuestra clase.
 */
public interface IMenu {
	
  public void welcomeMenu();
  /**
   *  Metodo que solo muestra syso de bienvenida	
   */
  public void chooseMenu();
  /**
   * Metodo que nos da la opcion de que menu vamos a escoger
   */
  public void registerClient();
  /**
   * Metodo que registra un cliente nuevo
   */
  public void deleteClient();
  /**
   * Metodo que borra un cliente
   */
  public void updateClient();
  /**
   * Metodo que nos permite updatear un cliente con datos nuevos
   */
  public void searchClient();
  /**
   * Metodo que nos permite buscar un cliente
   */
  public void showDrinks();
  /**
   * Metodo que muestra todas la bebidas que hay disponibles
   */
  public void ShowDishes();
  /**
   * Metodo que muestras las comidas o platos disponibles
   */
  public void ShowCombos();
  /**
   * Metodo que muestra las ofertas disponibles
   */
}
