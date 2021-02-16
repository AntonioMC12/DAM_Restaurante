package Interfaces;

import java.util.List;

/**
 * Shows the interface of the food dishes
 * @author Miguel Angel
 *
 */
public interface IFood extends IProduct{
	
	public boolean isForVegans();

  public List<IProduct> getBundlePack();
  
  public boolean addProductBundlePack(IProduct producto);
  
  public boolean deleteProductBundlePack(String name);
}
