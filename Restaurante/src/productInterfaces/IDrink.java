package productInterfaces;

import java.util.List;

/**
 * Shows the interface of the drinks
 * @author Miguel Angel	
 *
 */
public interface IDrink {
  
	public boolean isAlcoholic();
	
  public List<IProduct> getBundlePack();
  
  public boolean addProductBundlePack(IProduct producto);
  
  public boolean deleteProductBundlePack(String name);
}
