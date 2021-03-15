package Interfaces;

import java.time.LocalDateTime;
import java.util.List;
/**
 * Interfaz del repositorio de pedidos la cual usaremos para
 *  recordar que metodos tenemos que implementar en nuestra clase.
 */
public interface IRepositoryOrders {
  
  /**
   * Devuelve una lista con todos los pedidos
   * 
   * @return lista con todos los pedidos
   */
  public List<IOrder> getAllOrders();
  
  /**
   * Obtiene los pedidos filtrados por un cliente
   * 
   * @param cliente
   * @return pedidos filtrados por cliente
   */
  public List<IOrder> getOrdersByClient(IClient cliente);
  
  /**
   * Obtiene los pedidos filtrados por fecha
   * 
   * @param initial
   * @param end
   * @return lista de pedidos filtrados por fecha
   */
  public List<IOrder> getOrdersByDate(LocalDateTime initial, LocalDateTime end);
  
  /**
   * Devuelve una lista de pedidos que no han sido entregados
   * 
   * @return lista de pedidos no entregados
   */
  public List<IOrder> getOrdersNoDelivered();
  
  /**
   * Devuelve una lista de pedidos que no han sido pagados
   * 
   * @return lista de pedidos no pagados
   */
  public List<IOrder> getOrdersNoPayed();
  
  /**
   * Devuelve una lista de pedidos que han sido pagados
   * 
   * @return lista de pedidos pagados
   */
  public List<IOrder> getOrderPayed();
  
  /**
   * Devuelve la suma total del monto de los pedidos.
   * 
   * @return la caja total
   */
  public double getAllInput();
  
  /**
   * Devuelve el monto total filtrado por fecha
   * 
   * @param initial
   * @param end
   * @return
   */
  public double getInputByDate(LocalDateTime initial, LocalDateTime end);
  
  


}


