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
public  class Drink extends Product {

  private boolean alcoholic;
  private List<IProduct> bundlePack;

  public Drink(String name, double price, boolean alcoholic,List<IProduct> bundlePack) {
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
  public boolean IsAlcoholic() {
	  boolean result=false;
	    if(this.IsAlcoholic()==true) {
	    	result=true;
	    }
	    return result;
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
			result=true;
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
  public boolean getIsForCeliac() {
	  return super.isForCeliac();
  }
}
