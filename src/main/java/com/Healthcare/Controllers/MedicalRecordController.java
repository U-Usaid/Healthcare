package com.Healthcare.Controllers;

import com.Healthcare.Models.MedicalRecords;
import com.Healthcare.Services.MedicalRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "medicalRecord")
public class MedicalRecordController {
    @Autowired
    MedicalRecordService medicalRecordService;

    @GetMapping(value = "getAll")
    public List<MedicalRecords> getMedicalRecords(){
        return medicalRecordService.getAllMedicalRecords();
    }
}
