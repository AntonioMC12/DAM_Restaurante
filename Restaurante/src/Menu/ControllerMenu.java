package Menu;

import Products.Product;
import Products.ProductController;
import Products.RepositoryProduct;
import UIUtils.introducir;

/**
 * Menu que tiene las herramientas para hacer checks
 * 
 * @author Abepuoh
 *
 */
public class ControllerMenu {

  public static void mainMenu(RepositoryProduct repositoryProduct) {
    if (repositoryProduct != null) {
      
      mainMenus.welcomeMenu.VomitarContastante();
      try {
        Thread.sleep(2500);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
      mainMenus.mainMenu.VomitarContastante();
      try {
        Thread.sleep(3500);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      } 
      
      boolean valid = false;
      int option = 0;
      auxMenus.chooseOption.VomitarContastante();
      while (!valid) {
        option = introducir.getInt(null);
        if (option > 0 && option < 6) {
          valid = true;
        }
      }

      switch (option) {
      case 1:
        // Constantes.menuCreaPedido.VomitarConstastante();
        break;
      case 2:
        menuProductos(repositoryProduct);
        break;
      case 3:
        // Constantes.menuClients.VomitarContastante();
        break;
      case 4:
        // Constantes.menuPedido.VomitarContastante();
        break;
      case 5:
        // exit
        break;

      default:
        auxMenus.invalidadParameter.VomitarContastante();
        break;
      }
    }
  }

  public static void menuProductos(RepositoryProduct repositoryProduct) {
    if (repositoryProduct != null) {
      mainMenus.menuProducts.VomitarContastante();
      boolean valid = false;
      int option = 0;
      auxMenus.chooseOption.VomitarContastante();

      while (!valid) {
        option = introducir.getInt(null);
        if (option > 0 && option < 6) {
          valid = true;
        }
      }

      switch (option) {
      case 1:
        ProductController.showProducts(repositoryProduct.getAllProducts());
        introducir.pressAnyKeyToContinue();
        menuProductos(repositoryProduct);
        break;
      case 2:
        showBundleProducts(repositoryProduct);
        break;
      case 3:
        mainMenu(repositoryProduct);
        break;

      default:
        auxMenus.invalidadParameter.VomitarContastante();
        break;
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
        menuProductos(repositoryProduct);
      }else {
        auxMenus.invalidadParameter.VomitarContastante();
        introducir.pressAnyKeyToContinue();
        menuProductos(repositoryProduct);
      }
    }
  }

}
