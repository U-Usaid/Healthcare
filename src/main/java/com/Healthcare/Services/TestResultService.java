package com.Healthcare.Services;

import com.Healthcare.Models.TestResults;
import com.Healthcare.Repositories.TestResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestResultService {
    @Autowired
    TestResultRepository testResultRepository;

    public List<TestResults> getAllTestResults(){
        return testResultRepository.findAll();
    }
}
