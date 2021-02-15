/**
 * 
 */
package Products;

import java.util.ArrayList;
import java.util.List;

import productInterfaces.IDrink;
import productInterfaces.IFood;
import productInterfaces.IProduct;

/**
 * En esta clase guardaremos una lista con los productos que hay en el
 * restaurante, con una serie de métodos para el posible funcionamiento del
 * programa
 * 
 * @author ertonix12
 *
 */
public class RepositoryProduct implements productInterfaces.IRepositoryProduct {

  private List<IProduct> products;

  public RepositoryProduct(List<IProduct> products) {
    super();
    this.products = products;
  }

  @Override
  public List<IProduct> getAllProducts() {
    return this.products;
  }

  @Override
  public List<IProduct> getAllDrinks() {

    List<IProduct> getAllDrinks = new ArrayList<>();
    for (IProduct iProduct : this.products) {
      if (iProduct instanceof Drink) {
        getAllDrinks.add(iProduct);
      }
    }

    return getAllDrinks;
  }

  @Override
  public List<IProduct> getAllFoods() {
    
    List<IProduct> getAllFoods = new ArrayList<>();
    for (IProduct iProduct : this.products) {
      if (iProduct instanceof Food) {
        getAllFoods.add(iProduct);
      }
    }

    return getAllFoods;
  }

  @Override
  public List<IProduct> getAllNoAlcoholicDrinks() {
    
    List<IProduct> getAllNoAlcoholicDrinks = getAllDrinks();
    for (IProduct iProduct : getAllNoAlcoholicDrinks) {
      if(null);
    }
  }

  @Override
  public List<IProduct> getAllAlcoholicsDrinks() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public List<IProduct> getAllForVeganFood() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public List<IProduct> getBundleProducts(IProduct Producto) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public IProduct searchProduct(String name) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public IDrink searchDrinks(String name) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public IFood searchFoods(String name) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String toString() {
    return "RepositoryProduct [products=" + products + "]";
  }

}
