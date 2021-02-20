package Test;

import static org.junit.jupiter.api.Assertions.*;

//import java.util.ArrayList;
//import java.util.List;

//import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Products.Food;

class FoodTest {
	
	Food food = new Food("calamare fritos",2,false,null);
	Food food1 = new Food("xipirones",2,false,null);
	Food food2 = new Food("espetitoh",7,true,null);
	
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
