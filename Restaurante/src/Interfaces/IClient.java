package Interfaces;

import java.util.List;
/**
 * Interfaz de Clientes la cual usaremos para
 *  recordar que metodos tenemos que implementar en nuestra clase.
 */
public interface IClient extends IPerson{
  /**
   * Metodo para añadir una direccion introducida por nombre
   * @param address
   * @return true o false si se ha añadido la direccion
   */
  boolean addAddress(String address);
  /**
   * Metodo para borrar direccion introducida por nombre
   * @param address
   * @return true o false si se ha eliminado la direccion
   */
  boolean deleteAddress(String address);
  /**
   * 
   * @param pedido
   * @return  true o false si se ha eliminado la direccion
   */
  boolean addOrder(IOrder pedido);
  /**
   * 
   * @param address
   * @return  true o false si se ha eliminado la direccion
   */
  boolean addPoints(int puntos);
  
  List<String> getAddress();
  
  List<IOrder> getOrders();
  /**
   * Metodo que obtiene los puntos
   * @return devuelve los puntos
   */
  int getPoints();
}
