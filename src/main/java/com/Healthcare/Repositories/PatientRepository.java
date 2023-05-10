package com.Healthcare.Repositories;

import com.Healthcare.Models.Patients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patients, Integer> {
}
