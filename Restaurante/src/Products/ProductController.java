package Products;

import java.util.List;

import Interfaces.IProduct;
import UIUtils.imprimir;
import UIUtils.introducir;

public class ProductController {

  public void showProducts(List<IProduct> productos) {
    /*
     * SYSO EN ASCII "PRODUCTOS DISPONIBLES"
     * 
     */
    imprimir.printList(productos);
  }

  public void showBundlePack(Product producto) {
    /*
     * SYSO EN ASCII "PRODUCTOS COMPATIBLES PARA OFERTA "
     * 
     */
    imprimir.printList(producto.getBundlePack());
  }

  public void modifyFood(RepositoryProduct repo, String nombre) {
    /**
     * nombre precio forCeliac alcoholic bundlePack
     */
    if (nombre != null && repo != null) {
      Food dummy = new Food(nombre);
      if (repo.getAllFoods().contains(dummy)) {
        int index = repo.getAllFoods().indexOf(dummy);

        System.out.println("¿Quiere modificar el nombre? y/n");
        if (introducir.getChar() == 'y') {
          repo.getAllFoods().get(index).setName(introducir.getString("Introduzca su nuevo nombre: "));
        }
        System.out.println("¿Quiere modificar el precio? y/n");
        if (introducir.getChar() == 'y') {
          repo.getAllFoods().get(index).setPrice(introducir.getDouble("Introduzca su nuevo precio: "));
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

  public void modifyDrink(RepositoryProduct repo, String nombre) {
    /**
     * nombre precio forCeliac alcoholic bundlePack
     */
    if (nombre != null && repo != null) {
      Drink dummy = new Drink(nombre);
      if (repo.getAllDrinks().contains(dummy)) {
        int index = repo.getAllDrinks().indexOf(dummy);

        System.out.println("¿Quiere modificar el nombre? y/n");
        if (introducir.getChar() == 'y') {
          repo.getAllDrinks().get(index).setName(introducir.getString("Introduzca su nuevo nombre: "));
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

    // añadir y quitar del bundle de food y drink

  }

}
