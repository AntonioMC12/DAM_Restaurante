package productInterfaces;

import java.util.List;

/**
 * Shows the interface of the food dishes
 * @author Miguel Angel
 *
 */
public interface IFood {
	
	public boolean isForVegans();

  public List<IProduct> getBundlePack();
  
  public boolean addProductBundlePack(IProduct producto);
  
  public boolean deleteProductBundlePack(String name);
}
