package com.Master.Ciclo3.repository.crudrepository;

//Master.Ciclo3  reemplaza a doctors
import com.Master.Ciclo3.modelo.ScoreModel;
import org.springframework.data.repository.CrudRepository;

public interface ScoreCrudRepository extends CrudRepository<ScoreModel, Integer>{
}
