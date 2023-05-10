package com.Healthcare.Services;

import com.Healthcare.Models.MedicalAppointments;
import com.Healthcare.Repositories.MedicalAppointmentRepository;
import com.Healthcare.Repositories.MedicalRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicalAppointmentService {
    @Autowired
    MedicalAppointmentRepository medicalAppointmentRepository;

    public List<MedicalAppointments> getAllMedicalAppointments(){
        return medicalAppointmentRepository.findAll();

    }
}
