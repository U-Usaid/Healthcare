package com.Healthcare.Repositories;

import com.Healthcare.Models.MedicalRecords;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicalRecordRepository extends JpaRepository<MedicalRecords, Integer> {
}
