package com.Healthcare.Repositories;

import com.Healthcare.Models.Hospitals;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HospitalRepository extends JpaRepository<Hospitals,Integer> {
}
