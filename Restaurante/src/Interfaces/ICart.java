package Interfaces;

import java.time.LocalDateTime;

public interface ICart {
  
  public boolean addToCart(IProduct producto);
  public boolean deleteFromCart(IProduct producto);
  public boolean deleteFromCart(int id);
  public boolean deleteFromCart(String name);
  public double calculateTotalPrice();
  public boolean clearCart();
  public String selectAddress();
  public LocalDateTime timestamp();
  public boolean toDeliver();
  public boolean payOnDelivery();
  public boolean setClient(IClient cliente);
}
