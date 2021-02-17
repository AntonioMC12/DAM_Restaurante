package Cliente;

import java.util.ArrayList;
import java.util.List;

import productInterfaces.IProduct;

/**
 * Repositorio donde tendremos a todos los cientes y los metodos que podremos
 * utilizar como buscar,updatear o borrar clientes.
 * 
 * @author Abepuoh
 *
 */									   	  //Quizas deberiamos cambiar por clientInterfaces
public class RepositoryClients implements productInterfaces.IRepositoryClients {

	private List<Client> Clients;

	public RepositoryClients(List<Client> lista) {
		this.Clients = lista ;
	}

	public List<Client> getAllClients() {
		List<Client> Clients;
		Clients=new ArrayList<>();
		lista.
		return Clients;
	}

	public List<Client> searchClients(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Client> updateClients(Client c) {
		// TODO Auto-generated method stub
		return null;
	}

	public void addClient(Client c) {
		List<Client> lista;
		lista=new ArrayList<>();
		if(lista!=null && lista.contains(c)) {
			lista.add(c)
		
			
	}

	public Client deleteclients(String dni) {
		// TODO Auto-generated method stub
		return null;
	}

	public Client searchClient(String dni) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "RepositoryClients [Clientes=" + lista + "]";
	}
}
