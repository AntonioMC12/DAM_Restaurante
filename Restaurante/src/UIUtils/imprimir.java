package UIUtils;

import java.util.List;

import Interfaces.IProduct;
//import Products.Product;

public class imprimir {

  public static void printList(List<IProduct> lista) {
    int count = 0;
    if (lista != null && lista.size() > 0) {
      for (IProduct object : lista) {
        if(count!=0) {
          System.out.print(", ");
        }
        System.out.print(object.getName());
        count++;
      }
    }
  }

}
