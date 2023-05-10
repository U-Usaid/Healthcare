package com.Healthcare.Repositories;

import com.Healthcare.Models.Prescriptions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrescriptionRepository extends JpaRepository<Prescriptions, Integer> {
}
