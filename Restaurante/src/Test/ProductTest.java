package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import Interfaces.*;
import Products.Drink;
import Products.*;

public class ProductTest {

	@Before
	public void beforeTest() {
		List<IProduct> productos= new ArrayList<>();
		Food comidas = new Food();
		Drink bebidas = new Drink();
		
		productos.add(bebidas);
		productos.add(comidas);
		
	}
	
	@Test
	public void testIsForCeliac() {
	
		Food  comidas = new Food();
		Drink bebidas = new Drink();
		
		assertEquals(false, comidas.isForCeliac());
		assertEquals(false, bebidas.isForCeliac());
	}
	
}
