package productInterfaces;

/**
 * Shows the main menu, in which 
 * we can perform all the core operations
 * @author Miguel Angel
 *
 */
public interface IOrderMenuController {
	
	public void addProduct(IProduct p);
	public void editLine();
	public void removeLine(int id);
	public void setAdress();
	public void savePaid();
	public void saveNotPaid();
	
}
