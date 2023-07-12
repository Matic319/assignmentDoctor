package com.patientapi.Assignment.Service;

import com.patientapi.Assignment.Model.Doctor;

import java.util.List;
import java.util.Optional;

public interface DoctorService {
    public String createDoctor(Doctor doctor);
    public String deleteDoctor(String doctorId);
    public String updateDoctor(Doctor doctor);
    public Optional<Doctor> getDoctor(String doctorId);
    public List<Doctor> getAllDoctors();
}
