package sn.odc.oumar.controllers;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import sn.odc.oumar.entities.Client;
import sn.odc.oumar.services.ClientService;

import java.util.List;


@RestController
//@RequestMapping("/api/clients")

public class ClientController {
    private  final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping
    public List<Client> getAllClients() {
        return clientService.findAll();
    }

}
