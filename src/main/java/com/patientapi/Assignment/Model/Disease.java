package com.patientapi.Assignment.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name="disease")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Disease {

    @Id
    private String Disease;

    @ManyToMany(mappedBy = "diseases")
    private List<Patient> patients;

}
