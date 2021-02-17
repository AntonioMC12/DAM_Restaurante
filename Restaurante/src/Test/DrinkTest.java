package Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import Products.Drink;
import Products.Food;
import Products.Product;
import productInterfaces.IProduct;

public class DrinkTest {

	@Before
	public void beforeTest() {
		List<IProduct> bebidas = new ArrayList<IProduct>();
		
		Drink d1=new Drink("agua", 1, false, bebidas);
		Drink d2=new Drink("coca-cola",2.50, false,bebidas);
		Drink d3=new Drink("fanta",2.50, false, bebidas);
		Drink d4=new Drink("cerveza", 1.50, true, bebidas);
		
		bebidas.add(d1);
		bebidas.add(d2);
		bebidas.add(d3);
		bebidas.add(d4);
		
		}
	
	@Test 
	public void TestAddProduct() {	
	List<IProduct> TDrink = new ArrayList<IProduct>();
	
		assertEquals(TDrink.size(),0);
		assertEquals(true, TDrink.size()==3);
		
	}
	
	@Test
	public void TestIsAlcoholic(){
		
		assertTrue(true);
		
	}
	
	@Test
	public void TestGetBundlepuck() {
		
		List<IProduct> bebidas = new ArrayList<IProduct>();	
		
		Drink d1=new Drink("agua", 1, false, bebidas);
		Drink d2=new Drink("coca-cola",2.50, false,bebidas);
		Drink d3=new Drink("fanta",2.50, false, bebidas);
		Drink d4=new Drink("cerveza", 1.50, true, bebidas);
		
		assertEquals(bebidas, d1);
		assertEquals(bebidas, d2);
		assertEquals(bebidas, d3);
		assertEquals(bebidas, d4);
		
	}
	
	@Test
	public void TestAddProductBundlePack() {
		
		assertTrue(true);
	}
	
	@Test
	public void TestGetIsForCeliac() {
		
		assertTrue(false);
		
	}

}
