package Interfaces;

import java.util.List;
/**
 * Interfaz del repositorio de clientes la cual usaremos para
 *  recordar que metodos tenemos que implementar en nuestra clase.
 */
public interface IRepositoryClients {

  /**
   * Devuelve la lista de todos los clientes en le repositorio
   * 
   * @return lista de clientes en el repositorio
   */
  List<IClient> getAllClients();

  /**
   * Busca clientes por un nombre recibido por parámetro
   * 
   * @param name
   * @return la posicion del cliente en el repositorio
   */
  int searchClientByName(String name);

  /**
   * Busca clientes por un dni recibido por parámetro
   * 
   * @param name
   * @return la posicion del cliente en el repositorio
   */
  int searchClientByDni(String dni);

  /**
   * Modifica un cliente
   * 
   * @param cliente
   * @return true si ha sido efectuado correctamente
   */
  boolean updateClient(IClient cliente);

  /**
   * añade un cliente al repositorio
   * 
   * @param cliente
   * @return treue si ha sido efectuado correctamente
   */
  boolean addClient(IClient cliente);

  /**
   * borra un cliente del repositorio
   * 
   * @param dni
   * @return treue si ha sido efectuado correctamente
   */
  boolean deleteClient(String dni);
}
