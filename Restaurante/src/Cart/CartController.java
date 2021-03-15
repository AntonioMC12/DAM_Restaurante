package Cart;

import Menu.auxMenus;
import Products.Drink;
import Products.Food;
import Products.Product;
import Products.ProductController;
import Products.RepositoryProduct;
import UIUtils.introducir;
/**
 * Controller del carrito usado para la gestion de los submenus
 * @author garci
 *
 */
public class CartController {

  
  public static Product addProduct() throws NullPointerException {
	  /**
	   * Clase que devuelve el producto que desea pedir el consumidor
	   * El producto se busca en el repositorio de productos.
	   * @return producto a pedir
	   * @throws NullPointerException
	   */
    boolean valid = false;
    String name = "";
    RepositoryProduct repositorio = RepositoryProduct.instanceRepositoryProduct(null);

    while (!valid) {
      ProductController.printListProduct(repositorio.getAllProducts());
      name = introducir.getString(auxMenus.insertName.getConstante());
      if (repositorio.searchProduct(name) != null) {
        return (Product) repositorio.searchProduct(name);
      } else {
        auxMenus.invalidadParameter.VomitarContastante();
      }
    }
    return null;
  }
  
  public static Product deleteProduct() throws NullPointerException {
	  /**
	   * Metodo que borra un producto del repositorio introducido por un nombre.
	   * @return el producto eliminado
	   * @throws NullPointerException
	   */
    boolean valid = false;
    String name = "";
    RepositoryProduct repositorio = RepositoryProduct.instanceRepositoryProduct(null);

    while (!valid) {
      repositorio.getAllProducts();
      name = introducir.getString(auxMenus.insertName.getConstante());
      if (repositorio.getAllDrinks().contains(new Drink(name)) || repositorio.getAllFoods().contains(new Food(name))) {
        return (Product) repositorio.searchProduct(name);
      } else {
        auxMenus.invalidadParameter.VomitarContastante();
      }
    }
    return null;
  }
  
  public static void printTotal(Cart carrito) {
    System.out.println(carrito.getTotal());
  }
  
}
