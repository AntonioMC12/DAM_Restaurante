package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import Clients.Client;
import Products.*;
import Orders.*;
import Interfaces.*;

public class OrderTest {

	@Test
	public void testGetTotal() {
		
		double total=30.50;
		
		LocalDateTime date= LocalDateTime.now();
		
		List<Product> producto = new ArrayList<>();

		Order pedido = new Order(producto,30.50, date,"1234",true, true);
		
		
		assertEquals(total, pedido.getTotal());
		
	}
	
}
