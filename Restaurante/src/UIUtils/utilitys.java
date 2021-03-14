package UIUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class utilitys {

  public static void espera(int i) {
    try {
      Thread.sleep(i);
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  public static boolean validarNIF(String nif) {

    boolean correcto = false;

    Pattern pattern = Pattern.compile("(\\d{1,8})([TRWAGMYFPDXBNJZSQVHLCKEtrwagmyfpdxbnjzsqvhlcke])");
    Matcher matcher = pattern.matcher(nif);

    if (matcher.matches()) {

      String letra = matcher.group(2);
      String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
      int index = Integer.parseInt(matcher.group(1));

      index = index % 23;

      String reference = letras.substring(index, index + 1);
      if (reference.equalsIgnoreCase(letra)) {
        correcto = true;
      } else {
        correcto = false;
      }
    } else {
      correcto = false;
    }
    return correcto;
  }
}
