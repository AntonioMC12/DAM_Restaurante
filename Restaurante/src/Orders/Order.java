package Orders;

import java.time.LocalDateTime;
import java.util.List;

import Clients.Client;
import Interfaces.IOrder;
import Products.Product;

public class Order implements IOrder{

  @Override
  public boolean isDelivered() {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public boolean isPayed() {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public double getTotal() {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public String getAdress() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Client getClient() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public List<Product> getProducts() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public LocalDateTime getDate() {
    // TODO Auto-generated method stub
    return null;
  }

}
