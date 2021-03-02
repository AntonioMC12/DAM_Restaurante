package Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Interfaces.IProduct;
import Products.Drink;
import Products.Product;

class DrinkTest {

	Drink drink;

	@Test
	public void completConstructorTest() {
		assertEquals("cola", this.drink.getName());
		assertEquals(2, this.drink.getPrice(), 0);
		assertEquals(false, this.drink.isAlcoholic());
	}

	@Test
	public void defaultConstructorTest() {
		List<IProduct> bebidas = new ArrayList<>();
		bebidas.add(new Drink());
		
		assertEquals("Desconocido", this.drink.getName());
		assertEquals(00.00, this.drink.getPrice(), 0);
		assertEquals(true, this.drink.isAlcoholic());
	}

	@Test
	public void addProducBundlePackTest() {
		boolean alcoholic;
		List<IProduct> bundlePack;
		String name;
		double price;
		List<IProduct> bebidas = new ArrayList<>();
		bebidas.add(new Drink());
		assertEquals(1, bebidas.size());
	}

	@Test
	public void deleteProductBundlePackTest() {
		boolean alcoholic;
		List<IProduct> bundlePack;
		String name;
		double price;
		List<IProduct> bebidas = new ArrayList<>();
		bebidas.add(new Drink());
		assertEquals(1, bebidas.size());
		
		bebidas.remove(new Drink());
		assertEquals(0, bebidas.size());

	}
	
	@Test
	public void isAlcoholicTest() {
		boolean alcoholic=true;
		List<IProduct> bundlePack;
		String name;
		double price;
		List<IProduct> bebidas = new ArrayList<>();
		bebidas.add(new Drink("BarceloCola", 7, true, null));
		
		//assertTrue();
		

	}

	@Test
	public void getBundlePackTest() {
		//assertNull(this.drink3.getBundlePack());
	}
}
