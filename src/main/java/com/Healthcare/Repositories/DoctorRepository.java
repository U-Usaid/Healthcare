package com.Healthcare.Repositories;

import com.Healthcare.Models.Doctors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository<Doctors,Integer> {
}
