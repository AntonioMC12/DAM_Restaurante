package Main;

import java.util.ArrayList;
import java.util.List;

import Clients.Client;
import Clients.RepositoryClients;
import Interfaces.IClient;
import Interfaces.IOrder;
import Interfaces.IProduct;
import Menu.ControllerMenu;
import Products.Drink;
import Products.Food;
import Products.RepositoryProduct;

public class MainTest {

  public static void main(String[] args) {
    
    //Creación de productos y sus bundles

    List<IProduct> aguaBundle = new ArrayList<>();
    List<IProduct> fantaBundle = new ArrayList<>();
    List<IProduct> cocaColaBundle = new ArrayList<>();
    
    Drink bebida1 = new Drink("agua",1.00,false,aguaBundle);
    Drink bebida2 = new Drink("fanta",1.50,false,fantaBundle);
    Drink bebida3 = new Drink("cocacola",1.60,false,cocaColaBundle);
    
    List<IProduct> burguerBundle = new ArrayList<>();
    List<IProduct> patatasBundle = new ArrayList<>();
    List<IProduct> polloBundle = new ArrayList<>();
    
    Food comida1 = new Food("burguer",4.00,false,burguerBundle);
    Food comida2 = new Food("patatas",2.00,true,patatasBundle);
    Food comida3 = new Food("pollo",5.00,false,polloBundle);
    
    List<IProduct> repositorioDummy = new ArrayList<>();
    repositorioDummy.add(comida3);
    repositorioDummy.add(comida2);
    repositorioDummy.add(comida1);
    repositorioDummy.add(bebida1);
    repositorioDummy.add(bebida2);
    repositorioDummy.add(bebida3);
    
    
    RepositoryProduct repositorio = RepositoryProduct.instanceRepositoryProduct(repositorioDummy);
    
    burguerBundle.add(bebida2);
    burguerBundle.add(bebida3);
    burguerBundle.add(comida2);
    
    patatasBundle.add(bebida1);
    patatasBundle.add(comida1);
    patatasBundle.add(comida3);
    
    polloBundle.add(bebida1);
    polloBundle.add(bebida2);
    polloBundle.add(bebida3);
    polloBundle.add(comida2);
    
    aguaBundle.add(comida2);
    aguaBundle.add(comida3);
    
    fantaBundle.add(comida1);
    fantaBundle.add(comida3);

    cocaColaBundle.add(comida1);
    cocaColaBundle.add(comida3);
    
    bebida1.setBundlePack(aguaBundle);
    bebida2.setBundlePack(fantaBundle);
    bebida2.setBundlePack(cocaColaBundle);
    
    comida1.setBundlePack(burguerBundle);
    comida2.setBundlePack(patatasBundle);
    comida3.setBundlePack(polloBundle);    
    
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    //Creacion de clientes
    List<String> direcciones1 = new ArrayList<>();
    direcciones1.add("c/ Obispo Cubero");
    List<String> direcciones2 = new ArrayList<>();
    direcciones2.add("c/ Juanita la larga");
    
    Client cliente1 = new Client("26824204V", "Antonio", 22, direcciones1, null, 0);
    Client cliente2 = new Client("12345678A", "Sample", 18, direcciones2, null, 0);
    
    List<IClient> clientsDummy = new ArrayList<>();
    clientsDummy.add(cliente1);
    clientsDummy.add(cliente2);
    
    RepositoryClients repositoryClients = RepositoryClients.getInstanceRepositoryClient(clientsDummy);

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    //Creacion de pedidos
    
    
    ControllerMenu.mainMenu();
  }

}
