package com.Healthcare.Controllers;

import com.Healthcare.Models.TestResults;
import com.Healthcare.Services.TestResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "testResult")
public class TestResultController {
    @Autowired
    TestResultService testResultService;

    @GetMapping(value = "getAll")

    public List<TestResults> getTestResult(){
        return testResultService.getAllTestResults();
    }
}
