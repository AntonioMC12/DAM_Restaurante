package Main;

import java.util.ArrayList;
import java.util.List;

import Clients.Client;
import Clients.RepositoryClients;
import Interfaces.IClient;
import Interfaces.IOrder;
import Interfaces.IProduct;
import Orders.Order;
import Orders.RepositoryOrders;
import Products.Drink;
import Products.Food;
import Products.Product;
import Products.ProductController;
import Products.RepositoryProduct;

public class ProductsControllerTest {

	public static void main(String[] args) {
	
	// Repo de productos para probar el controller de Clientes.
		
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
	 
    //voy a crear un repo de productos para probar el controller de product
    
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
    

	//Repo de Orders para probar el controller de Pedidos.

    List<Product> repositorioDummyPedidos = new ArrayList<>();
    repositorioDummy.add(comida3);
    repositorioDummy.add(comida2);
    repositorioDummy.add(comida1);
    repositorioDummy.add(bebida1);
    repositorioDummy.add(bebida2);
    repositorioDummy.add(bebida3);
    
	Order order1 = new Order(Cliente1, repositorioDummyPedidos, 10, null, "machaquito 26 6/4", true, false);
	Order order2 = new Order(Cliente2, repositorioDummyPedidos, 29, null, "largartijo 12 6/4", true, false);
	Order order3 = new Order(Cliente3,  repositorioDummyPedidos, 40, null, "ronda de tejares 26 6/4", true, false);
	
	List<IOrder> repositorioDummyOrders = new ArrayList<>();
	 repositorioDummyOrders.add(order1);
	 repositorioDummyOrders.add(order2);
	 repositorioDummyOrders.add(order3);
	 
	RepositoryOrders repositorioPedidos = RepositoryOrders.getInstanceRepositoryOrders(repositorioDummyOrders);
	
    /*
    System.out.println(bebida1);
    System.out.println(bebida2);
    System.out.println(bebida3);
    
    System.out.println("");
    System.out.println("");
    System.out.println("");
    
    System.out.println(comida1);
    System.out.println(comida2);
    System.out.println(comida3);
    
    System.out.println("");
    System.out.println("");
    System.out.println("");
    
    System.out.println("BundlePack de "+ bebida1.getName()+":");
    ProductController.showBundlePack(bebida1);
    
    System.out.println("");
    System.out.println("");
    System.out.println("");
    
    System.out.println("BundlePack de "+bebida2.getName()+":");
    ProductController.showBundlePack(bebida2);
    
    System.out.println("");
    System.out.println("");
    System.out.println("");
    
    System.out.println("BundlePack de "+bebida3.getName()+":");
    ProductController.showBundlePack(bebida3);
    
    System.out.println("");
    System.out.println("");
    System.out.println("");
   
    System.out.println("BundlePack de "+comida1.getName()+":");
    ProductController.showBundlePack(comida1);
    
    System.out.println("");
    System.out.println("");
    System.out.println("");
    
    System.out.println("BundlePack de "+comida2.getName()+":");
    ProductController.showBundlePack(comida2);
    
    System.out.println("");
    System.out.println("");
    System.out.println("");
    
    System.out.println("BundlePack de "+comida3.getName()+":");
    ProductController.showBundlePack(comida3);
    
    System.out.println("");
    
    ProductController.modifyDrink(repositorio, "agua");
    System.out.println(bebida1);
    */
    System.out.println(bebida1.getClass());
  }

}
