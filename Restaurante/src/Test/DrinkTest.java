package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Products.Drink;
import Products.Product;

class DrinkTest {
	
	Drink drink=new Drink("cola",2,false,null);
	Drink drink1=new Drink("fanta",2,false,null);
	Drink drink2=new Drink("BarceloCola",7,true,null);
	Drink drink3=new Drink();
	
	@Test
	public void completConstructorTest() {
		assertEquals("cola", this.drink.getName());
		assertEquals(2,this.drink.getPrice());
		assertEquals(false, this.drink.isAlcoholic());
	}
	
	@Test
	public void defaultConstructorTest() {
		assertEquals("Desconocido", this.drink.getName());
		assertEquals(00.00,this.drink.getPrice());
		assertEquals(true, this.drink.isAlcoholic());
	}
	
	@Test
	public void addProducBundlePackTest() {
		assert ("Not yet implemented") != null;
	}
	
	@Test
	public void deleteProductBundlePackTest() {
		assert ("Not yet implemented") != null;
	}
	
	@Test
	public void isAlcoholicTest() {
		assertFalse(this.drink1.isAlcoholic());
		assertTrue(this.drink2.isAlcoholic());
		
	}
	
	@Test
	public void getBundlePackTest() {
		assertNull(this.drink.getBundlePack());
	}
}
