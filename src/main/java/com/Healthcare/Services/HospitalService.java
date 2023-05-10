package com.Healthcare.Services;

import com.Healthcare.Models.Hospitals;
import com.Healthcare.Repositories.HospitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HospitalService {
    @Autowired
    HospitalRepository hospitalRepository;

    public List<Hospitals> getAllHospitals(){
        return hospitalRepository.findAll();
    }
}
