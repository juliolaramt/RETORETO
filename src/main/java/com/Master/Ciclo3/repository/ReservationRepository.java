package com.Master.Ciclo3.repository;

//Master.Ciclo3  reemplaza a doctors

import com.Master.Ciclo3.modelo.DoctorModel;
import com.Master.Ciclo3.modelo.ReservationModel;
import com.Master.Ciclo3.repository.crudrepository.ReservationCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ReservationRepository {

    @Autowired
    private ReservationCrudRepository reservationCrudRepository;

    public List<ReservationModel> getAllReservations() {
        return (List<ReservationModel>) reservationCrudRepository.findAll();
    }

    public Optional<ReservationModel> getReservation(Integer idReservation) {
        return reservationCrudRepository.findById(idReservation);
    }

    public ReservationModel saveReservation(ReservationModel reservationModel ){

        return reservationCrudRepository.save(reservationModel);
    }

    public boolean deleteReservation(Integer idReservation){
        reservationCrudRepository.deleteById(idReservation);
        return true;
    }

    public ReservationModel updateReservation (ReservationModel reservationModel ){
        return reservationCrudRepository.save(reservationModel);
    }
}
