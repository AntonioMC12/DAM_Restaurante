
public class Food extends Product{

	boolean forVegans;
	
	public Food(boolean forVegans) {
		
		this.forVegans=forVegans;
	}
	
	public boolean isForVegans() {
		
		boolean vegan=false;
		
		if(this.forVegans==true) {
			
			vegan=true;
			
		}else{
			
			vegan=false;
			
		}
		
		return vegan;	
	}
	
	public List<Product> getBundlePack() {
	/*
	 * Habr� productos que podr�n �paquetizarse� para obtener descuentos. Por ejemplo,
	 *podemos tener una bebida concreta (Refresco de Cola) que al pedirse con una comida
	 *(Paquete de patatas) se obtenga un descuento del 10% en ambos productos. Por
	 *tanto, cada producto tendr� un array de los ids de aquellos productos con los que se
	 *puede combinar y obtener el descuento de 10%	
	 */
		
		//declaraci�n del array de bebidas.
		String agua="agua";
		String cocaCola="coca-cola";
		String fanta="fanta";
		String cerveza="cerveza";
		
		String[] bebida= {agua,cocaCola,fanta,cerveza};
		
		//declaraci�n del array de comidas
		String ensalada="ensalada";
		String filete="filete con patatas";
		String hamburguesa="hamburguesa";
		String pizza="pizza bolo�esa";
		
		String [] comida= {ensalada, filete, hamburguesa, pizza};
		
		//desarrollo del metodo
		
		
		int result;
		

		return result;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Es"+forVegans;
	}
	 
}
