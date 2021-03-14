package Clients;

import java.util.ArrayList;
import java.util.List;

import Interfaces.IClient;
import Interfaces.IOrder;
import UIUtils.introducir;

public class ClientController {

  // Llamada al metodo de mostrar clientes.
  public static void ShowClients(List<IClient> Clientes) {
    printListClient(Clientes);
  }

  public static void createClient(RepositoryClients repo) {
    boolean valid = false;
    String name = "";
    String dni = "";
    int age = 0;
    int points = 0;
    List<String> addresses = new ArrayList<>();
    List<IOrder> orders = new ArrayList<>();

    name = introducir.getString(Menu.auxMenus.insertName.getConstante());
    while (!valid) {
      dni = introducir.getDni();
      Client dummy = new Client(dni);
      if(!repo.getAllClients().contains(dummy)) {
        valid = true;
      }else {
        System.out.println("El dni ya está en nuestra base de datos...");
      }
    }
    age = introducir.getIntAge(Menu.auxMenus.insertAge.getConstante());
    String address = introducir.getString(Menu.auxMenus.insertAddress.getConstante());
    addresses.add(address);

    Client cliente = new Client(dni, name, age, addresses, orders, points);
    repo.addClient(cliente);
    System.out.println("¡¡Cliente introducido con éxito!!");
  }
  
  public static Client createClientReturned(RepositoryClients repo) {
    boolean valid = false;
    String name = "";
    String dni = "";
    int age = 0;
    int points = 0;
    List<String> addresses = new ArrayList<>();
    List<IOrder> orders = new ArrayList<>();
    Client cliente = null;

    name = introducir.getString(Menu.auxMenus.insertName.getConstante());
    while (!valid) {
      dni = introducir.getDni();
      Client dummy = new Client(dni);
      if(!repo.getAllClients().contains(dummy)) {
        valid = true;
      }else {
        System.out.println("El dni ya está en nuestra base de datos...");
      }
    }
    age = introducir.getIntAge(Menu.auxMenus.insertAge.getConstante());
    String address = introducir.getString(Menu.auxMenus.insertAddress.getConstante());
    addresses.add(address);

    cliente = new Client(dni, name, age, addresses, orders, points);
    repo.addClient(cliente);
    System.out.println("¡¡Cliente introducido con éxito!!");
    return cliente;
  }

  public static void orderByClient(RepositoryClients repo) {
    String dni = introducir.getDni();
    if (dni != null && repo != null) {
      Client dummy = new Client(dni);
      if (repo.getAllClients().contains(dummy)) {
        System.out.println(dummy.getOrders());
      }
    }
  }

  public static void modifyClient(RepositoryClients repo) {
    String dni = introducir.getDni();
    if (dni != null && repo != null) {
      Client dummy = new Client(dni);
      if (repo.getAllClients().contains(dummy)) {
        int index = repo.getAllClients().indexOf(dummy);

        System.out.println("¿Quiere modificar el nombre? y/n");
        if (introducir.getChar() == 'y') {
          repo.getAllClients().get(index).setName(introducir.getString("Introduzca su nuevo nombre: "));
        }
        System.out.println("¿Quiere modificar el dni? y/n");
        if (introducir.getChar() == 'y') {
          repo.getAllClients().get(index).setDni(introducir.getString("Introduzca su nuevo dni: "));
        }
        System.out.println("¿Quiere modificar la Edad? y/n");
        if (introducir.getChar() == 'y') {
          repo.getAllClients().get(index).setAge(introducir.getInt("Introduzca la nueva edad: "));
        }
        System.out.println("¿Quiere modificar la direccion? y/n");
        if (introducir.getChar() == 'y') {
          repo.getAllClients().get(index).addAddress(introducir.getString("Introduzca la nueva direccion: "));
        }
      }
    }
  }

  public static void ShowPoints(RepositoryClients repo) {
    String dni = introducir.getDni();
    if (dni != null && repo != null) {
      Client dummy = new Client(dni);
      if (repo.getAllClients().contains(dummy)) {
        System.out.println(dummy.getPoints());
      }else {
        Menu.auxMenus.invalidadParameter.VomitarContastante();
      }

    }
  }

  public static void ClientsAddress(List<IClient> address) {
    printListClient(address);
  }

  /**
   * Metodo que recorre la lista de clientes y va mostrando los clientes que hay
   * sino esta vac�o.
   * 
   * @param list
   */
  public static void printListClient(List<IClient> list) {
    int count = 0;
    if (list != null && list.size() > 0) {
      for (IClient object : list) {
        if (count != 0) {
          System.out.print(", ");
        }
        System.out.print(object.getName());
        System.out.print("-> dni: " + object.getDni());
        count++;
      }
    }
  }

  /**
   * Metodo que recorre la lista de clientes y va mostrando las direcciones del
   * cliente que hay sino esta vac�o.
   * 
   * @param list
   */
  public static void printListAddress(List<IClient> list) {
    String dni = introducir.getDni();
    IClient dummy = new Client(dni);
    if (list != null && list.size() > 0 && list.contains(dummy)) {
      System.out.print(dummy.getAddress());
    }
  }
  
  /**
   * Funcion que devuelve true si el dni se encuentre en el repositorio
   * 
   * @param dni
   * @return boolean
   */
  public static boolean isInRepository(String dni) {
    boolean isInRepository = false;
    RepositoryClients repo = RepositoryClients.getInstanceRepositoryClient(null);
    
    if(dni != null && repo.getAllClients().size() > 0) {
      Client dummy = new Client(dni);
      if(repo.getAllClients().contains(dummy)) {
        isInRepository = true;
      }
    }
    return isInRepository;
  }
}
