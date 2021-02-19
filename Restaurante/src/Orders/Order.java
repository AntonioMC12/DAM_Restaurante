package Orders;

import java.time.LocalDateTime;
import java.util.List;

import Clients.Client;
import Interfaces.IOrder;
import Products.Product;

/**
 * En esta clase crearemos los pedidos de los client guardados en el repositorio
 * de los mismos
 * 
 * @author Abepuoh
 *
 */
public class Order implements IOrder {

  private Client client;
  private List<Product> product;
  private double total;
  private LocalDateTime date;
  private String address;
  private boolean delivered;
  private boolean payed;

  public Order(Client client, List<Product> product, double total, LocalDateTime date, String address,
      boolean delivered, boolean payed) {
    super();
    this.client = client;
    this.product = product;
    this.total = total;
    this.date = date;
    this.address = address;
    this.delivered = delivered;
    this.payed = payed;
  }
  
  public Order(List<Product> product, double total, LocalDateTime date, String address,
      boolean delivered, boolean payed) {
    super();
    this.client = new Client("");
    this.product = product;
    this.total = total;
    this.date = date;
    this.address = address;
    this.delivered = delivered;
    this.payed = payed;
  }

  public Client getclient() {
    return client;
  }

  public void setclient(Client client) {
    this.client = client;
  }

  public List<Product> getproduct() {
    return product;
  }

  public void setproduct(List<Product> product) {
    this.product = product;
  }

  public LocalDateTime getdate() {
    return date;
  }

  public void setdate(LocalDateTime date) {
    this.date = date;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public void setTotal(double total) {
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
    if (product != null && product.size() > 0) {
      for (Product Product : product) {
        this.total += Product.getPrice();
      }
    }
    return this.total;
  }

  @Override
  public String getAdress() {
    return this.address;
  }

  @Override
  public List<Product> getProducts() {
    return this.product;
  }

  @Override
  public LocalDateTime getDate() {
    return this.date;
  }

  @Override
  public Client getClient() {
    // TODO Auto-generated method stub
    return this.client;
  }
}