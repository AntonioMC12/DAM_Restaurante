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
import Interfaces.IProduct;
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
			
		Food vegan = new Food();
		boolean resul=false;
			assertEquals(resul,vegan.isForVegans());
	}
	
	public void TestIsForCeliac(){
		
		
		Food producto = new Food();
		
		assertFalse(producto.isForCeliac());
		
	}
	
	@Test

	public void TestGetBundlePack(){
	
		List<IProduct> platos = new ArrayList<>();
		Food f1=new Food("ensalada", 5.5, true, platos);
		Food f2=new Food("Filete con patatas",8.90, true,platos);
		Food f3=new Food("Hamburguesa",1.50, true, platos);
		Food f4=new Food("Kebab", 4.00, true, platos);
		
		assertEquals(0,f1);
		assertEquals(0,f2);
		assertEquals(0,f3);
		assertEquals(0,f4);

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
		Drink bebAlcohol = new Drink();
		boolean alcoholic= false;
		assertEquals(alcoholic, bebAlcohol.isAlcoholic());
		
	}
	
	
	
}


