package com.Master.Ciclo3.service;

//Master.Ciclo3  reemplaza a doctors
import com.Master.Ciclo3.modelo.ClientModel;
import com.Master.Ciclo3.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public List<ClientModel> getAllClients(){
        return clientRepository.getAllClients();
    }
    public Optional<ClientModel> getClient(Integer idClient){
        return clientRepository.getClient(idClient);
    }
    public ClientModel saveClient(ClientModel clientModel){
        return clientRepository.saveClient(clientModel);
    }
    public boolean deleteClient(Integer idClient){
        return clientRepository.deleteClient(idClient);
    }
    public ClientModel updateClient(ClientModel clientModel){
        return clientRepository.updateClient(clientModel);
    }

}
