package productInterfaces;

public interface IRepositoryProduct {
    
  public IProduct[] getAllProducts();
  public IDrink[] getAllDrinks();
  public IFood[] getAllFoods();
  public IDrink[] getAllNoAlcoholicDrinks();
  public IDrink[] getAllAlcoholicsDrinks();
  public IFood[] getAllForVeganFood();
  public IProduct[] getBundleProducts(IProduct Producto);
  public IProduct searchProduct(String name);
  public IDrink searchDrinks(String name);
  public IFood searchFoods(String name);
  
}
