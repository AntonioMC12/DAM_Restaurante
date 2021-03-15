package Interfaces;

import java.util.List;
/**
 * Interfaz del repositorio de productos la cual usaremos para
 *  recordar que metodos tenemos que implementar en nuestra clase.
 */
public interface IRepositoryProduct {

  /**
   * Funcion que devuelve la lista de todos los productos del 
   * repositorio.
   * 
   * @return Lista de todos los productos del repositorio.
   */
  public List<IProduct> getAllProducts();

  /**
   * Funcion que devuelve la lista de todos las bebidas del 
   * repositorio.
   * 
   * @return Lista de todos las bebidas del repositorio.
   */
  public List<IDrink> getAllDrinks();

  /**
   * Funcion que devuelve la lista de todos las comidas del 
   * repositorio.
   * 
   * @return Lista de todos las comidas del repositorio.
   */
  public List<IFood> getAllFoods();

  /**
   * Funcion que devuelve la lista de todos las bebidas no alcoholicas del 
   * repositorio.
   * 
   * @return Lista de todos las bebidas no alcoholicas del repositorio.
   */
  public List<IDrink> getAllNoAlcoholicDrinks();

  /**
   * Funcion que devuelve la lista de todos las bebidas alcoholicas del 
   * repositorio.
   * 
   * @return Lista de todos las bebidas alcoholicas del repositorio.
   */
  public List<IDrink> getAllAlcoholicsDrinks();

  /**
   * Funcion que devuelve la lista de todos las comidas para veganos del 
   * repositorio.
   * 
   * @return Lista de todos las comidas para veganos del repositorio.
   */
  public List<IFood> getAllForVeganFood();

  /**
   * Función que devuelve una lista de productos, que es el bundle pack de
   * un producto que hemos pasado como parámetro.
   * 
   * @param Producto
   * @return BundlePack
   */
  public List<IProduct> getBundleProducts(IProduct Producto);

  /**
   * Busca un producto por nombre y lo devuelve
   * 
   * @param name
   * @return producto
   */
  public IProduct searchProduct(String name);

  /**
   * Busca una bebida por nombre y la devuelve
   * 
   * @param name
   * @return bebida
   */
  public IDrink searchDrinks(String name);

  /**
   * Busca una comida por nombre y la devuelve
   * 
   * @param name
   * @return comida
   */
  public IFood searchFoods(String name);

}
