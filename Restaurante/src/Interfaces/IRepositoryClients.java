package Interfaces;

import java.util.List;

public interface IRepositoryClients {

  List<IClient> getAllClients();

  int searchClientByName(String name);

  int searchClientByDni(String dni);

  boolean updateClient(IClient cliente);

  boolean addClient(IClient cliente);

  boolean deleteClient(String dni);
}
