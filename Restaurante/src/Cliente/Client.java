package Cliente;
/**
 * Clase principal para la cual heredamos de la clase persona la usaremos para 
 * todas las operaciones del repositorio de clientes.
 * 
 * @author Abepuoh
 */
import java.util.List;

import Products.Product;

public class Client extends Person {
	private List<String>direction;
	private List<Order>Orders;
	private int points;
	
	public Client(List<String> direccion) {
		super();
		this.direction = direccion;
		//this.Orders=new List<Order> order;
		//this.points = points;
	}
	
	public List<String> getDirection() {
		return direction;
	}
	public void setDirection(List<String> direccion) {
		this.direction = direccion;
	}
	public List<Order> getOrders() {
		return Orders;
	}
	public void setPedidos(List<Order> Orders) {
		this.pedidos = pedidos;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	
	@Override
	  public boolean equals(Object o) {
	    boolean result = false;
	    if (this == o) {
	      result = true;
	    } else if (o instanceof Client) {
	      Client a = (Client) o;
	      String n = a.getDni();
	      if (this.dni.equals(o)) {
	        result = true;
	      }
	    }
	    return result;
	  }
	public int getpoints() {

	}
}
