package com.Healthcare.Repositories;

import com.Healthcare.Models.InsuranceProviders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InsuranceProviderRepository extends JpaRepository<InsuranceProviders, Integer> {
}
