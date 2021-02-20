package Interfaces;

import java.time.LocalDateTime;
import java.util.List;

public interface IRepositoryOrders {
  
  public List<IOrder> getAllOrders();
  public List<IOrder> getOrdersByClient(IClient cliente);
  public List<IOrder> getOrdersByDate(LocalDateTime initial, LocalDateTime end);
  public List<IOrder> getOrdersNoDelivered();
  public List<IOrder> getOrdersNoPayed();
  public List<IOrder> getOrderPayed();
  public double getAllInput();
  public double getInputByDate(LocalDateTime initial, LocalDateTime end);
  
  


}


