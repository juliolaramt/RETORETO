package com.Master.Ciclo3.service;

//Master.Ciclo3  reemplaza a doctors
import com.Master.Ciclo3.modelo.DoctorModel;
import com.Master.Ciclo3.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorService {
    @Autowired
    private DoctorRepository doctorRepository;

    public List<DoctorModel> getAllDoctors(){
        return doctorRepository.getAllDoctors();
    }

    public Optional<DoctorModel> getDoctor(Integer id){
        return doctorRepository.getDoctor(id);
    }

    public DoctorModel saveDoctor(DoctorModel doctorModel){
        return doctorRepository.saveDoctor(doctorModel);
    }

    public boolean deleteDoctor (Integer id){
        return doctorRepository.deleteDoctor(id);
    }

    public DoctorModel updateDoctor(DoctorModel doctorModel){
        return doctorRepository.updateDoctor(doctorModel);
    }


}

