package sn.odc.oumar.repositories.client;

import sn.odc.oumar.entities.Client;

public interface IClientService {
    public Client saveClient(Client client);
    public Client getClientById(int id);
    public void deleteClient(int id);
    public Iterable<Client> getAllClients();


}
