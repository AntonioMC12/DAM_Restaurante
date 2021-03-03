/**
 * 
 */
package Products;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Interfaces.IFood;
import Interfaces.IProduct;

public class Food extends Product implements IFood {
	
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

	public Food(String nombre) {
	  super(nombre);
    // TODO Auto-generated constructor stub
  }
	
	 public void setBundlePack(List<IProduct> bundlePack) {
	    this.bundlePack = bundlePack;
	  }

  public boolean isForVegans() {
		return this.forVegans;
	}

	@Override
	public List<IProduct> getBundlePack() {
		return this.bundlePack;
	}

	@Override
	public boolean addProductBundlePack(IProduct producto) {
		boolean result = false;
		if (producto != null && !bundlePack.contains(producto)) {
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

  @Override
  public void setIsForVegans() {
    if(this.forVegans) {
      this.forVegans = false;
    }else {
      this.forVegans = true;
    }
  }

  @Override
  public String toString() {
    return "Food [forVegans=" + forVegans + ", getId()=" + getId() + ", getName()=" + getName() + ", getPrice()="
        + getPrice() + ", isForCeliac()=" + isForCeliac() + ", toString()=" + super.toString() + ", getClass()="
        + getClass() + ", hashCode()=" + hashCode() + "]";
  }
  
  
}