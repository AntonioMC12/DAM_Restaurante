package Menu;

import Orders.RepositoryOrders;
import Products.ProductController;
import Products.RepositoryProduct;
import UIUtils.introducir;
import UIUtils.utilitys;

/**
 * Menu que tiene las herramientas para hacer checks
 * 
 * @author Abepuoh
 *
 */
public class ControllerMenu {

  public static void mainMenu() {

    RepositoryProduct repositoryProduct = RepositoryProduct.instanceRepositoryProduct(null);
    RepositoryOrders repositoryOrder = RepositoryOrders.getInstanceRepositoryOrders(null);

    mainMenus.welcomeMenu.VomitarContastante();

    utilitys.espera(3000);

    mainMenus.mainMenu.VomitarContastante();

    utilitys.espera(3000);

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
      menuProductos();
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

  public static void menuProductos() {

    RepositoryProduct repositoryProduct = RepositoryProduct.instanceRepositoryProduct(null);

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
        menuProductos();
        break;
      case 2:
        ProductController.showBundleProducts(repositoryProduct);
        break;
      case 3:
        // mainMenu(repositoryProduct,repositoryOrder);
        break;

      default:
        auxMenus.invalidadParameter.VomitarContastante();
        break;
      }
    }
  }

  public static void menuOrder() {

    RepositoryOrders repositoryOrder = RepositoryOrders.getInstanceRepositoryOrders(null);

    if (repositoryOrder != null) {
      mainMenus.menuOrders.VomitarContastante();
      boolean valid = false;
      int option = 0;
      auxMenus.chooseOption.VomitarContastante();

      while (!valid) {
        option = introducir.getInt(null);
        if (option > 0 && option < 7) {
          valid = true;
        }

        switch (option) {
        case 1:

          break;
        case 2:

          break;
        case 3:

          break;
        case 4:

          break;
        case 5:

          break;
        case 6:
          // mainMenu(repositoryProduct,repositoryOrder);
          break;

        default:
          auxMenus.invalidadParameter.VomitarContastante();
          break;
        }
      }
    }
  }

}
