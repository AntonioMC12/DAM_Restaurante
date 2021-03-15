package Interfaces;

import java.time.LocalDateTime;
import java.util.List;

import Clients.Client;
import Products.Product;

/**
 * Interfaz de pedido la cual usaremos para recordar que metodos tenemos que
 * implementar en nuestra clase.
 */
public interface IOrder {
	
	public boolean isDelivered();
	/**
	 * Metodo que nos indica si un pedido esta enviado o no
	 * @return true o false si esta entregado o no
	 */
	public boolean isPayed();
	/**
	 * Metodo que nos indica si un pedido esta pagado o no
	 * @return devuelve si esta pagado o no con true o false
	 */
	public double getTotal();
	/**
	 * Metodo que devuelve el gasto total del pedido
	 * @return devuelve el total del pedido
	 */
	public String getAdress();
	/**
	 * Metodo que nos da una o mas direcciones
	 * @return devuelve una/s direcciones
	 */
	public Client getClient();
	/**
	 * Metodo que devuelve un cliente.
	 * @return devuelve un cliente
	 */
	public List<Product> getProducts();
	/**
	 * Metodo que nos devuelve una lista con todos los productos disponibles
	 * @return una lista de productos
	 */
	public LocalDateTime getDate();
	/**
	 * Metodo que nos muestra la fecha
	 */
}