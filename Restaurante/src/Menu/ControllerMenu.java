package Menu;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import Cart.Cart;
import Cart.CartController;
import Clients.Client;
import Clients.ClientController;
import Clients.RepositoryClients;
import Orders.OrderController;
import Orders.RepositoryOrders;
import Products.Product;
import Products.ProductController;
import Products.RepositoryProduct;
import UIUtils.introducir;
import UIUtils.utilitys;

public class ControllerMenu {
	/**
	 * Main menu desde el cual llamaremos a los diferentes sub-menus,
	 *  solo tiene un uso organizativo para hacer todo mas sencillo.
	 */
  public static void mainMenu() {

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
      } else {
        auxMenus.invalidadParameter.VomitarContastante();
      }
    }

    switch (option) {
    case 1:
      menuCrearPedido();
      break;
    case 2:
      menuProductos();
      break;
    case 3:
      menuClients();
      break;
    case 4:
      menuOrder();
      break;
    case 5:
      mainMenus.menuExit.VomitarContastante();
      break;

    default:
      auxMenus.invalidadParameter.VomitarContastante();
      break;
    }
  }
  /**
   * Submenu de productos desde el cual se llamara al controller
   *  que realizará todas las operaciones
   */
  public static void menuProductos() {

    RepositoryProduct repositoryProduct = RepositoryProduct.instanceRepositoryProduct(null);

    if (repositoryProduct != null) {
      boolean valid = false;
      int option = 0;

      mainMenus.menuProducts.VomitarContastante();
      utilitys.espera(1000);
      auxMenus.chooseOption.VomitarContastante();

      while (!valid) {
        option = introducir.getInt(null);
        if (option > 0 && option < 6) {
          valid = true;
        } else {
          auxMenus.invalidadParameter.VomitarContastante();
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
        mainMenu();
        break;

      default:
        auxMenus.invalidadParameter.VomitarContastante();
        break;
      }
    }
  }
  /**
   * Submenu de clientes desde el cual se llamara al controller
   *  que realizará todas las operaciones
   */
  public static void menuClients() {

    RepositoryClients repositoryClients = RepositoryClients.getInstanceRepositoryClient(null);
    if (repositoryClients != null) {
      boolean valid = false;
      int option = 0;

      mainMenus.menuClients.VomitarContastante();
      utilitys.espera(1000);
      auxMenus.chooseOption.VomitarContastante();

      while (!valid) {
        option = introducir.getInt(null);
        if (option > 0 && option < 8) {
          valid = true;
        } else {
          auxMenus.invalidadParameter.VomitarContastante();
        }
      }
      switch (option) {
      case 1:
        ClientController.printListClient(repositoryClients.getAllClients());
        introducir.pressAnyKeyToContinue();
        menuClients();
        break;
      case 2:
        ClientController.orderByClient(repositoryClients);
        introducir.pressAnyKeyToContinue();
        menuClients();
        break;
      case 3:
        ClientController.createClient(repositoryClients);
        introducir.pressAnyKeyToContinue();
        menuClients();
        break;
      case 4:
        ClientController.modifyClient(repositoryClients);
        introducir.pressAnyKeyToContinue();
        menuClients();
        break;
      case 5:
        ClientController.ShowPoints(repositoryClients);
        introducir.pressAnyKeyToContinue();
        menuClients();
        break;
      case 6:
        ClientController.printListAddress(repositoryClients.getAllClients());
        introducir.pressAnyKeyToContinue();
        menuClients();
        break;
      case 7:
        mainMenu();
      default:
        auxMenus.invalidadParameter.VomitarContastante();
        break;

      }
    }
  }
  /**
   * Submenu de pedidos desde el cual se llamara al controller
   *  que realizará todas las operaciones
   */
  public static void menuOrder() {

    RepositoryOrders repositoryOrder = RepositoryOrders.getInstanceRepositoryOrders(null);

    if (repositoryOrder != null) {
      boolean valid = false;
      int option = 0;

      mainMenus.menuOrders.VomitarContastante();
      utilitys.espera(1000);
      auxMenus.chooseOption.VomitarContastante();

      while (!valid) {
        option = introducir.getInt(null);
        if (option > 0 && option < 7) {
          valid = true;
        } else {
          auxMenus.invalidadParameter.VomitarContastante();
        }

        switch (option) {
        case 1:
          OrderController.showAllInput(repositoryOrder.getAllInput());
          introducir.pressAnyKeyToContinue();
          menuOrder();
          break;
        case 2:
          OrderController.printNotPayed(repositoryOrder.getOrdersNoPayed());
          introducir.pressAnyKeyToContinue();
          menuOrder();
          break;
        case 3:
          introducir.pressAnyKeyToContinue();
          menuOrder();
          break;
        case 4:
          OrderController.printNotDelivered(repositoryOrder.getOrdersNoDelivered());
          introducir.pressAnyKeyToContinue();
          menuOrder();
          break;
        case 5:
          OrderController.printByDate();
          introducir.pressAnyKeyToContinue();
          menuOrder();
          break;
        case 6:
          mainMenu();
          break;

        default:
          auxMenus.invalidadParameter.VomitarContastante();
          break;
        }
      }
    }
  }
  /**
   * Submenu de crear pedido desde el cual se llamara al controller
   *  que realizará todas las operaciones
   */
  public static void menuCrearPedido() {

    RepositoryClients repositoryClients = RepositoryClients.getInstanceRepositoryClient(null);

    boolean valid = false;
    int option = 0;

    mainMenus.menuPedido.VomitarContastante();
    utilitys.espera(1000);
    auxMenus.chooseOption.VomitarContastante();

    while (!valid) {
      option = introducir.getInt(null);
      if (option > 0 && option < 4) {
        valid = true;
      } else {
        auxMenus.invalidadParameter.VomitarContastante();
      }
    }
    switch (option) {
    case 1:
      ClientController.printListClient(repositoryClients.getAllClients());
      utilitys.espera(1000);
      String dni = introducir.getDni();
      if (ClientController.isInRepository(dni)) {
        menuCarrito((Client) repositoryClients.getAllClients().get(repositoryClients.searchClientByDni(dni)));
      } else {
        auxMenus.invalidadParameter.VomitarContastante();
        menuCrearPedido();
      }

      break;
    case 2:
      menuCarrito(ClientController.createClientReturned(repositoryClients));
      break;

    case 3:
      mainMenu();
      break;

    default:
      auxMenus.invalidadParameter.VomitarContastante();
      break;
    }
  }
  /**
   * Submenu de carrito desde el cual se llamara al controller
   *  que realizará todas las operaciones
   */
  public static void menuCarrito(Client cliente) {

    RepositoryProduct products = RepositoryProduct.instanceRepositoryProduct(null);

    List<Product> lista = new ArrayList<>();
    Cart carrito = new Cart(cliente, lista, 0, LocalDateTime.now(), cliente.getAddress().get(0), false, false);

    boolean valid = false;
    int option = 0;

    mainMenus.menuCarrito.VomitarContastante();
    utilitys.espera(1000);
    auxMenus.chooseOption.VomitarContastante();

    while (!valid) {
      option = introducir.getInt(null);
      if (option > 0 && option < 8) {
        valid = true;
      } else {
        auxMenus.invalidadParameter.VomitarContastante();
      }
    }

    switch (option) {
    case 1:
      ProductController.printListProduct(products.getAllProducts());
      introducir.pressAnyKeyToContinue();
      menuCarrito(cliente);
      break;
    case 2:
      ProductController.showBundleProducts(products);
      introducir.pressAnyKeyToContinue();
      menuCarrito(cliente);
      break;
    case 3:
      carrito.addToCart(CartController.addProduct());
      auxMenus.rightOrder.VomitarContastante();
      introducir.pressAnyKeyToContinue();
      menuCarrito(cliente);
      break;
    case 4:
      if (carrito.deleteFromCart(introducir.getString(auxMenus.insertName.getConstante()))) {
        auxMenus.productoEliminado.VomitarContastante();
      } else {
        auxMenus.invalidadParameter.VomitarContastante();
      }
      introducir.pressAnyKeyToContinue();
      menuCarrito(cliente);
      break;
    case 5:
      CartController.printTotal(carrito);
      introducir.pressAnyKeyToContinue();
      menuCarrito(cliente);
      break;
    case 6:
      menuCrearPedido();
      break;
    case 7:
      menuEntrega(carrito);

    default:
      auxMenus.invalidadParameter.VomitarContastante();
      break;
    }
  }
  /**
   * Submenu llamado menuEntrega que recibe un carrito y
   *  desde el cual se llamara al controller
   *  que realizará todas las operaciones
   */
  public static void menuEntrega(Cart carrito) {

    boolean valid = false;
    int option = 0;

    mainMenus.menuEntrega.VomitarContastante();
    utilitys.espera(1000);
    auxMenus.chooseOption.VomitarContastante();

    while (!valid) {
      option = introducir.getInt(null);
      if (option > 0 && option < 5) {
        valid = true;
      } else {
        auxMenus.invalidadParameter.VomitarContastante();
      }
    }
    switch (option) {
    case 1:
      carrito.setDelivered(true);
      carrito.setPayed(true);
      break;
    case 2:
      menuDomicilio(carrito);
      break;
    case 3:
      menuCarrito(carrito.getclient());
      break;
    case 4:
      auxMenus.rightOrder.VomitarContastante();
      carrito.saveOrder();
      introducir.pressAnyKeyToContinue();
      mainMenu();
      break;

    default:
      break;
    }
  }
  /**
   * Submenu que crea un pedido a domicilio y desde el cual se crea.
   * @param carrito
   */
  public static void menuDomicilio(Cart carrito) {
    boolean valid = false;
    int option = 0;

    mainMenus.menuEntrega.VomitarContastante();
    utilitys.espera(1000);
    auxMenus.chooseOption.VomitarContastante();

    while (!valid) {
      option = introducir.getInt(null);
      if (option > 0 && option < 5) {
        valid = true;
      } else {
        auxMenus.invalidadParameter.VomitarContastante();
      }
    }
    switch (option) {
    case 1:
      carrito.setAddress(introducir.getString(auxMenus.insertAddress.getConstante()));
      auxMenus.rightOrder.VomitarContastante();
      carrito.saveOrder();
      introducir.pressAnyKeyToContinue();
      mainMenu();
      break;
    case 2:
      carrito.setPayed(true);
      auxMenus.rightOrder.VomitarContastante();
      carrito.saveOrder();
      introducir.pressAnyKeyToContinue();
      mainMenu();
      break;
    case 3:
      menuCarrito(carrito.getclient());
      break;
    case 4:
      auxMenus.rightOrder.VomitarContastante();
      carrito.saveOrder();
      introducir.pressAnyKeyToContinue();
      mainMenu();
      break;

    default:
      break;
    }
  }

}
