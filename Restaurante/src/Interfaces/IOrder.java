package Interfaces;

import java.time.LocalDateTime;
import java.util.List;

import Clients.Client;
import Products.Product;

public interface IOrder {
	
	public boolean isDelivered();
	public boolean isPayed();
	public double getTotal();
	public String getAdress();
	public Client getClient(String dni);
	public Client getClient();
	public List<Product> getProducts();
	public LocalDateTime getDate();
	
}
