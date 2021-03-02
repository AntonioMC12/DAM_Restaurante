package Orders;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


//import Clients.RepositoryClients;
import Interfaces.IClient;
import Interfaces.IOrder;
import Interfaces.IRepositoryOrders;

public class RepositoryOrders implements IRepositoryOrders {

  private List<IOrder> orders;
  private static RepositoryOrders createRepository;
  private List<IOrder> orders;

  public RepositoryOrders(List<IOrder> orders) {
    super();
    this.orders = orders;
  }

  public RepositoryOrders() {
    List<IOrder> orders = new ArrayList<>();
    this.orders = orders;
  }

    
  public static RepositoryOrders getInstanceRepositoryOrders(List<IOrder>orders) {
	  if(createRepository==null) {
		  createRepository=new RepositoryOrders(orders);
	  }
	return createRepository;
  }



  @Override
  public List<IOrder> getAllOrders() {

    return this.orders;
  }

  @Override
  public List<IOrder> getOrdersByClient(IClient cliente) {

    List<IOrder> getOrdersByClient = new ArrayList<>();
    if (cliente != null && orders.size() > 0) {
      for (Iterator<IOrder> iterator = orders.iterator(); iterator.hasNext();) {
        IOrder iOrder = (IOrder) iterator.next();
        if (iOrder.getClient().equals(cliente)) {
          getOrdersByClient.add(iOrder);
        }
      }
    }

    return getOrdersByClient;
  }

  @Override
  public List<IOrder> getOrdersByDate(LocalDateTime initial, LocalDateTime end) {

    List<IOrder> getOrdersByDate = new ArrayList<>();
    if (initial != null && end != null && orders.size() > 0) {
      for (Iterator<IOrder> iterator = orders.iterator(); iterator.hasNext();) {
        IOrder iOrder = (IOrder) iterator.next();
        if (iOrder.getDate().isAfter(initial) && iOrder.getDate().isBefore(end)) {
          getOrdersByDate.add(iOrder);
        }
      }
    }

    return getOrdersByDate;
  }

  @Override
  public List<IOrder> getOrdersNoDelivered() {

    List<IOrder> getOrdersNoDelivered = new ArrayList<>();
    if (orders.size() > 0) {
      for (Iterator<IOrder> iterator = orders.iterator(); iterator.hasNext();) {
        IOrder iOrder = (IOrder) iterator.next();
        if (!iOrder.isDelivered()) {
          getOrdersNoDelivered.add(iOrder);
        }
      }
    }

    return getOrdersNoDelivered;
  }

  @Override
  public List<IOrder> getOrdersNoPayed() {

    List<IOrder> getOrdersNoPayed = new ArrayList<>();
    if (orders.size() > 0) {
      for (Iterator<IOrder> iterator = orders.iterator(); iterator.hasNext();) {
        IOrder iOrder = (IOrder) iterator.next();
        if (!iOrder.isPayed()) {
          getOrdersNoPayed.add(iOrder);
        }
      }
    }

    return getOrdersNoPayed;
  }

  @Override
  public List<IOrder> getOrderPayed() {

    List<IOrder> getOrderPayed = new ArrayList<>();
    if (orders.size() > 0) {
      for (Iterator<IOrder> iterator = orders.iterator(); iterator.hasNext();) {
        IOrder iOrder = (IOrder) iterator.next();
        if (iOrder.isPayed()) {
          getOrderPayed.add(iOrder);
        }
      }
    }

    return getOrderPayed;
  }

  @Override
  public double getAllInput() {

    double getAllInputTotal = 0;

    if (orders.size() > 0) {
      List<IOrder> getAllInput = getOrderPayed();
      for (Iterator<IOrder> iterator = getAllInput.iterator(); iterator.hasNext();) {
        IOrder iOrder = (IOrder) iterator.next();
        getAllInputTotal += iOrder.getTotal();
      }
    }
    return getAllInputTotal;
  }

  @Override
  public double getInputByDate(LocalDateTime initial, LocalDateTime end) {
    
    double getInputByDateTotal = 0;
    if(orders.size() > 0) {
      List<IOrder> getInputByDate = getOrdersByDate(initial,end);
      for (Iterator<IOrder> iterator = getInputByDate.iterator(); iterator.hasNext();) {
        IOrder iOrder = (IOrder) iterator.next();
        if(iOrder.isPayed()) {
          getInputByDateTotal += iOrder.getTotal();
        }
      }
    }    
    return getInputByDateTotal;
  }
}