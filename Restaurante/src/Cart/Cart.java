package Cart;

import java.time.LocalDateTime;
import java.util.List;
 
import Clients.Client;
import Interfaces.IProduct;
import Orders.Order;
import Products.Product;
import Products.RepositoryProduct;

public class Cart extends Order{
	private Order order;
	private List<IProduct> products;
	
	public Cart(Client client, List<Product> product, double total, LocalDateTime date, String address,
			boolean delivered, boolean payed) {
		super(client, product, total, date, address, delivered, payed);
		// TODO Auto-generated constructor stub
	}
	
	public boolean addToCart(Product product) {
		  boolean result = false;
		    if (product!= null) {
		    	products.add(product);
		      result = true;
		    }
		    return result;
		
	}
	public boolean deleteFromCart(Product product) {
		 boolean result = false;
		    if (product!= null) {
		    	products.remove(product);
		      result = true;
		    }
		    return result;
	}
	public boolean deleteFromCart(int id) {
		 boolean result = false;
		    if (id!= 0 && products.size()>0
		    		&& products) {
		 	      result = true;
		    }
		    return result;
	}
	public boolean deleteFromCart(String name) {
		return false;
	}
	public double calculeTotalPrice() {
		return 0;
		
	}
	//Terminar
	public boolean clearCart() {
		boolean aux = false; 
		if(order !=null) {
			order.
			aux =true;
		}
		return aux;
	}
	//TERMINAR
	public String selectAddress(Client client) {
		String address = null;
		if(client.getAddress()!=null) {
			address=client.getAddress();
			return address;
		}
		return address;
		
	}
	
	public LocalDateTime timestamp(Order order) {
		LocalDateTime time = null;
		if(order.getDate() !=null) {
			time=order.getDate();
			return time;
		}
		return time ;
		
	}
	public boolean toDeliver() {
		
		
		return false;
	}
	public boolean payOnDelivery() {
		boolean aux=false;
		
		if(this.isPayed()) {
			return aux;
		}
		return aux;
	}
}
