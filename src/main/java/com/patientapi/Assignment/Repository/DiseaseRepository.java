package com.patientapi.Assignment.Repository;

import com.patientapi.Assignment.Model.Disease;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiseaseRepository extends JpaRepository<Disease,String> {
}
