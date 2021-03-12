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
    // TODO Auto-generated method stub
    

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
    
    List<String> direccion = new ArrayList<>();
	List<IOrder> orders = new ArrayList<>();
	List<IClient> clientes= new ArrayList<>();

	Client Cliente1 = new Client("45942597M","Miguel",25,direccion,orders,150);
	Client Cliente2 = new Client("45942565M","Paco",21,direccion,orders,180);
	Client Cliente3 = new Client("45942523M","Marcos",27,direccion,orders,200);
	
	 List<IClient> repositorioDummyClientes = new ArrayList<>();
	 repositorioDummyClientes.add(Cliente1);
	 repositorioDummyClientes.add(Cliente2);
	 repositorioDummyClientes.add(Cliente3);
	 
	 RepositoryClients repositorioClientes = RepositoryClients.getInstanceRepositoryClient(repositorioDummyClientes);
	 
    ControllerMenu.mainMenu();
  }

}
