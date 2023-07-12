package com.patientapi.Assignment.Repository;

import com.patientapi.Assignment.Model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor,String> {
}
