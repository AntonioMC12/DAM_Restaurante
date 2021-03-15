package Cart;

import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.List;

import Clients.Client;
import Interfaces.IProduct;
import Orders.Order;
import Orders.RepositoryOrders;
import Products.Drink;
import Products.Food;
import Products.Product;

/**
 * Clase carrito donde usaremos todo el resto de clases para crear el
 * funcionamiento troncal del proyecto
 * 
 * @author Abe
 *
 */
public class Cart extends Order {
	private Order order;
	// private List<IProduct> products;

	public Cart(Client client, List<Product> product, double total, LocalDateTime date, String address,
			boolean delivered, boolean payed) {
		super(client, product, total, date, address, delivered, payed);
		// TODO Auto-generated constructor stub
	}

	public boolean addToCart(Product product) {
		/**
		 * Metodo que añade un producto a la clase carrito
		 * 
		 * @param recibe un elemento de la clase carrito
		 * @return true si lo añade.
		 */
		boolean result = false;
		if (product != null) {
			super.getProducts().add(product);
			result = true;
		}
		return result;
	}

	public boolean deleteFromCart(Product product) {
		/**
		 * Metodo que borra un producto de la clase carrito
		 * 
		 * @param recibe un elemento de la clase carrito
		 * @return true si lo borra.
		 */
		boolean result = false;
		Product dummy = product;
		if (product != null) {
			super.getProducts().remove(dummy);
			result = true;
		}
		return result;
	}

	public boolean deleteFromCart(int id) {
		/**
		 * 
		 * @param id que usaremos para determinar un producto y de borrarlo
		 * @return devuelve boleano si se ha borrado el mismo.
		 */
		boolean delete = false;
		List<Product> dummy;
		dummy = order.getproduct();
		for (Product iProduct : dummy) {
			if (super.getProducts() != null && super.getProducts().size() > 0 && iProduct.getId() == id) {
				dummy.add(iProduct);
				delete = true;
				return delete;
			}
		}
		return delete;
	}

	public boolean deleteFromCart(String name) {
		/**
		 * 
		 * @param name que usaremos para determinar un producto y de borrarlo
		 * @return devuelve boleano si se ha borrado el mismo.
		 */
		boolean valid = false;
		if (super.getProducts() != null && super.getProducts().size() > 0) {
			if (super.getProducts().contains(new Drink(name)) || super.getProducts().contains(new Food(name))) {
				for (Iterator<Product> iterator = super.getProducts().iterator(); iterator.hasNext();) {
					IProduct iProduct = (IProduct) iterator.next();
					if (iProduct.getName().equals(name)) {
						iterator.remove();
						valid = true;
					}
				}
			}
		}
		return valid;
	}

	public double calculeTotalPrice() {
		/**
		 * Calcula el total teniendo en cuenta que hace un 10% de desucento si hay
		 * productos con bundle.
		 * 
		 * @return total
		 */
		if (super.getProducts().size() > 0) {
			for (int i = 0; i < super.getProducts().size() - 1; i++) {
				for (int x = 0; x < super.getproduct().get(i).getBundlePack().size() - 1; x++) {
					if (super.getProducts().contains(super.getProducts().get(i).getBundlePack().get(x))) {
						super.setTotal(super.getTotal() - super.getTotal() * 0.1);
					}
				}
			}
		}
		return super.getTotal();
	}

	public boolean clearCart() {
		/**
		 * Metodo que usaremos para limpiar el carrito del pedido
		 * 
		 * @return true si borra el carrito
		 */
		boolean clean = false;
		if (super.getProducts().size() > 0 && super.getProducts() != null) {
			super.getProducts().clear();
			clean = true;
		}
		return clean;
	}

	// TERMINAR EN CONTROLLER
	public String selectAddress(Client client) {
		String address = null;
		if (client.getAddress() != null) {
			// address=client.getAddress();
			return address;
		}
		return address;

	}

	public LocalDateTime timestamp(Order order) {
		/**
		 * Metodo para obtener la hora
		 * 
		 * @param order
		 * @return la fecha
		 */
		LocalDateTime time = null;
		Order dummy = order;
		if (dummy.getDate() != null) {
			time = dummy.getDate();
			return time;
		}
		return time;

	}

	public boolean toHaveHere() {
		/**
		 * Metodo que indica si se va a tomar aqui el pedido o se va a tomar fuera.
		 * 
		 * @return true o false si toma o no.
		 */
		if (order.isDelivered() == true) {
			return false;
		}
		return true;
	}

	public boolean payOnDelivery() {
		/**
		 * Metodo que muestra si un pedido se ha pagado o no
		 * 
		 * @return devuelve true o false en funcion de si está pagado o no
		 */
		boolean aux = false;

		if (this.isPayed()) {
			return aux;
		}
		return aux;
	}

	public double getTotal() {
		// return calculeTotalPrice();
		return super.getTotal();
	}

	public void setTotal(double total) {
		super.setTotal(total);
	}

	public void saveOrder() {
		/**
		 * Metodo que usaremos para guardar el pedido
		 */
		Order NOrder = new Order(super.getProducts(), super.getTotal(), super.getDate(), super.getAddress(),
				super.isDelivered(), super.isDelivered());
		RepositoryOrders repositorio = RepositoryOrders.getInstanceRepositoryOrders(null);
		repositorio.getAllOrders().add(NOrder);
	}
}
