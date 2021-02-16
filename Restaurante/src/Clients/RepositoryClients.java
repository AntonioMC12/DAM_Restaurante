package Clients;

import java.util.ArrayList;
import java.util.List;

import Interfaces.IClient;
import Interfaces.IRepositoryClients;

/**
 * Repositorio donde tendremos a todos los cientes y los metodos que podremos
 * utilizar como buscar,updatear o borrar clientes.
 * 
 * @author Abepuoh
 *
 */ 

public class RepositoryClients implements IRepositoryClients {

  private List<IClient> clients;

  public RepositoryClients(List<IClient> clients) {
    super();
    this.clients = clients;
  }

  public RepositoryClients() {
    List<IClient> clientes = new ArrayList<>();
    this.clients = clientes;
  }

  @Override
  public List<IClient> getAllClients() {

    return this.clients;
  }

  @Override
  public int searchClientByName(String name) {
    int searchClientByName = -1;

    if (name != null && this.clients.size() > 0) {
      for (int i = 0; i < this.clients.size(); i++) {
        if (this.clients.get(i).getName().equals(name)) {
          searchClientByName = i;
        }
      }
    }
    return searchClientByName;
  }

  @Override
  public int searchClientByDni(String dni) {
    int searchClientByDni = -1;
    Client aux = new Client(dni);

    if (dni != null && this.clients.size() > 0) {
      if (this.clients.contains(aux)) {
        searchClientByDni = this.clients.indexOf(aux);
      }
    }

    return searchClientByDni;
  }

  @Override
  public boolean updateClient(IClient cliente) {
    //falta por implementar. Se hará mas adelante.
    return false;
  }

  @Override
  public boolean addClient(IClient cliente) {

    boolean addClient = false;
    if (cliente != null && !this.clients.contains(cliente)) {
      this.clients.add(cliente);
      addClient = true;
    }
    return addClient;
  }

  @Override
  public boolean deleteClient(String dni) {

    return false;
  }

}
