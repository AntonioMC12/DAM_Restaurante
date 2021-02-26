package Menu;

import java.util.Scanner;

public class MenuProducts {
	private static Scanner sc = new Scanner(System.in);

	public static int menuProducts() {
		int mainProducts = 0;
		System.out.println("\r\n"
				+ "█████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████\r\n"
				+ "██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██\r\n"
				+ "██░░███╗░░░███╗███████╗███╗░░██╗██╗░░░██╗░░██████╗░██████╗░░█████╗░██████╗░██╗░░░██╗░█████╗░████████╗░█████╗░░██████╗░░██\r\n"
				+ "██░░████╗░████║██╔════╝████╗░██║██║░░░██║░░██╔══██╗██╔══██╗██╔══██╗██╔══██╗██║░░░██║██╔══██╗╚══██╔══╝██╔══██╗██╔════╝░░██\r\n"
				+ "██░░██╔████╔██║█████╗░░██╔██╗██║██║░░░██║░░██████╔╝██████╔╝██║░░██║██║░░██║██║░░░██║██║░░╚═╝░░░██║░░░██║░░██║╚█████╗░░░██\r\n"
				+ "██░░██║╚██╔╝██║██╔══╝░░██║╚████║██║░░░██║░░██╔═══╝░██╔══██╗██║░░██║██║░░██║██║░░░██║██║░░██╗░░░██║░░░██║░░██║░╚═══██╗░░██\r\n"
				+ "██░░██║░╚═╝░██║███████╗██║░╚███║╚██████╔╝░░██║░░░░░██║░░██║╚█████╔╝██████╔╝╚██████╔╝╚█████╔╝░░░██║░░░╚█████╔╝██████╔╝░░██\r\n"
				+ "██░░╚═╝░░░░░╚═╝╚══════╝╚═╝░░╚══╝░╚═════╝░░░╚═╝░░░░░╚═╝░░╚═╝░╚════╝░╚═════╝░░╚═════╝░░╚════╝░░░░╚═╝░░░░╚════╝░╚═════╝░░░██\r\n"
				+ "██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██\r\n"
				+ "█████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████\r\n"
				+ "██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██\r\n"
				+ "██░░░░░███╗░░░░░██╗░░░██╗███████╗██████╗░░░██████╗░██████╗░░█████╗░██████╗░██╗░░░██╗░█████╗░████████╗░█████╗░░██████╗░░██\r\n"
				+ "██░░░░████║░░░░░██║░░░██║██╔════╝██╔══██╗░░██╔══██╗██╔══██╗██╔══██╗██╔══██╗██║░░░██║██╔══██╗╚══██╔══╝██╔══██╗██╔════╝░░██\r\n"
				+ "██░░░██╔██║░░░░░╚██╗░██╔╝█████╗░░██████╔╝░░██████╔╝██████╔╝██║░░██║██║░░██║██║░░░██║██║░░╚═╝░░░██║░░░██║░░██║╚█████╗░░░██\r\n"
				+ "██░░░╚═╝██║░░░░░░╚████╔╝░██╔══╝░░██╔══██╗░░██╔═══╝░██╔══██╗██║░░██║██║░░██║██║░░░██║██║░░██╗░░░██║░░░██║░░██║░╚═══██╗░░██\r\n"
				+ "██░░░███████╗██╗░░╚██╔╝░░███████╗██║░░██║░░██║░░░░░██║░░██║╚█████╔╝██████╔╝╚██████╔╝╚█████╔╝░░░██║░░░╚█████╔╝██████╔╝░░██\r\n"
				+ "██░░░╚══════╝╚═╝░░░╚═╝░░░╚══════╝╚═╝░░╚═╝░░╚═╝░░░░░╚═╝░░╚═╝░╚════╝░╚═════╝░░╚═════╝░░╚════╝░░░░╚═╝░░░░╚════╝░╚═════╝░░░██\r\n"
				+ "██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██\r\n"
				+ "██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██\r\n"
				+ "██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██████╗░░░░██╗░░░██╗███████╗██████╗░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██\r\n"
				+ "██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░╚════██╗░░░██║░░░██║██╔════╝██╔══██╗░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██\r\n"
				+ "██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░███╔═╝░░░╚██╗░██╔╝█████╗░░██████╔╝░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██\r\n"
				+ "██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██╔══╝░░░░░░╚████╔╝░██╔══╝░░██╔══██╗░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██\r\n"
				+ "██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░███████╗██╗░░╚██╔╝░░███████╗██║░░██║░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██\r\n"
				+ "██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░╚══════╝╚═╝░░░╚═╝░░░╚══════╝╚═╝░░╚═╝░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██\r\n"
				+ "██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██\r\n"
				+ "██░░░░░░░░░░░░░░░██████╗░██╗░░░██╗███╗░░██╗██████╗░██╗░░░░░███████╗██████╗░░█████╗░░█████╗░██╗░░██╗░░░░░░░░░░░░░░░░░░░░██\r\n"
				+ "██░░░░░░░░░░░░░░░██╔══██╗██║░░░██║████╗░██║██╔══██╗██║░░░░░██╔════╝██╔══██╗██╔══██╗██╔══██╗██║░██╔╝░░░░░░░░░░░░░░░░░░░░██\r\n"
				+ "██░░░░░░░░░░░░░░░██████╦╝██║░░░██║██╔██╗██║██║░░██║██║░░░░░█████╗░░██████╔╝███████║██║░░╚═╝█████═╝░░░░░░░░░░░░░░░░░░░░░██\r\n"
				+ "██░░░░░░░░░░░░░░░██╔══██╗██║░░░██║██║╚████║██║░░██║██║░░░░░██╔══╝░░██╔═══╝░██╔══██║██║░░██╗██╔═██╗░░░░░░░░░░░░░░░░░░░░░██\r\n"
				+ "██░░░░░░░░░░░░░░░██████╦╝╚██████╔╝██║░╚███║██████╔╝███████╗███████╗██║░░░░░██║░░██║╚█████╔╝██║░╚██╗░░░░░░░░░░░░░░░░░░░░██\r\n"
				+ "██░░░░░░░░░░░░░░░╚═════╝░░╚═════╝░╚═╝░░╚══╝╚═════╝░╚══════╝╚══════╝╚═╝░░░░░╚═╝░░╚═╝░╚════╝░╚═╝░░╚═╝░░░░░░░░░░░░░░░░░░░░██\r\n"
				+ "██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██\r\n"
				+ "██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██\r\n"
				+ "██░░░░░░░░░░░░░░░░░░░░░░░░░░░██████╗░░░░░░░█████╗░████████╗██████╗░░█████╗░░██████╗░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██\r\n"
				+ "██░░░░░░░░░░░░░░░░░░░░░░░░░░░╚════██╗░░░░░██╔══██╗╚══██╔══╝██╔══██╗██╔══██╗██╔════╝░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██\r\n"
				+ "██░░░░░░░░░░░░░░░░░░░░░░░░░░░░█████╔╝░░░░░███████║░░░██║░░░██████╔╝███████║╚█████╗░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██\r\n"
				+ "██░░░░░░░░░░░░░░░░░░░░░░░░░░░░╚═══██╗░░░░░██╔══██║░░░██║░░░██╔══██╗██╔══██║░╚═══██╗░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██\r\n"
				+ "██░░░░░░░░░░░░░░░░░░░░░░░░░░░██████╔╝██╗░░██║░░██║░░░██║░░░██║░░██║██║░░██║██████╔╝░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██\r\n"
				+ "██░░░░░░░░░░░░░░░░░░░░░░░░░░░╚═════╝░╚═╝░░╚═╝░░╚═╝░░░╚═╝░░░╚═╝░░╚═╝╚═╝░░╚═╝╚═════╝░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██\r\n"
				+ "██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██\r\n"
				+ "█████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████\r\n");
		mainProducts = sc.nextInt();
		return mainProducts;
	}
}
