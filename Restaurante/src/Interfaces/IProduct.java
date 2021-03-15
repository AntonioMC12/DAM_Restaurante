package Interfaces;

import java.util.List;
/**
 * Interfaz de productos la cual usaremos para
 *  recordar que metodos tenemos que implementar en nuestra clase.
 */
public interface IProduct {
  
  /**
   * Array de productos que almacena el id de aquellos productos con los 
   * que puede aplicarse un 10% de descuento
   * 
   * @return ArrayList de Product
   */
  public List<IProduct> getBundlePack();
  
  /**
   * Función que nos permite añadir productos a la lista de los bundle packs
   * 
   * @param producto
   * @return true si lo añade, false si no.
   */
  public boolean addProductBundlePack(IProduct producto);
  
  /**
   * Funcion que borra un producto del BundlePack si lo encuentra.
   * 
   * @param name
   * @return true si lo borra, false si no.
   */
  public boolean deleteProductBundlePack(String name);
  
  /**
   * Devuelve el nombre de un producto
   * 
   * @return nombre del producto
   */
  public String getName();
  
  /**
   * Devuelve el precio de un producto
   * 
   * @return precio de un producto
   */
  public double getPrice();
  
  /**
   * Booleano que si devuelve True es para celiacos y si 
   * devuelve False no lo es.
   * 
   * @return True si es para celiacos, False si no.
   */
  public boolean isForCeliac();
  
  
  /**
   * Sobreescribir el equals para que busque por nombre
   * 
   * @param producto
   * @return true si el igual, false si no.
   */
  public boolean equeals(IProduct producto);
  
  public void setName(String name);
  
  public void setPrice(double precio);
  
  public void setIsCeliac();
}
