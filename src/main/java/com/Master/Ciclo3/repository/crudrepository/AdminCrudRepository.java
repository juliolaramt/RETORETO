package com.Master.Ciclo3.repository.crudrepository;

//Master.Ciclo3  reemplaza a doctors
import com.Master.Ciclo3.modelo.AdminModel;
import org.springframework.data.repository.CrudRepository;

public interface AdminCrudRepository extends CrudRepository<AdminModel,Integer> {
}
