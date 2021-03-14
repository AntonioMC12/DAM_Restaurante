package Clients;

import java.util.ArrayList;
import java.util.List;

import Interfaces.IClient;
import Interfaces.IOrder;
//import Products.Product;

/**
 * Clase principal para la cual heredamos de la clase persona la usaremos para
 * todas las operaciones del repositorio de clientes.
 * 
 * @author Abepuoh
 */
public class Client extends Person implements IClient {

  private List<String> address;
  private List<IOrder> orders;
  private int points;

  public Client(String dni, String name, int age, List<String> address, List<IOrder> orders, int points) {
    super(dni, name, age);
    this.address = address;
    this.orders = orders;
    this.points = points;
  }

  public Client(String dni) {
    super(dni, "", 0);
    List<String> address1 = new ArrayList<>();
    List<IOrder> orders1 = new ArrayList<>();
    this.address = address1;
    this.orders = orders1;
    this.points = 0;

  }

  @Override
  public boolean addAddress(String address) {
    boolean addAddress = false;

    if (!this.address.contains(address)) {
      this.address.add(address);
      addAddress = true;
    }
    return addAddress;
  }

  @Override
  public boolean deleteAddress(String address) {
    boolean result = false;
    if (this.address.contains(address)) {
      this.address.remove(address.indexOf(address));
      result = true;
    }
    return result;
  }

  @Override
  public boolean addOrder(IOrder pedido) {
    boolean addOrder = false;

    if (!this.orders.contains(pedido)) {
      this.orders.add(pedido);
      addOrder = true;

    }
    return addOrder;
  }

  @Override
  public boolean addPoints(int puntos) {
    boolean addPoints = false;
    if (puntos > 0) {
      this.points += puntos;
    }
    return addPoints;
  }

  @Override
  public List<String> getAddress() {

    return this.address;
  }

  @Override
  public List<IOrder> getOrders() {

    return this.orders;
  }

  @Override
  public int getPoints() {

    return this.points;
  }
}
