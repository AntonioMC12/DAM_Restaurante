package productInterfaces;

public interface IProduct {
  
  /**
   * Array de productos que almacena el id de aquellos productos con los 
   * que puede aplicarse un 10% de descuento
   * 
   * @return Array de Product
   */
  public IProduct[] getBundlePack();
  
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
  public boolean getIsForCeliac();
}
