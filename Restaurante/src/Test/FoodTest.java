package Test;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

import Products.Drink;
import Products.Food;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import Products.Product;
import productInterfaces.IProduct;
/*
 * @author David Ferrete
 */
public class FoodTest {

	@Before
    public void beforeTest() {

//creación de comidas
		List<IProduct> platos = new ArrayList<>();	
		
		Food f1=new Food("ensalada", 5.5, true, null);
		Food f2=new Food("Filete con patatas",8.90, true,null);
		Food f3=new Food("Hamburguesa",1.50, true, null);
		Food f4=new Food("Kebab", 4.00, true, null);
		
		platos.add(f1);
		platos.add(f2);
		platos.add(f3);
		platos.add(f4);
		
        }
	
	@Test
	public void TestIsForVegans() {
			
			assertTrue(true);
	}
	
	public void TestIsForCeliac(){
		
		assertTrue(false);
		
	}
	
	@Test

	public void TestGetBundlePack(){
	
		List<IProduct> platos = new ArrayList<>();
		Food f1=new Food("ensalada", 5.5, true, null);
		Food f2=new Food("Filete con patatas",8.90, true,null);
		Food f3=new Food("Hamburguesa",1.50, true, null);
		Food f4=new Food("Kebab", 4.00, true, null);
		
		assertEquals(platos, f1);
		assertEquals(platos, f2);
		assertEquals(platos, f3);
		assertEquals(platos, f4);

	}
		
	@Test
	public void TestAddProductBundlePack() {
	
		assertTrue(true);
			
	}
	
	@Test
	public void TestDelateProductBundlePack() {
	
		assertTrue(true);
			
	}
	
	@Test
	public void TestIsAlcoholic() {
		
		assertTrue(false);
		
	}
	
	
	
}


