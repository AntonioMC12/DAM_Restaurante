package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Interfaces.IProduct;
import Products.Drink;
import Products.Food;
import Products.Product;

class RepositoryProductsTest {
	
	private IProduct product;
	
	@BeforeEach
	void doBefore() {

	  String name = "Camalares";
	  double price = 2;
	 
	  List<IProduct> products = new ArrayList<>();
	  products.add(new Drink());
	  products.add(new Food());

	  this.product = new Food(name, price, false, products);
	}

	@Test
	public void  getAllProductsTest() {
		
		Product product=new Food("Camalares",2,false,null);
		Product product1=new Food("xipirone",2,false,null);
		Product product2=new Drink("BarceloCola",7,true,null);
		
		assertEquals(3, this.product);
		
		
	}

}
