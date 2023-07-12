package com.patientapi.Assignment.Repository;

import com.patientapi.Assignment.Model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, String> {

}
