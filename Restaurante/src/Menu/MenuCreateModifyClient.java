package Menu;

import java.util.Scanner;

/**
 * Sysos de inicio para logear o crear cuenta con los que trabajaremos mas
 * adelante.
 * 
 * @author Abepuoh
 *
 */
public class MenuCreateModifyClient {
	private static Scanner sc = new Scanner(System.in);
	
	public static String insertName() {
		String insertName = null;

		System.out.println("\r\n"
				+ "████████████████████████████████████████████████████████████████████████████████████████████████████████████████████\r\n"
				+ "██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██\r\n"
				+ "██░░██╗███╗░░██╗░██████╗███████╗██████╗░████████╗███████╗░░███╗░░██╗░█████╗░███╗░░░███╗██████╗░██████╗░███████╗░░░██\r\n"
				+ "██░░██║████╗░██║██╔════╝██╔════╝██╔══██╗╚══██╔══╝██╔════╝░░████╗░██║██╔══██╗████╗░████║██╔══██╗██╔══██╗██╔════╝░░░██\r\n"
				+ "██░░██║██╔██╗██║╚█████╗░█████╗░░██████╔╝░░░██║░░░█████╗░░░░██╔██╗██║██║░░██║██╔████╔██║██████╦╝██████╔╝█████╗░░░░░██\r\n"
				+ "██░░██║██║╚████║░╚═══██╗██╔══╝░░██╔══██╗░░░██║░░░██╔══╝░░░░██║╚████║██║░░██║██║╚██╔╝██║██╔══██╗██╔══██╗██╔══╝░░░░░██\r\n"
				+ "██░░██║██║░╚███║██████╔╝███████╗██║░░██║░░░██║░░░███████╗░░██║░╚███║╚█████╔╝██║░╚═╝░██║██████╦╝██║░░██║███████╗░░░██\r\n"
				+ "██░░╚═╝╚═╝░░╚══╝╚═════╝░╚══════╝╚═╝░░╚═╝░░░╚═╝░░░╚══════╝░░╚═╝░░╚══╝░╚════╝░╚═╝░░░░░╚═╝╚═════╝░╚═╝░░╚═╝╚══════╝░░░██\r\n"
				+ "██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██\r\n"
				+ "████████████████████████████████████████████████████████████████████████████████████████████████████████████████████\r\n");
		insertName = sc.nextLine();
		return insertName;

	}

	public static String insterDni() {
		String insertDni = null;

		System.out.println("\r\n"
				+ "████████████████████████████████████████████████████████████████████████████████████████████████████████████████████\r\n"
				+ "██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██\r\n"
				+ "██░░░░░░░░░░░░░░░░░░██╗███╗░░██╗░██████╗███████╗██████╗░████████╗███████╗░░██████╗░███╗░░██╗██╗░░░░░░░░░░░░░░░░░░░██\r\n"
				+ "██░░░░░░░░░░░░░░░░░░██║████╗░██║██╔════╝██╔════╝██╔══██╗╚══██╔══╝██╔════╝░░██╔══██╗████╗░██║██║░░░░░░░░░░░░░░░░░░░██\r\n"
				+ "██░░░░░░░░░░░░░░░░░░██║██╔██╗██║╚█████╗░█████╗░░██████╔╝░░░██║░░░█████╗░░░░██║░░██║██╔██╗██║██║░░░░░░░░░░░░░░░░░░░██\r\n"
				+ "██░░░░░░░░░░░░░░░░░░██║██║╚████║░╚═══██╗██╔══╝░░██╔══██╗░░░██║░░░██╔══╝░░░░██║░░██║██║╚████║██║░░░░░░░░░░░░░░░░░░░██\r\n"
				+ "██░░░░░░░░░░░░░░░░░░██║██║░╚███║██████╔╝███████╗██║░░██║░░░██║░░░███████╗░░██████╔╝██║░╚███║██║░░░░░░░░░░░░░░░░░░░██\r\n"
				+ "██░░░░░░░░░░░░░░░░░░╚═╝╚═╝░░╚══╝╚═════╝░╚══════╝╚═╝░░╚═╝░░░╚═╝░░░╚══════╝░░╚═════╝░╚═╝░░╚══╝╚═╝░░░░░░░░░░░░░░░░░░░██\r\n"
				+ "██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██\r\n"
				+ "████████████████████████████████████████████████████████████████████████████████████████████████████████████████████\r\n");
		insertDni = sc.nextLine();
		return insertDni;
	}

