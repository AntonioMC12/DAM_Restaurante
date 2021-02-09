package productInterfaces;

import java.util.List;

public interface IRepositoryProduct {
    
  public List<IProduct> getAllProducts();
  public List<IProduct> getAllDrinks();
  public List<IProduct> getAllFoods();
  public List<IProduct> getAllNoAlcoholicDrinks();
  public List<IProduct> getAllAlcoholicsDrinks();
  public List<IProduct> getAllForVeganFood();
  public List<IProduct> getBundleProducts(IProduct Producto);
  public IProduct searchProduct(String name);
  public IDrink searchDrinks(String name);
  public IFood searchFoods(String name);
  
}
