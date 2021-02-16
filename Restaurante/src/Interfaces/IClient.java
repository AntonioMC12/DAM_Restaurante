package Interfaces;

import java.util.List;

public interface IClient extends IPerson{
  
  boolean addAddress(String address);

  boolean deleteAddress(String address);

  boolean addOrder(IOrder pedido);

  boolean addPoints(int puntos);

  List<String> getAddress();

  List<IOrder> getOrders();

  int getPoints();
}
