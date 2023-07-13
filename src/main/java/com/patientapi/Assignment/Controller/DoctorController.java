package com.patientapi.Assignment.Controller;


import com.patientapi.Assignment.Model.Doctor;
import com.patientapi.Assignment.Service.DoctorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    DoctorService doctorService;
    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @GetMapping("{doctorId}")
    public Optional<Doctor> getDoctorDetails(@PathVariable("doctorId") String doctorId){

        return doctorService.getDoctor(doctorId);
    }

    @PostMapping
    public String createDoctorDetails( @RequestBody Doctor doctor){
        doctorService.createDoctor(doctor);
        return "Doctor details created!";
    }

    @PutMapping
    public String updateDoctorDetails(@RequestBody Doctor doctor){
        doctorService.updateDoctor(doctor);
        return "Doctor details updated!";
    }

    @DeleteMapping("/{doctorId}")
    public String deleteDoctorDetails(@PathVariable String doctorId){
        doctorService.deleteDoctor(doctorId);
        return "Doctor details deleted!";
    }

    @GetMapping
    public List<Doctor> getAllDoctorDetails() {
        return doctorService.getAllDoctors();
    }

}