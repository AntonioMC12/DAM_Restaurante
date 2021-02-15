/**
 * 
 */
package Products;

import java.util.ArrayList;
import java.util.List;

import productInterfaces.IFood;
import productInterfaces.IProduct;

/**
 * @author ertonix12
 *
 */
public class Food extends Product implements IFood {

  private boolean forVegans;
  private List<Product> bundlePack;

  public Food(String name, double price, boolean forVegans, List<Product> bundlePack) {
    super(name, price);
    this.forVegans = forVegans;
    this.bundlePack = bundlePack;
  }

  public Food() {
    super();
    List<Product> bundleProducts = new ArrayList<Product>();
    this.forVegans = false;
    this.bundlePack = bundleProducts;
  }

  public boolean isForVegans() {
    return forVegans;
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
