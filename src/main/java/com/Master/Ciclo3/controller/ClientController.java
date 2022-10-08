package com.Master.Ciclo3.controller;

//Master.Ciclo3  reemplaza a doctors
import com.Master.Ciclo3.modelo.ClientModel;
import com.Master.Ciclo3.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Client")
//@CrossOrigin(origins = "*")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class ClientController {
    @Autowired
    private ClientService clientService;

    @GetMapping("/all")
    public List<ClientModel> getAllClients(){
        return clientService.getAllClients();
    }

    @GetMapping("/{idClient}")
    public Optional<ClientModel> getClient(@PathVariable Integer idClient){
        return clientService.getClient(idClient);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public ClientModel saveClient(@RequestBody ClientModel clientModel){
        return clientService.saveClient(clientModel);
    }

    @DeleteMapping("/delete/{idClient}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean deleteClient(@PathVariable Integer idClient){
        return clientService.deleteClient(idClient);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public ClientModel updateClient(@RequestBody ClientModel clientModel){
        return clientService.updateClient(clientModel);
    }

}
