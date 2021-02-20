package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

//import org.junit.Before;
//import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import Clients.Client;
import Interfaces.IOrder;
import Orders.Order;
import Products.*;
import java.time.*;

class clientTest {

  private Client clienteTest;

  @BeforeEach
  void doBefore() {

    String dni = "123A";
    String name = "prueba";
    int age = 18;
    double total = 0;
    LocalDateTime date = LocalDateTime.now();

    List<String> address = new ArrayList<>();
    address.add("direccion");

    List<Product> products = new ArrayList<>();
    products.add(new Drink());
    products.add(new Food());

    List<IOrder> orders = new ArrayList<>();
    orders.add(new Order(products, total, date, "address", false, false));

    this.clienteTest = new Client(dni, name, age, address, orders, 10);
  }

  @Test
  void testCompleteConstruct() {

    assertEquals("123A", this.clienteTest.getDni());
    assertEquals("prueba", this.clienteTest.getName());
    assertEquals(18, this.clienteTest.getAge());
    assertEquals("direccion", this.clienteTest.getAddress().get(0));
    assertTrue(this.clienteTest.getOrders() != null);
    assertEquals(10, this.clienteTest.getPoints());

  }

  @Test
  void testParcialConstructor() {
    Client cliente1 = new Client("123A");

    assertEquals("123A", cliente1.getDni());
    assertEquals("", cliente1.getName());
    assertEquals(0, cliente1.getAge());
    assertEquals(0, cliente1.getAddress().size());
    assertEquals(0, cliente1.getOrders().size());
    assertEquals(0, cliente1.getPoints());
  }

  @Test
  void testAddAddress() {

    this.clienteTest.addAddress("direccion2");
    assertEquals(2, this.clienteTest.getAddress().size());
    assertEquals("direccion2", this.clienteTest.getAddress().get(1));

    this.clienteTest.addAddress("direccion3");
    assertEquals(3, this.clienteTest.getAddress().size());
    assertEquals("direccion3", this.clienteTest.getAddress().get(2));

  }

  @Test
  void testDeleteAddress() {

    this.clienteTest.deleteAddress("direccion");
    assertEquals(0, this.clienteTest.getAddress().size());
  }

  @Test
  void testAddOrder() {

    double total = 0;
    LocalDateTime date = LocalDateTime.now();
    List<Product> products = new ArrayList<>();
    products.add(new Drink());
    products.add(new Food());

    assertEquals(1, this.clienteTest.getOrders().size());

    this.clienteTest.addOrder(new Order(products, total, date, "address", false, false));
    assertEquals(2, this.clienteTest.getOrders().size());

    this.clienteTest.addOrder(new Order(products, total, date, "address", false, false));
    assertEquals(3, this.clienteTest.getOrders().size());
  }

  @Test
  void testAddPoints() {
    
    this.clienteTest.addPoints(10);
    assertEquals(20, this.clienteTest.getPoints());
    
    this.clienteTest.addPoints(-10);
    assertNotEquals(10, this.clienteTest.getPoints());
  }

  @Test
  void testGetAddress() {
    
    List<String> address1 = new ArrayList<>();
    address1.add("direccion");
    
    assertEquals(address1, this.clienteTest.getAddress());
  }

  @Test
  void testGetOrders() {
    
    assertEquals(1, this.clienteTest.getOrders().size());
  }

  @Test
  void testGetPoints() {
    
    assertEquals(10, this.clienteTest.getPoints());
  }

}
