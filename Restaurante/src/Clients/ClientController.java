package Clients;

import java.util.List;
import java.util.Scanner;

import Interfaces.IClient;
import Interfaces.IPerson;
import Products.Food;
import UIUtils.introducir;

public class ClientController {
	// Llamada al metodo de mostrar clientes.
	public static void ShowClients(List<IClient> Clientes) {

		printListClient(Clientes);
	}

	public static void createClient(Client Cliente) {
		Scanner sc = new Scanner(System.in);
		String name,address,dni;
		int edad;
		
		if(Cliente != null ) {
			
			Client dummy  = new Client();
			
		}

	}

	public static void modifyClient(RepositoryClients repo) {
		Scanner sc = new Scanner(System.in);
		String nombre = sc.next();
		if (nombre != null && repo != null) {
			Client dummy = new Client(nombre);
			if (repo.getAllClients().contains(dummy)) {
				int index = repo.getAllClients().indexOf(dummy);

				System.out.println("¿Quiere modificar el nombre? y/n");
				if (introducir.getChar() == 'y') {
					repo.getAllClients().get(index).setName(introducir.getString("Introduzca su nuevo nombre: "));
				}
				System.out.println("¿Quiere modificar el dni? y/n");
				if (introducir.getChar() == 'y') {
					repo.getAllClients().get(index).setDni(introducir.getString("Introduzca su nuevo dni: "));
				}
				System.out.println("¿Quiere modificar la Edad? y/n");
				if (introducir.getChar() == 'y') {
					repo.getAllClients().get(index).setAge(introducir.getInt("Introduzca la nueva edad: "));
				}
				System.out.println("¿Quiere modificar la direccion? y/n");
				if (introducir.getChar() == 'y') {
					repo.getAllClients().get(index).addAddress(introducir.getString("Introduzca la nueva direccion: "));
				}
			}
		}
	}

	public static void ShowPoints(RepositoryClients repo) {
		Scanner sc = new Scanner(System.in);
		String nombre = sc.next();
		if (nombre != null && repo != null) {
			Client dummy = new Client(nombre);
			if (repo.getAllClients().contains(dummy)) {
				System.out.println(dummy.getPoints());
			}
	
		}
	}
	public static void ClientsAddress(List<IClient> address) {
		printListClient(address);
	}

	/**
	 * Metodo que recorre la lista de clientes y va mostrando los clientes que hay
	 * sino esta vacío.
	 * 
	 * @param list
	 */
	public static void printListClient(List<IClient> list) {
		int count = 0;
		if (list != null && list.size() > 0) {
			for (IClient object : list) {
				if (count != 0) {
					System.out.print(", ");
				}
				System.out.print(object.getName());
				count++;
			}
		}
	}

	/**
	 * Metodo que recorre la lista de clientes y va mostrando las direcciones del
	 * cliente que hay sino esta vacío.
	 * 
	 * @param list
	 */
	public static void printListAddress(List<IClient> list) {
		Scanner sc = new Scanner(System.in);
		String nombre = sc.next();
		IClient dummy = new Client(nombre);
		int count = 0;
		if (list != null && list.size() > 0 && list.contains(dummy)) {
			System.out.print(dummy.getAddress());
			}
		}
}
