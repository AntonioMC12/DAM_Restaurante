package Interfaces;

import java.util.List;

/**
 * Interfaz de Bebidas la cual usaremos para
 *  recordar que metodos tenemos que implementar en nuestra clase.
 */
public interface IDrink extends IProduct{
	/**
	 * Metodo para determinar si una bebida es alcholica
	 * @return boleano de si es alcoholico o no
	 */
  public boolean isAlcoholic();
  /**
   * Metodo bundlepack usado para obtener descuentos
   */
  public List<IProduct> getBundlePack();
 /**
  * Metodo para añadir un producto al bundle
  */
  public boolean addProductBundlePack(IProduct producto);
  /**
   * Metodo para borra un producto del bundle identificado por el nombre
   */
  public boolean deleteProductBundlePack(String name);
 
  public void setIsAlcoholic();
}
