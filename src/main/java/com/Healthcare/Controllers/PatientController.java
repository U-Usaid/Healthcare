package com.Healthcare.Controllers;

import com.Healthcare.Models.Patients;
import com.Healthcare.Services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "patient")
public class PatientController {
    @Autowired
    PatientService patientService;

    @GetMapping(value = "getAll")
    public List<Patients> getPatients(){
        return patientService.gteAllPatients();
    }
}
