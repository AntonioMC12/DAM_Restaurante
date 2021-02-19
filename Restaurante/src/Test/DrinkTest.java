package Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Products.Drink;
import Products.Product;

class DrinkTest {
	
	Drink drink;
	
	@BeforeEach
	public void setUp() {
		Drink drink1=new Drink("cola",2,false,null);
		Drink drink2=new Drink("fanta",2,false,null);
		Drink drink3=new Drink("BarceloCola",7,true,null);
		Drink drink4=new Drink();
	}
	
	@Test
	public void completConstructorTest() {
		assertEquals("cola",this.drink.getName());
		assertEquals(2,this.drink.getPrice(),0);
		assertEquals(false, this.drink.isAlcoholic());
	}
	
	@Test
	public void defaultConstructorTest() {
		assertEquals("Desconocido", this.drink.getName());
		assertEquals(00.00,this.drink.getPrice(),0);
		assertEquals(true, this.drink.isAlcoholic());
	}
	
	@Test
	public void addProducBundlePackTest() {
		assertTrue(drink.add(new Drink()));
	}
	
	@Test
	public void deleteProductBundlePackTest() {
		assertTrue(drink.remove(drink));
	}
	
	@Test
	public void isAlcoholicTest() {
		assertFalse(this.drink.isAlcoholic());
		assertTrue(this.drink3.isAlcoholic());
		
	}
	
	@Test
	public void getBundlePackTest() {
		assertNull(this.drink3.getBundlePack());
	}
}
