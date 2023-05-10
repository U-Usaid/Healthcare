package com.Healthcare.Repositories;

import com.Healthcare.Models.TestResults;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestResultRepository extends JpaRepository<TestResults, Integer> {
}
