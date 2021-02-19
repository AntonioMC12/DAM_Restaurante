package Products;

import java.util.ArrayList;
import java.util.List;

import Interfaces.IDrink;
import Interfaces.IFood;
import Interfaces.IProduct;
import Interfaces.IRepositoryProduct;

/**
 * En esta clase guardaremos una lista con los productos que hay en el
 * restaurante, con una serie de métodos para el posible funcionamiento del
 * programa
 * 
 * @author ertonix12
 *
 */
public class RepositoryProduct implements IRepositoryProduct {

  private List<IProduct> products;
  private static RepositoryProduct createRepository;

  private RepositoryProduct(List<IProduct> products) {
    super();
    this.products = products;
  }
  
  public RepositoryProduct instanceRepositoryProduct(List<IProduct> products) {
	  
	  if(createRepository == null) {
		  createRepository = new RepositoryProduct (products);
	  }
	return createRepository;
	  
  }
  @Override
  public List<IProduct> getAllProducts() {
    return this.products;
  }

  @Override
  public List<IDrink> getAllDrinks() {

    List<IDrink> getAllDrinks = new ArrayList<>();
    for (IProduct iProduct : this.products) {
      if (iProduct instanceof Drink) {
        getAllDrinks.add((IDrink) iProduct);
      }
    }

    return getAllDrinks;
  }

  @Override
  public List<IFood> getAllFoods() {

    List<IFood> getAllFoods = new ArrayList<>();
    for (IProduct iProduct : this.products) {
      if (iProduct instanceof Food) {
        getAllFoods.add((IFood) iProduct);
      }
    }

    return getAllFoods;
  }

  @Override
  public List<IDrink> getAllNoAlcoholicDrinks() {

    List<IDrink> getAllNoAlcoholicDrinks = getAllDrinks();
    for (IDrink iDrink : getAllNoAlcoholicDrinks) {
      if (!iDrink.isAlcoholic()) {
        getAllNoAlcoholicDrinks.add(iDrink);
      }
    }

    return getAllNoAlcoholicDrinks;
  }

  @Override
  public List<IDrink> getAllAlcoholicsDrinks() {

    List<IDrink> getAllNoAlcoholicDrinks = getAllDrinks();
    for (IDrink iDrink : getAllNoAlcoholicDrinks) {
      if (iDrink.isAlcoholic()) {
        getAllNoAlcoholicDrinks.add(iDrink);
      }
    }

    return getAllNoAlcoholicDrinks;
  }

  @Override
  public List<IFood> getAllForVeganFood() {

    List<IFood> getAllForVeganFood = getAllFoods();
    for (IFood iFood : getAllForVeganFood) {
      if (iFood.isForVegans()) {
        getAllForVeganFood.add(iFood);
      }
    }

    return getAllForVeganFood;
  }

  @Override
  public List<IProduct> getBundleProducts(IProduct Producto) {

    return Producto.getBundlePack();
  }

  @Override
  public IProduct searchProduct(String name) {

    for (IProduct iProduct : this.products) {
      if(iProduct.getName().equals(name)) {
        return iProduct;
      }

    }
    return null;
  }

  @Override
  public IDrink searchDrinks(String name) {
    
    for (IProduct iProduct : this.products) {
      if(iProduct.getName().equals(name)) {
        return (Drink)iProduct;
      }
    }
    return null;
  }

  @Override
  public IFood searchFoods(String name) {
    
    for (IProduct iProduct : this.products) {
      if(iProduct.getName().equals(name)) {
        return (Food)iProduct;
      }
    }
    return null;
  }

  @Override
  public String toString() {
    return "RepositoryProduct [products=" + products + "]";
  }

}
