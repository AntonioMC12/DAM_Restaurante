package Interfaces;

import java.time.LocalDateTime;
/**
 *  Interfaz de carrito la cual usaremos para
 *  recordar que metodos tenemos que implementar en nuestra clase.
 */
public interface ICart {
 
  public boolean addToCart(IProduct producto);
  /**
   * Metodo que usaremos para añadir un producto al carrito
   * @param producto
   * @return true o false si se ha añadido o no
   */
  public boolean deleteFromCart(IProduct producto);
  /**
   * Metodo que borra un producto que introducimos
   * @param producto
   * @return true o false si se ha añadido o no
   */
  public boolean deleteFromCart(int id);
  /**
   * 
   * @param id
   * @return true o false si se ha añadido o no
   */
  public boolean deleteFromCart(String name);
  /**
   * Metodo que usaremos para borrar un producto del carrito 
   * por el id del mismo
   * @param name
   * @return true o false si se ha añadido o no
   */
  public double calculateTotalPrice();
  /**
   * Metodo que usaremos para borrar un producto del carrito 
   * por el nombre
   * @return true o false si se ha añadido o no
   */
  public boolean clearCart();
  /**
   * Metodo que usaremos para limpiar un carrito
   * @return true o false si se ha borrado el carrito o no
   */
  public String selectAddress();
  /**
   * Metodo para seleccionar direccion
   * @return la direccion seleccionada
   */
  public LocalDateTime timestamp();
  /**
   * Metodo para obtener la hora
   * @param order 
   * @return la fecha
   */
  public boolean toDeliver();
  
  public boolean payOnDelivery();
  /**
   * Metodo que muestra si un pedido se ha pagado o no
   * @return devuelve true o false en funcion de si está pagado o no
   */
  public boolean setClient(IClient cliente);
  /**
   * 
   * @param cliente
   * @return
   */
}
