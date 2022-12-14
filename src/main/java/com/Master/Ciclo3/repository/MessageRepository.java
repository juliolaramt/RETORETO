package com.Master.Ciclo3.repository;

//Master.Ciclo3  reemplaza a doctors

import com.Master.Ciclo3.modelo.MessageModel;
import com.Master.Ciclo3.repository.crudrepository.MessageCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class MessageRepository {

    @Autowired
    private MessageCrudRepository messageCrudRepository;

    public List<MessageModel> getAllMessages() {
        return (List<MessageModel>) messageCrudRepository.findAll();
    }

    public Optional<MessageModel> getMessage(Integer idMessage) {
        return messageCrudRepository.findById(idMessage);
    }

    public MessageModel saveMessage(MessageModel messageModel){

        return messageCrudRepository.save(messageModel);
    }
    public boolean deleteMessage(Integer idMessage){
        messageCrudRepository.deleteById(idMessage);
        return true;
    }

    public MessageModel updateMessage (MessageModel messageModel ){
        return messageCrudRepository.save(messageModel);
    }

}