	public static int instertAge() {
		int insertAge = 0;

		System.out.println("\r\n"
				+ "██████████████████████████████████████████████████████████████████████████████████████████████████████████████\r\n"
				+ "██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██\r\n"
				+ "██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██\r\n"
				+ "██░░░░░░░██╗███╗░░██╗░██████╗███████╗██████╗░████████╗███████╗░░███████╗██████╗░░█████╗░██████╗░░░░░░░░░░░░░██\r\n"
				+ "██░░░░░░░██║████╗░██║██╔════╝██╔════╝██╔══██╗╚══██╔══╝██╔════╝░░██╔════╝██╔══██╗██╔══██╗██╔══██╗░░░░░░░░░░░░██\r\n"
				+ "██░░░░░░░██║██╔██╗██║╚█████╗░█████╗░░██████╔╝░░░██║░░░█████╗░░░░█████╗░░██║░░██║███████║██║░░██║░░░░░░░░░░░░██\r\n"
				+ "██░░░░░░░██║██║╚████║░╚═══██╗██╔══╝░░██╔══██╗░░░██║░░░██╔══╝░░░░██╔══╝░░██║░░██║██╔══██║██║░░██║░░░░░░░░░░░░██\r\n"
				+ "██░░░░░░░██║██║░╚███║██████╔╝███████╗██║░░██║░░░██║░░░███████╗░░███████╗██████╔╝██║░░██║██████╔╝░░░░░░░░░░░░██\r\n"
				+ "██░░░░░░░╚═╝╚═╝░░╚══╝╚═════╝░╚══════╝╚═╝░░╚═╝░░░╚═╝░░░╚══════╝░░╚══════╝╚═════╝░╚═╝░░╚═╝╚═════╝░░░░░░░░░░░░░██\r\n"
				+ "██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██\r\n"
				+ "██████████████████████████████████████████████████████████████████████████████████████████████████████████████\r\n");
		insertAge = sc.nextInt();
		return insertAge;

	}

	public static String insterAdrress() {

		System.out.println("\r\n"
				 + "██████████████████████████████████████████████████████████████████████████████████████████████████████████████\r\n"				
				 + "██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██\r\n"
				 + "██░░░░░░░░░░░░░░░░░░░░░░░░░░██╗███╗░░██╗░██████╗███████╗██████╗░████████╗███████╗░░░░░░░░░░░░░░░░░░░░░░░░░░░██\r\n"
				 + "██░░░░░░░░░░░░░░░░░░░░░░░░░░██║████╗░██║██╔════╝██╔════╝██╔══██╗╚══██╔══╝██╔════╝░░░░░░░░░░░░░░░░░░░░░░░░░░░██\r\n"
				 + "██░░░░░░░░░░░░░░░░░░░░░░░░░░██║██╔██╗██║╚█████╗░█████╗░░██████╔╝░░░██║░░░█████╗░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██\r\n"
				 + "██░░░░░░░░░░░░░░░░░░░░░░░░░░██║██║╚████║░╚═══██╗██╔══╝░░██╔══██╗░░░██║░░░██╔══╝░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██\r\n"
				 + "██░░░░░░░░░░░░░░░░░░░░░░░░░░██║██║░╚███║██████╔╝███████╗██║░░██║░░░██║░░░███████╗░░░░░░░░░░░░░░░░░░░░░░░░░░░██\r\n"				
				 + "██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██\r\n"
				 + "██░░░░░░░░░░░░░░░░░░░░░██████╗░██╗██████╗░███████╗░█████╗░░█████╗░██╗░█████╗░███╗░░██╗░░░░░░░░░░░░░░░░░░░░░░██\r\n"	
				 + "██░░░░░░░░░░░░░░░░░░░░░██╔══██╗██║██╔══██╗██╔════╝██╔══██╗██╔══██╗██║██╔══██╗████╗░██║░░░░░░░░░░░░░░░░░░░░░░██\r\n"	
				 + "██░░░░░░░░░░░░░░░░░░░░░██║░░██║██║██████╔╝█████╗░░██║░░╚═╝██║░░╚═╝██║██║░░██║██╔██╗██║░░░░░░░░░░░░░░░░░░░░░░██\r\n"	
				 + "██░░░░░░░░░░░░░░░░░░░░░██║░░██║██║██╔══██╗██╔══╝░░██║░░██╗██║░░██╗██║██║░░██║██║╚████║░░░░░░░░░░░░░░░░░░░░░░██\r\n"	
				 + "██░░░░░░░░░░░░░░░░░░░░░██████╔╝██║██║░░██║███████╗╚█████╔╝╚█████╔╝██║╚█████╔╝██║░╚███║░░░░░░░░░░░░░░░░░░░░░░██\r\n"	
				 + "██░░░░░░░░░░░░░░░░░░░░░╚═════╝░╚═╝╚═╝░░╚═╝╚══════╝░╚════╝░░╚════╝░╚═╝░╚════╝░╚═╝░░╚══╝░░░░░░░░░░░░░░░░░░░░░░██\r\n"	
				 + "██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██\r\n"
				 + "██████████████████████████████████████████████████████████████████████████████████████████████████████████████\r\n");
		
		return sc.nextLine();
	}
}