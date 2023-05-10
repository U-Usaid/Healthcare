package com.Healthcare.Services;

import com.Healthcare.Models.Doctors;
import com.Healthcare.Repositories.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {
    @Autowired
    DoctorRepository doctorRepository;

    public List<Doctors> getAllDoctors(){
        return doctorRepository.findAll();
    }
}
