 package Test;

import static org.junit.jupiter.api.Assertions.*;

//import java.util.ArrayList;
//import java.util.List;

//import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Products.Drink;
import Products.Food;
import Products.Product;


class ProductTest {

    Product product=new Food("Camalares",2,false,null);
    Product product1=new Food("xipirone",2,false,null);
    Product product2=new Drink("BarceloCola",7,true,null);
	
	@Test
	public void completConstructorTest() {
		
	}
	
	@Test
	public void defaultConstructorTest() {
		
	}
	@Test
	void test() {
		fail("Not yet implemented");
	}

}
