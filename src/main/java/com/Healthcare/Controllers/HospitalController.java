package com.Healthcare.Controllers;

import com.Healthcare.Models.Hospitals;
import com.Healthcare.Services.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "hospital")
public class HospitalController {
    @Autowired
    HospitalService hospitalService;
    @GetMapping(value = "getAll")

    public List<Hospitals> getHospitals(){
        return hospitalService.getAllHospitals();
    }
}
