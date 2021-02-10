package Products;

import java.util.List;

import productInterfaces.IProduct;

/**
 * En esta clase guardaremos todos los datos de los producto de los cuales
 * heredan el resto.
 * 
 * @author Abepuoh
 *
 */
public abstract class Product implements productInterfaces.IProduct {

  private static int ID_COUNTER = 0; // CHECK
  private int id;
  private String name;
  private double price;
  private boolean forCeliac;

  public Product() {
    this("Desconocido", 00.00);
  }

  public Product(String name, double price) {
    super();
    this.name = name;
    this.price = price;
    this.id = ID_COUNTER;
    this.forCeliac = false; // CHECK
    ID_COUNTER++;
  }

  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }

  public boolean isForCeliac() {

    boolean result = false;
    if (this.forCeliac == true) {
      result = true;
    } else {
      result = false;
    }
    return result;
  }

  public abstract List<IProduct> getBundlePack();

  @Override
  public boolean equals(Object o) {
    boolean result = false;
    if (this == o) {
      result = true;
    } else if (o instanceof Product) {
      Product a = (Product) o;
      String n = a.getName();
      if (this.name.equals(n)) {
        result = true;
      }
    }
    return result;
  }

  @Override
  public String toString() {
    return "Producto con id=" + id + ", nombre=" + name + ", precio=" + price + ", Es apto para celiacos =" + forCeliac;
  }
}
