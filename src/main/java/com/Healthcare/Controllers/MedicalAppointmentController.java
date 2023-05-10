package com.Healthcare.Controllers;

import com.Healthcare.Models.MedicalAppointments;
import com.Healthcare.Services.MedicalAppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "medicalAppointment")
public class MedicalAppointmentController {
    @Autowired
    MedicalAppointmentService medicalAppointmentService;

    @GetMapping(value = "getAll")
    public List<MedicalAppointments> getMedicalAppointments() {
        return medicalAppointmentService.getAllMedicalAppointments();
    }
}
