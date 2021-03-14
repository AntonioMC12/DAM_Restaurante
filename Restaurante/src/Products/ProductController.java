package Products;

import java.util.List;

import Interfaces.IProduct;
import Menu.auxMenus;
import Menu.ControllerMenu;
import UIUtils.introducir;

public class ProductController {
  
  
  public static void showProducts(List<IProduct> productos) {
    /*
     * SYSO EN ASCII "PRODUCTOS DISPONIBLES"
     * 
     */
    printListProduct(productos);
  }

  public static void showBundlePack(Product producto) {
    /*
     * SYSO EN ASCII "PRODUCTOS COMPATIBLES PARA OFERTA "
     * 
     */
    printListProduct(producto.getBundlePack());
  }

  public static void modifyFood(RepositoryProduct repo, String nombre) {
    /**
     * nombre precio forCeliac alcoholic bundlePack
     */
    if (nombre != null && repo != null) {
      Food dummy = new Food(nombre);
      if (repo.getAllFoods().contains(dummy)) {
        int index = repo.getAllFoods().indexOf(dummy);

        System.out.println("¿Quiere modificar el nombre? y/n");
        if (introducir.getChar() == 'y') {
          repo.getAllFoods().get(index).setName(introducir.getString(Menu.auxMenus.insertName.getConstante()));
        }
        System.out.println("¿Quiere modificar el precio? y/n");
        if (introducir.getChar() == 'y') {
          repo.getAllFoods().get(index).setPrice(introducir.getDouble(Menu.auxMenus.insertPrice.getConstante()));
        }
        System.out.println("¿Quiere modificar el estado de Celiaco? y/n");
        if (introducir.getChar() == 'y') {
          repo.getAllFoods().get(index).setIsCeliac();
        }
        System.out.println("¿Quiere modificar si es para veganos? y/n");
        if (introducir.getChar() == 'y') {
          repo.getAllFoods().get(index).setIsForVegans();
        }
      }
    }
  }

  public static void modifyDrink(RepositoryProduct repo, String nombre) {
    /**
     * nombre precio forCeliac alcoholic bundlePack
     */
    if (nombre != null && repo != null) {
      Drink dummy = new Drink(nombre);
      if (repo.getAllDrinks().contains(dummy)) {
        int index = repo.getAllDrinks().indexOf(dummy);

        System.out.println("¿Quiere modificar el nombre? y/n");
        if (introducir.getChar() == 'y') {
          repo.getAllDrinks().get(index).setName(introducir.getString(Menu.auxMenus.insertName.getConstante()));
        }
        System.out.println("¿Quiere modificar el precio? y/n");
        if (introducir.getChar() == 'y') {
          repo.getAllDrinks().get(index).setPrice(introducir.getDouble("Introduzca su nuevo precio: "));
        }
        System.out.println("¿Quiere modificar el estado de Celiaco? y/n");
        if (introducir.getChar() == 'y') {
          repo.getAllDrinks().get(index).setIsCeliac();
        }
        System.out.println("¿Quiere modificar si es alcoholica? y/n");
        if (introducir.getChar() == 'y') {
          repo.getAllDrinks().get(index).setIsAlcoholic();
        }
      }
    }
  }
  
  public static void showBundleProducts(RepositoryProduct repositoryProduct) {

    if (repositoryProduct != null) {
      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
      ProductController.showProducts(repositoryProduct.getAllProducts());
      System.out.println("\n\n");
      auxMenus.insertName.VomitarContastante();
      String nombreProducto = introducir.getString(null);
      if(repositoryProduct.searchProduct(nombreProducto) != null) {
        ProductController.showBundlePack((Product) repositoryProduct.searchProduct(nombreProducto));
        introducir.pressAnyKeyToContinue();
        ControllerMenu.menuProductos();
      }else {
        auxMenus.invalidadParameter.VomitarContastante();
        introducir.pressAnyKeyToContinue();
        ControllerMenu.menuProductos();
      }
    }
  }
  
  public static void printListProduct(List<IProduct> lista) {
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
  
  /*
  public void addProductToBundle() {
    System.out.println("Introduzca el producto que desea modificar");
  }
  */

}
