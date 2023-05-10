package com.Healthcare.Services;

import com.Healthcare.Models.Patients;
import com.Healthcare.Repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
     @Autowired
    PatientRepository patientRepository;

     public List<Patients> gteAllPatients(){
         return patientRepository.findAll();
     }
}
