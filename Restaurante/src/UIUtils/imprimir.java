package UIUtils;

import java.util.List;

import Interfaces.IProduct;
//import Products.Product;

public class imprimir {

  public static void printList(List<IProduct> lista) {
    if (lista != null && lista.size() > 0) {
      for (IProduct object : lista) {
        System.out.print(object);
      }
    }
  }

}
