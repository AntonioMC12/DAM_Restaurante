package Menu;

import UIUtils.introducir;

/**
 * Menu que tiene las herramientas para hacer checks
 * 
 * @author Abepuoh
 *
 */
public class ControllerMenu {

  public static void mainMenuOption() {

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

      break;
    case 3:
      mainMenuOption();
      break;

    default:
      auxMenus.invalidadParameter.VomitarContastante();
      break;
    }
  }

}
