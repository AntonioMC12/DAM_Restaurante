package Interfaces;

import java.util.List;

/**
 * Interfaz de comidas la cual usaremos para
 *  recordar que metodos tenemos que implementar en nuestra clase.
 */
public interface IFood extends IProduct{
  
  public boolean isForVegans();
  /**
   * Metodo de comida que nos indica si la comida es apta para veganos
   * @return true o false si es vegano o no
   */
  public List<IProduct> getBundlePack();
  /**
   * Muestra una lista del bundlePack
   */
  public boolean addProductBundlePack(IProduct producto);
  /**
   * Añade al bundle un producto
   */
  public boolean deleteProductBundlePack(String name);
  /**
   * Borra el bundle de un producto pro el nombre
   */
  public void setIsForVegans();
  /**
   * Metodo que nos permite cambiar si una comida es para veganos o no
   */
  public void setBundlePack(List<IProduct> bundlePack);
  /**
   * Metodo que setea un producto al bundle	 
   * @param bundlePack es una lista de productos
   */
}
