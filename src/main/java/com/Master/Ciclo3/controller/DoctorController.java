package com.Master.Ciclo3.controller;

//Master.Ciclo3  reemplaza a doctors
import com.Master.Ciclo3.modelo.DoctorModel;
import com.Master.Ciclo3.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Doctor")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class DoctorController {
    @Autowired
    private DoctorService doctorService;

    @GetMapping("/all")
    public List<DoctorModel> getAllDoctors(){
        return doctorService.getAllDoctors();
    }
    @GetMapping("/{id}")
    public Optional <DoctorModel> getDoctor(@PathVariable Integer id){
        return doctorService.getDoctor(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public DoctorModel saveDoctor(@RequestBody DoctorModel doctorModel){
        return doctorService.saveDoctor(doctorModel);
    }
    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean deleteDoctor(@PathVariable Integer id){
        return doctorService.deleteDoctor(id);
    }
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public DoctorModel updateDoctor(@RequestBody DoctorModel doctorModel){
        return doctorService.updateDoctor(doctorModel);
    }
}
