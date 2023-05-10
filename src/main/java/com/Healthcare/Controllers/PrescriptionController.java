package com.Healthcare.Controllers;

import com.Healthcare.Models.Prescriptions;
import com.Healthcare.Services.PrescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "prescription")
public class PrescriptionController {
    @Autowired
    PrescriptionService prescriptionService;

    @GetMapping(value = "getAll")

    public List<Prescriptions> getPrescriptions(){
        return prescriptionService.getAllPrescriptions();
    }
}
