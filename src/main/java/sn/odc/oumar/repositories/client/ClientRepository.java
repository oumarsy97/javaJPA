package sn.odc.oumar.repositories.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.odc.oumar.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client,Integer > {
    //ajouter des méthodes spécifiques pour la gestion des clients


}
