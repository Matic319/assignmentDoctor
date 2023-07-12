package com.patientapi.Assignment.Service;

import com.patientapi.Assignment.Model.Doctor;
import com.patientapi.Assignment.Repository.DoctorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class DoctorServiceImplementation implements DoctorService {

    DoctorRepository doctorRepository;
    public DoctorServiceImplementation(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }


    @Override
    public String createDoctor(Doctor doctor) {
        doctorRepository.save(doctor);
        return "Doctor data saved!";
    }

    @Override
    public String deleteDoctor(String doctorId) {
        doctorRepository.deleteById(doctorId);
        return "Doctor deleted!";
    }

    @Override
    public String updateDoctor(Doctor doctor) {
        doctorRepository.save(doctor);
        return "Doctor details updated!";
    }

    @Override
    public Optional<Doctor> getDoctor(String doctorId) {
        return doctorRepository.findById(doctorId);
    }

    @Override
    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }
}
