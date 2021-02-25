package Cart;

import java.time.LocalDateTime;
import java.util.List;

import Clients.Client;
import Clients.Person;
import Interfaces.IProduct;
import Orders.Order;
import Products.Drink;
import Products.Food;
import Products.Product;
import Products.RepositoryProduct;

public class Cart extends Order {
	private Order order;
	private List<IProduct> products;

	public Cart(Client client, List<Product> product, double total, LocalDateTime date, String address,
			boolean delivered, boolean payed) {
		super(client, product, total, date, address, delivered, payed);
		// TODO Auto-generated constructor stub
	}

	public boolean addToCart(Product product) {
		boolean result = false;
		Product dummy = product;
		if (product != null) {
			products.add(dummy);
			result = true;
		}
		return result;

	}

	public boolean deleteFromCart(Product product) {
		boolean result = false;
		Product dummy = product;
		if (product != null) {
			products.remove(dummy);
			result = true;
		}
		return result;
	}

	public boolean deleteFromCart(int id) {
		boolean delete = false;
		List<Product> dummy;
		dummy = order.getproduct();
		for (Product iProduct : dummy) {
			if (products != null && products.size() > 0 && iProduct.getId() == id) {
				dummy.add(iProduct);
				delete = true;
				return delete;
			}
		}
		return delete;
	}

	public boolean deleteFromCart(String name) {
		boolean delete = false;
		List<Product> dummy;
		dummy = order.getproduct();
		for (IProduct iProduct : dummy) {
			if (products != null && products.size() > 0 && iProduct.getName() == name) {
				dummy.remove(iProduct);
				delete = true;
				return delete;
			}
		}
		return delete;
	}
	//MIRAR NO TERMINADO
	public double calculeTotalPrice() {
		double aux = 0;
		List<Product> dummy;
		if (products != null && products.size() > 0 && order != null) {
			// creo dummy para guardar el order
			dummy = order.getproduct();
			//recorro dummy para ver los products.
			for (IProduct iProduct : dummy) {
				//si iProduct tiene bundle hace descuento 
				if (iProduct.getBundlePack() != null) {
					aux = iProduct.getPrice() * 0.1;
				} else {
					aux = iProduct.getPrice();
				}
			}
		}
		return aux;
	}

	public boolean clearCart() {
		boolean clean = false;
		if (products.size() > 0 && products != null) {
			products.clear();
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
		LocalDateTime time = null;
		Order dummy = order;
		if (dummy.getDate() != null) {
			time = dummy.getDate();
			return time;
		}
		return time;

	}

	public boolean toHaveHere() {
		if (order.isDelivered() == true) {
			return false;
		}
		return true;
	}

	public boolean payOnDelivery() {
		boolean aux = false;

		if (this.isPayed()) {
			return aux;
		}
		return aux;
	}
}
