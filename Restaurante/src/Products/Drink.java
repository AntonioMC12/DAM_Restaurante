/**
 * 
 */
package Products;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Interfaces.IDrink;
import Interfaces.IProduct;

public class Drink extends Product implements IDrink {

  private boolean alcoholic;
  private List<IProduct> bundlePack;

  public Drink(String name, double price, boolean alcoholic, List<IProduct> bundlePack) {
    super(name, price);
    this.alcoholic = alcoholic;
    this.bundlePack = bundlePack;
  }

  public Drink() {
    super();
    List<IProduct> bundleProducts = new ArrayList<IProduct>();
    this.alcoholic = false;
    this.bundlePack = bundleProducts;
  }

  @Override
  public boolean isAlcoholic() {

    return this.alcoholic;
  }

  @Override
  public List<IProduct> getBundlePack() {
    return this.bundlePack;
  }

  @Override
  public boolean addProductBundlePack(IProduct producto) {
    boolean result = false;
    if (!bundlePack.contains(producto)) {
      bundlePack.add(producto);
      result = true;
    }
    return result;
  }

  @Override
  public boolean deleteProductBundlePack(String name) {
    boolean result = false;
    if (bundlePack.size() != 0) {
      for (Iterator<IProduct> iterator = bundlePack.iterator(); iterator.hasNext();) {
        IProduct iProduct = (IProduct) iterator.next();
        if (iProduct.getName().equals(name)) {
          iterator.remove();
          result = true;
        }
      }
    }
    return result;
  }

  @Override
  public boolean equeals(IProduct producto) {

    return super.equals(producto);
  }
}
