package com.Healthcare.Services;

import com.Healthcare.Models.MedicalRecords;
import com.Healthcare.Repositories.MedicalRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicalRecordService {
    @Autowired
    MedicalRecordRepository medicalRecordRepository;

    public List<MedicalRecords> getAllMedicalRecords(){
        return medicalRecordRepository.findAll();
    }
}
