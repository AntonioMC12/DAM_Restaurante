/**
 * 
 */
package Products;

import java.util.ArrayList;
import java.util.List;

import productInterfaces.IProduct;

/**
 * @author ertonix12
 *
 */
public class Food extends Product {

  private boolean forVegans;
  private List<IProduct> bundlePack;

  public Food(String name, double price, boolean forVegans, List<IProduct> bundlePack) {
    super(name, price);
    this.forVegans = forVegans;
    this.bundlePack = bundlePack;
  }

  public Food() {
    super();
    List<IProduct> bundleProducts = new ArrayList<IProduct>();
    this.forVegans = false;
    this.bundlePack = bundleProducts;
  }

  public boolean isForVegans() {
    return forVegans;
  }

  @Override
  public boolean getIsForCeliac() {
	  return this.isForCeliac();
  }

  @Override
  public List<IProduct> getBundlePack() {
	 return this.bundlePack;
  }

  @Override
  public boolean addProductBundlePack(IProduct producto) {
	  boolean result=false;
		if(!bundlePack.contains(producto)) {
			bundlePack.add(producto);
			result = true;
		}
		return result;

	}

  @Override
  public boolean deleteProductBundlePack(String name) {
	  boolean result=false;
 	  if(bundlePack.size()==0) {
 		  for (IProduct product : bundlePack) {
			if(bundlePack.contains(name)) {
				bundlePack.remove(bundlePack);
				  result=true;
			}
		}
 	  }
 	  return result;
  }

@Override
public boolean IsAlcoholic() {
	// TODO Auto-generated method stub
	return false;
}
}
