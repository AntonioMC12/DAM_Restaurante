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

public class Cart extends Order {
  private Order order;
  // private List<IProduct> products;

  public Cart(Client client, List<Product> product, double total, LocalDateTime date, String address, boolean delivered,
      boolean payed) {
    super(client, product, total, date, address, delivered, payed);
    // TODO Auto-generated constructor stub
  }

  public boolean addToCart(Product product) {
    boolean result = false;
    if (product != null) {
      super.getProducts().add(product);
      result = true;
    }
    return result;
  }

  public boolean deleteFromCart(Product product) {
    boolean result = false;
    Product dummy = product;
    if (product != null) {
      super.getProducts().remove(dummy);
      result = true;
    }
    return result;
  }

  public boolean deleteFromCart(int id) {
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

  // MIRAR NO TERMINADO
  /**
   * Calcula el total teniendo en cuenta que hace un 10% de desucento si hay
   * productos con bundle.
   * 
   * @return total
   */
  public double calculeTotalPrice() {
    if (super.getProducts().size() > 0) {
      for (int i = 0; i < super.getProducts().size() - 1; i++) {
        for (int x = 0; x < super.getproduct().get(i).getBundlePack().size() - 1; x++) {
          if(super.getProducts().contains(super.getProducts().get(i).getBundlePack().get(x))) {
           super.setTotal(super.getTotal()-super.getTotal()*0.1); 
          }
        }
      }
    }
    return super.getTotal();
  }

  public boolean clearCart() {
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

  public double getTotal() {
    //return calculeTotalPrice();
    return super.getTotal();
  }

  public void setTotal(double total) {
    super.setTotal(total);
  }
  
  public void saveOrder() {
    Order NOrder = new Order(super.getProducts(),super.getTotal(),super.getDate(),super.getAddress(), super.isDelivered(), super.isDelivered());
    RepositoryOrders repositorio = RepositoryOrders.getInstanceRepositoryOrders(null);
    repositorio.getAllOrders().add(NOrder);
  }
}
