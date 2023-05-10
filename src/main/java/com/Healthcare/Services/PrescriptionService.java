package com.Healthcare.Services;

import com.Healthcare.Models.Prescriptions;
import com.Healthcare.Repositories.PrescriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrescriptionService {
    @Autowired
    PrescriptionRepository prescriptionRepository;

    public List<Prescriptions> getAllPrescriptions(){
        return prescriptionRepository.findAll();
    }
}
