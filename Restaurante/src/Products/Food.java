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
	private static int ID_COUNTER = 0;
	private int id;
	private boolean forVegans;
	private List<IProduct> bundlePack;

	public Food(String name, double price, boolean forVegans, List<IProduct> bundlePack) {
		super(name, price);
		this.forVegans = forVegans;
		this.id = ID_COUNTER;
		this.bundlePack = bundlePack;
		ID_COUNTER++;
	}

	public Food() {
		super();
		List<IProduct> bundleProducts = new ArrayList<IProduct>();
		this.forVegans = false;
		this.bundlePack = bundleProducts;
	}

	public int getId() {
		return id;
	}

	public void setID_COUNTER(int iD_COUNTER) {
		ID_COUNTER = iD_COUNTER;
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
}