package UIUtils;

public class utilitys {
  
  public static void espera(int i) {
    try {
      Thread.sleep(i);
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

}
