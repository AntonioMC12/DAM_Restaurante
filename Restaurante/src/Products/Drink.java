/**
 * 
 */
package Products;

import java.util.ArrayList;
import java.util.List;

import productInterfaces.IDrink;
import productInterfaces.IProduct;

/**
 * @author ertonix12
 *
 */
public class Drink extends Product implements IDrink {

  private boolean alcoholic;
  private List<Product> bundlePack;

  public Drink(String name, double price, boolean alcoholic, List<Product> bundlePack) {
    super(name, price);
    this.alcoholic = alcoholic;
    this.bundlePack = bundlePack;
  }

  public Drink() {
    super();
    List<Product> bundleProducts = new ArrayList<Product>();
    this.alcoholic = false;
    this.bundlePack = bundleProducts;
  }

  public boolean isAlcoholic() {
    return alcoholic;
  }

  @Override
  public boolean getIsForCeliac() {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public boolean equeals(IProduct producto) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public List<IProduct> getBundlePack() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public boolean addProductBundlePack(IProduct producto) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public boolean deleteProductBundlePack(String name) {
    // TODO Auto-generated method stub
    return false;
  }

}
