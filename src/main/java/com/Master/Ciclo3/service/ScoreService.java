package com.Master.Ciclo3.service;

//Master.Ciclo3  reemplaza a doctors

import com.Master.Ciclo3.modelo.ScoreModel;
import com.Master.Ciclo3.repository.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ScoreService {

    @Autowired
    private ScoreRepository scoreRepository;

    public List<ScoreModel> getAllScores(){
        return scoreRepository.getAllScores();
    }

    public Optional<ScoreModel> getScore(Integer id){
        return scoreRepository.getScore(id);
    }

    public ScoreModel saveScore(ScoreModel scoreModel){
        return scoreRepository.saveScore(scoreModel);
    }

    public boolean deleteScore(Integer id){
        return scoreRepository.deleteScore(id);
    }

    public ScoreModel updateScore(ScoreModel scoreModel){
        return scoreRepository.updateScore(scoreModel);
    }

}
