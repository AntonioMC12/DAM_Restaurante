package UIUtils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

import Menu.auxMenus;

public class introducir {
  /**
   * Método que recoje un char por teclado y lo devuelve
   * 
   * @return char
   */
  public static char getChar() {

    Scanner scan = new Scanner(System.in);

    char value = scan.next().charAt(0);

    return value;
  }

  /**
   * Método que devuelve un entero con el previo control de errores, el texto que
   * recibe el método lo imprime por pantalla antes de recoger la variable por
   * teclado.
   * 
   * @param text
   * @return int
   */
  public static int getInt(String text) {

    boolean validNum = true;
    Scanner scan = new Scanner(System.in);
    int num = 0;

    do {
      try {
        // Imprimir.p(text);
        num = scan.nextInt();

        if (num < 0) {
          validNum = true;
          auxMenus.invalidadParameter.VomitarContastante();
        } else {
          validNum = false;
        }

      } catch (InputMismatchException ex) {

        scan.nextLine();
        validNum = true;
        auxMenus.invalidadParameter.VomitarContastante();

      } catch (Exception e) {

        scan.nextLine();
        validNum = true;
        auxMenus.invalidadParameter.VomitarContastante();

      }
    } while (validNum);

    return num;
  }

  /**
   * Método que devuelve un float con el previo control de errores, el texto que
   * recibe el método lo imprime por pantalla antes de recoger la variable por
   * teclado.
   * 
   * @param text
   * @return float
   */
  public static float getFloat(String text) {
    boolean validNum = true;
    Scanner scan = new Scanner(System.in);
    float num = -1;

    do {
      try {
        // Imprimir.p(text);
        num = scan.nextFloat();

        if (num < 0) {
          validNum = true;
          auxMenus.invalidadParameter.VomitarContastante();
        } else {
          validNum = false;
        }

      } catch (InputMismatchException ex) {

        scan.nextLine();
        validNum = true;
        auxMenus.invalidadParameter.VomitarContastante();

      } catch (Exception e) {

        scan.nextLine();
        validNum = true;
        auxMenus.invalidadParameter.VomitarContastante();

      }
    } while (validNum);

    return num;
  }

  /**
   * Método que devuelve un double con el previo control de errores, el texto que
   * recibe el método lo imprime por pantalla antes de recoger la variable por
   * teclado.
   * 
   * @param text
   * @return double
   */
  public static double getDouble(String text) {

    boolean validNum = true;
    Scanner scan = new Scanner(System.in);
    double num = 0;

    do {
      try {
        // Imprimir.p(text);
        num = scan.nextDouble();

        if (num < 0) {
          validNum = true;
          auxMenus.invalidadParameter.VomitarContastante();
        } else {
          validNum = false;
        }

      } catch (InputMismatchException ex) {

        scan.nextLine();
        validNum = true;
        auxMenus.invalidadParameter.VomitarContastante();

      } catch (Exception e) {

        scan.nextLine();
        validNum = true;
        auxMenus.invalidadParameter.VomitarContastante();

      }
    } while (validNum);

    return num;
  }

  /**
   * Método que devuelve un String, el texto que recibe el método lo imprime por
   * pantalla antes de recoger la variable por teclado.
   * 
   * @param text
   * @return String
   */
  public static String getString(String text) {
    Scanner scan = new Scanner(System.in);
    String value;

    System.out.println(text);
    value = scan.next();

    return value;
  }

  /**
   * Este método nos devuelve la edad con un control de errores.
   * 
   * @param text
   * @return edad
   */
  public static int getIntAge(String text) {

    boolean validNum = true;
    Scanner scan = new Scanner(System.in);
    int num = 0;

    do {
      try {
        System.out.println(text);
        num = scan.nextInt();

        if (num < 0) {
          validNum = true;
          auxMenus.invalidadParameter.VomitarContastante();
        } else if (num < 16) {
          validNum = true;
          auxMenus.invalidadParameter.VomitarContastante();
        } else if (num > 99) {
          validNum = true;
          auxMenus.invalidadParameter.VomitarContastante();
        } else {
          validNum = false;
        }

      } catch (InputMismatchException ex) {

        scan.nextLine();
        validNum = true;
        auxMenus.invalidadParameter.VomitarContastante();

      } catch (Exception e) {

        scan.nextLine();
        validNum = true;
        auxMenus.invalidadParameter.VomitarContastante();

      }
    } while (validNum);

    return num;
  }

  static public void pressAnyKeyToContinue() {

    String seguir;
    Scanner teclado = new Scanner(System.in);
    System.out.println("\n\n");
    System.out.println("Press Enter key to continue...");

    try {
      seguir = teclado.nextLine();
    } catch (Exception e) {
      auxMenus.invalidadParameter.VomitarContastante();
    }
  }

  public static LocalDateTime getDate() {
    boolean valid = false;
    String date = "";
    LocalDateTime dateTime = null;
    while (!valid) {
      date = introducir.getString("Inserte la fecha siguiendo el siguiente patrón: YYYY-MM-DD HH:mm:ss");
      if (date.matches("\\d{4}-[1-12]-[1-31] \\d{2}:\\d{2}:\\d{2}")) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        dateTime = LocalDateTime.parse(date, formatter);
      }
    }
    return dateTime;
  }
  
  public static String getDni() {
    boolean valid = false;
    String dni = "";
    while(!valid) {
      dni = getString(Menu.auxMenus.insertDni.getConstante());
      if(!utilitys.validarNIF(dni)) {
        Menu.auxMenus.invalidadParameter.VomitarContastante();
      }else {
        valid = true;
      }
    }
    return dni;
  }
}
