package Interfaces;

/**
 * Shows the interaction menu with the client
 * 
 * @author Miguel Angel
 *
 */
public interface IMainMenuController {

  public void newOder();

  public void changeOrder();

  public void change();

  public void deleteOrder();

  public void cashToday();

  public void cashThisMonth();

  public void cashTotal();

  public void viewOrdesrNotPaid();

  public void viewOrdersPendingDelivered();

  public void saveAllAndClose();
}
