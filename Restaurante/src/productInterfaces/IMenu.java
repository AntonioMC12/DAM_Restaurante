package productInterfaces;
/**
 * Shows the boot menu with the most basic options	
 * @author Miguel Angel	
 *
 */
public interface IMenu {
	
	public void welcomeMenu();
	public void chooseMenu();
	public void registerClient();
	public void deleteClient();
	public void updateClient();
	public void searchClient();
	public void showDrinks();
	public void ShowDishes();
	//show the available combos
	public void ShowCombos();
}
