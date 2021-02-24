package Cart;

import java.time.LocalDateTime;
import java.util.List;

import Clients.Client;
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

	// check
	public boolean deleteFromCart(int id) {
		Food dummy = new Food();
		Drink dummy1 = new Drink();
		dummy1.setID_COUNTER(id);
		dummy.setID_COUNTER(id);
		if (products != null && products.size() > 0 && products.contains(dummy.getId())) {
			products.remove(dummy);
			return true;
		} else if (products != null && products.size() > 0 && products.contains(dummy1.getId())) {
			products.remove(dummy1);
			return true;
		}

		return false;
	}

	// check
	public boolean deleteFromCart(String name) {
		Food dummy = new Food(name, 0, isDelivered(), products);
		Drink dummy1 = new Drink(name, 0, isDelivered(), products);
		if (products != null && products.size() > 0 && products.contains(dummy.getName())) {
			products.remove(dummy);
			return true;
		} else if (products != null && products.size() > 0 && products.contains(dummy1.getName())) {
			products.remove(dummy1);
			return true;
		}

		return false;
	}

	public double calculeTotalPrice() {

		return 0;

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
