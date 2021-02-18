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
	
	private List<Client>Clientes;
	private List<Product>Productos;
	private double total;
	private LocalDateTime hPago;
	private String address;
	private boolean delivered;
	private boolean payed;
	
	public Order(List<Client> clientes, List<Product> productos, double total, LocalDateTime hPago, String address,
			boolean delivered, boolean payed) {
		super();
		Clientes = clientes;
		Productos = productos;
		this.total = total;
		this.hPago = hPago;
		this.address = address;
		this.delivered = delivered;
		this.payed = payed;
	}
	
	public List<Client> getClientes() {
		return Clientes;
	}

	public void setClientes(List<Client> clientes) {
		Clientes = clientes;
	}

	public List<Product> getProductos() {
		return Productos;
	}

	public void setProductos(List<Product> productos) {
		Productos = productos;
	}

	public LocalDateTime gethPago() {
		return hPago;
	}

	public void sethPago(LocalDateTime hPago) {
		this.hPago = hPago;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public void setDelivered(boolean delivered) {
		this.delivered = delivered;
	}

	public void setPayed(boolean payed) {
		this.payed = payed;
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
	//CORREGIR
	@Override
	public Client getClient(String dni) {
		return this.getClient(dni);
	}

	@Override
	public List<Product> getProducts() {
		return this.Productos;
	}

	@Override
	public LocalDateTime getDate() {
		return this.hPago;
	}

	@Override
	public List<Client> getClients() {
		return this.Clientes;
		
	}
}
