package Orders;

import java.time.LocalDateTime;
import java.util.List;

import Interfaces.IOrder;
import UIUtils.introducir;

public class OrderController {

  public static void showAllInput(double total) {
    System.out.println("La caja total es ---> " + total);
  }
  
  public static void printList(List<IOrder> lista) {
    if(lista != null && lista.size()>0) {
      for (IOrder iOrder : lista) {
        System.out.println(iOrder.toString());
      }
    }
  }
  public static void printNotPayed(List<IOrder> lista) {
    int count = 0;
    int total = 0;
    if (lista != null && lista.size() > 0) {
      System.out.print("Las facturas de los pedidos no pagados son: ");
      for (IOrder object : lista) {
        if (count != 0) {
          System.out.print(", ");
        }
        System.out.print(object.getTotal());
        total += object.getTotal();
        count++;
      }
      System.out.println("El total no pagado asciende a:" + total);
    }
  }

  public static void printNotDelivered(List<IOrder> lista) {
    if (lista != null && lista.size() > 0) {
      System.out.println("Las facturas de pedidos no entregados son: ");
      for (IOrder iOrder : lista) {
        if (!iOrder.isDelivered()) {
          System.out.println(iOrder.toString());
        }
      }
    }
  }
  
  public static void printByDate() {
    
    RepositoryOrders repositoryOrder = RepositoryOrders.getInstanceRepositoryOrders(null);
    
    LocalDateTime dateInicio = introducir.getDate();
    LocalDateTime dateFin = introducir.getDate();
    System.out.println("Los pedidos en las fechas introducidas son: ");
    printList(repositoryOrder.getOrdersByDate(dateInicio, dateFin));
  }
}
