

public class Menu {
	
	public void welcomeMenu() {
		/**
		 * Menu de incio para el usuario. 
		 *
		 */
		                                                                                                                                                                                                                                                                                                                                                   
		System.out.println("██████╗░██╗███████╗███╗░░██╗██╗░░░██╗███████╗███╗░░██╗██╗██████╗░░█████╗░░██████╗  ░█████╗░██╗░░░░░\r\n"
						 + "██╔══██╗██║██╔════╝████╗░██║██║░░░██║██╔════╝████╗░██║██║██╔══██╗██╔══██╗██╔════╝  ██╔══██╗██║░░░░░\r\n"
						 + "██████╦╝██║█████╗░░██╔██╗██║╚██╗░██╔╝█████╗░░██╔██╗██║██║██║░░██║██║░░██║╚█████╗░  ███████║██║░░░░░\r\n"
						 + "██╔══██╗██║██╔══╝░░██║╚████║░╚████╔╝░██╔══╝░░██║╚████║██║██║░░██║██║░░██║░╚═══██╗  ██╔══██║██║░░░░░\r\n"
						 + "██████╦╝██║███████╗██║░╚███║░░╚██╔╝░░███████╗██║░╚███║██║██████╔╝╚█████╔╝██████╔╝  ██║░░██║███████╗\r\n"
						 + "╚═════╝░╚═╝╚══════╝╚═╝░░╚══╝░░░╚═╝░░░╚══════╝╚═╝░░╚══╝╚═╝╚═════╝░░╚════╝░╚═════╝░  ╚═╝░░╚═╝╚══════╝\r\n"
						 + "\r\n"
						 + "██████╗░███████╗░██████╗████████╗░█████╗░██╗░░░██╗██████╗░░█████╗░███╗░░██╗████████╗███████╗\r\n"
						 + "██╔══██╗██╔════╝██╔════╝╚══██╔══╝██╔══██╗██║░░░██║██╔══██╗██╔══██╗████╗░██║╚══██╔══╝██╔════╝\r\n"
						 + "██████╔╝█████╗░░╚█████╗░░░░██║░░░███████║██║░░░██║██████╔╝███████║██╔██╗██║░░░██║░░░█████╗░░\r\n"
						 + "██╔══██╗██╔══╝░░░╚═══██╗░░░██║░░░██╔══██║██║░░░██║██╔══██╗██╔══██║██║╚████║░░░██║░░░██╔══╝░░\r\n"
						 + "██║░░██║███████╗██████╔╝░░░██║░░░██║░░██║╚██████╔╝██║░░██║██║░░██║██║░╚███║░░░██║░░░███████╗\r\n"
						 + "╚═╝░░╚═╝╚══════╝╚═════╝░░░░╚═╝░░░╚═╝░░╚═╝░╚═════╝░╚═╝░░╚═╝╚═╝░░╚═╝╚═╝░░╚══╝░░░╚═╝░░░╚══════╝\r\n"
						 + "\r\n"
						 + "███╗░░░███╗░█████╗░██████╗░░█████╗░██╗░░░░░██╗░░░░░░█████╗░\r\n"
						 + "████╗░████║██╔══██╗██╔══██╗██╔══██╗██║░░░░░██║░░░░░██╔══██╗\r\n"
						 + "██╔████╔██║██║░░╚═╝██████╔╝██║░░██║██║░░░░░██║░░░░░██║░░██║\r\n"
						 + "██║╚██╔╝██║██║░░██╗██╔═══╝░██║░░██║██║░░░░░██║░░░░░██║░░██║\r\n"
						 + "██║░╚═╝░██║╚█████╔╝██║░░░░░╚█████╔╝███████╗███████╗╚█████╔╝");
				
	}
	public void chooseMenu() {
		/**
		 * Menu de elección para el usuario.
		 */
		int platos=0;
		int bebidas=0;
		int postre=0;
	
	//menú de elección de platos
		switch(platos) {
		
			case 1: System.out.println("Ensalada");
			 	break;
			
			case 2: System.out.println("filete con patatas");
				break;
			
			case 3: System.out.println("Hamburguesa");
			 	break;
			 
			case 4: System.out.println("pizza boloñesa");
		
		}
		
	//menú de elección de bebidas
		
		switch(bebidas) {
		
		case 1: System.out.println("Agua");
		 	break;
		
		case 2: System.out.println("Coca-cola");
			break;
		
		case 3: System.out.println("Fanta");
		 	break;
		 
		case 4: System.out.println("Cerveza");
	
	}	
		
		
	}
	public void registerClient(){
		/**
		 * Registra a un cliente
		 * 
		 * @return Cliente nuevo.
		 */
		//clientX es el cliente que se vaya a registrar.
		Cliente clientX=new Cliente();
		
	}
	public void deleteClient() {
		/**
		 * Elimina todos los datos del cliente y lo borra.
		 */
	}
	public void updateClient() {
		/**
		 * Cambia datos del cliente.
		 */
	}
	public void searchClient() {
		/**
		 * Busca a un cliente.
		 */
	}
	public void showDrinks() {
		/**
		 * Muestra las bebidas.
		 */
		System.out.println("");
		System.out.println("---BEBIDAS---");
		System.out.println("");
		System.out.println("1.Agua");
		System.out.println("2.Coca-cola");
		System.out.println("3.Fanta");
		System.out.println("4.Cerveza");
		System.out.println("");
	}
	public void ShowDishes() {
		/**
		 * Muestra los platos.
		 */
		
		System.out.println("---PLATOS---");
		System.out.println("");
		System.out.println("1.Ensalada");
		System.out.println("2.Filete con patatas");
		System.out.println("3.Hamburguesa");
		System.out.println("4.Pizza boloñesa");
		System.out.println("");
	}
	public void ShowCombos() {
		/**
		 * Show the available combos.
		 */
	}
}

