package com.Healthcare.Repositories;

import com.Healthcare.Models.MedicalAppointments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicalAppointmentRepository extends JpaRepository<MedicalAppointments, Integer> {
}
