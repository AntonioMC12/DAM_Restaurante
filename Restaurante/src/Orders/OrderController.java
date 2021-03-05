package Orders;

import java.util.List;

import Interfaces.IOrder;

public class OrderController {
  
  public static void showAllInput(double total) {
    System.out.println("La caja total es ---> "+total);
  }
  
  public static void printNotPayed(List<IOrder> lista) {
    int count = 0;
    int total = 0;
    if (lista != null && lista.size() > 0) {
      for (IOrder object : lista) {
        System.out.print("Las facturas de los pedidos no pagados son: ");
        if(count!=0) {
          System.out.print(", ");
        }
        System.out.print(object.getTotal());
        total += object.getTotal();
        count++;
      }
      System.out.println("El total no pagado asciende a:" + total);
    }
  }
}
