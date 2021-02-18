package Orders;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import Clients.Client;
import Interfaces.IDrink;
import Interfaces.IOrder;
import Products.Product;

/**
 * En esta clase crearemos los pedidos de los clientes 
 * guardados en el repositorio de los mismos
 *   
 * @author Abepuoh
 *
 */
public class Order implements IOrder{
	
	private Client Cliente;
	private List<Product>Productos;
	private double total;
	private LocalDateTime fPago;
	private String address;
	private boolean delivered;
	private boolean payed;
	
	public Order(Client cliente, List<Product> productos, double total, LocalDateTime fPago, String address,
			boolean delivered, boolean payed) {
		super();
		Cliente = cliente;
		Productos = productos;
		this.total = total;
		this.fPago = fPago;
		this.address = address;
		this.delivered = delivered;
		this.payed = payed;
	}
	
	public Client getClientes() {
		return Cliente;
	}

	public void setClientes(Client clientes) {
		Cliente = clientes;
	}

	public List<Product> getProductos() {
		return Productos;
	}

	public void setProductos(List<Product> productos) {
		Productos = productos;
	}

	public LocalDateTime getfPago() {
		return getfPago();
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public boolean isDelivered() {
		return this.delivered;
	}

	@Override
	public boolean isPayed() {
		return this.payed;
	}

	@Override
	public double getTotal() {
		int total = 0;
		if(Productos.size()>0 && Productos!=null) {
			for (Product Product : Productos) {
				total=total+(int)Product.getPrice();		}
		}
		return total;
	}

	@Override
	public String getAdress() {
		return this.address;
	}

	@Override
	public Client getClient(String dni) {
		
		Client getClientByDni = null;
		Client aux = new Client(dni);

		    if (dni != null && this.Cliente != null) {
		      if (this.Cliente.getDni().equals(aux.getDni())) {
		    	  getClientByDni = aux;
		      }
		    }

		    return getClientByDni;
	}
	@Override
	public List<Product> getProducts() {
		return this.Productos;
	}

	@Override
	public LocalDateTime getDate() {
		return this.fPago;
	}

	@Override
	public Client getClient() {
		
		return this.Cliente;
	}
}
