package Interfaces;

import java.util.List;

public interface IRepositoryProduct {

  public List<IProduct> getAllProducts();

  public List<IDrink> getAllDrinks();

  public List<IFood> getAllFoods();

  public List<IDrink> getAllNoAlcoholicDrinks();

  public List<IDrink> getAllAlcoholicsDrinks();

  public List<IFood> getAllForVeganFood();

  public List<IProduct> getBundleProducts(IProduct Producto);

  public IProduct searchProduct(String name);

  public IDrink searchDrinks(String name);

  public IFood searchFoods(String name);

}
