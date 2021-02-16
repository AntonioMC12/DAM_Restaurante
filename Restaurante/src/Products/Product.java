package Products;

import java.util.List;

import Interfaces.IProduct;

/**
 * En esta clase guardaremos todos los datos de los producto de los cuales
 * heredan el resto.
 * 
 * @author Abepuoh
 *
 */
public abstract class Product implements IProduct {

  private static int ID_COUNTER = 0; // CHECK
  private int id;
  private String name;
  private double price;
  private boolean forCeliac;

  public Product(String name, double price) {
    super();
    this.name = name;
    this.price = price;
    this.id = ID_COUNTER;
    this.forCeliac = false; // CHECK
    ID_COUNTER++;
  }

  public Product(String name) {
    this(name, 00.00);
  }

  public Product() {
    this("Desconocido", 00.00);
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

  public abstract boolean addProductBundlePack(IProduct producto);

  public abstract boolean deleteProductBundlePack(String name);

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Product other = (Product) obj;
    if (id != other.id)
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "Producto con id=" + id + ", nombre=" + name + ", precio=" + price + ", Es apto para celiacos =" + forCeliac;
  }
}
