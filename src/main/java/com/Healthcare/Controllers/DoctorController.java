package com.Healthcare.Controllers;

import com.Healthcare.Models.Doctors;
import com.Healthcare.Services.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "doctor")
public class DoctorController {
    @Autowired
    DoctorService doctorService;

    @GetMapping(value = "getAll")

    public List<Doctors> getDoctors(){
        return doctorService.getAllDoctors();
    }
}
