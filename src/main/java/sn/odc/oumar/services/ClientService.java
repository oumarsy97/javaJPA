package sn.odc.oumar.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sn.odc.oumar.entities.Client;
import sn.odc.oumar.repositories.client.ClientRepository;
import sn.odc.oumar.repositories.client.IClientService;

@Service
public class ClientService implements IClientService {
   private final ClientRepository clientRepository;
    @Autowired
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public Client saveClient(Client client) {
        return clientRepository.save(client);
    }

    public Client getClientById(int id) {
        return clientRepository.findById(id).orElse(null);
    }

    public void deleteClient(int id) {
        clientRepository.deleteById(id);
    }

    @Override
    public Iterable<Client> getAllClients() {
        return null;
    }

    public Iterable<Client> findAll() {
        return clientRepository.findAll();
    }


}
