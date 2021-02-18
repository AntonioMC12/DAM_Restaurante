package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Clients.Client;
import Ejecutor.ContactManager;
import Interfaces.IOrder;

class ClientTest {
	
	
	@BeforeEach
	public void setup() {
	List<Client> Cliente=new ArrayList<Client>();	
	}
	
	@Test
	public void test() {
		Cliente.add(new Client("56985447M", "Miguel", 25, null, null, 100));
		assertTrue(false,Cliente);
	}

}
