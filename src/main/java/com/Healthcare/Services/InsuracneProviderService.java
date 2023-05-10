package com.Healthcare.Services;

import com.Healthcare.Models.InsuranceProviders;
import com.Healthcare.Repositories.InsuranceProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InsuracneProviderService {
    @Autowired
    InsuranceProviderRepository insuranceProviderRepository;

    public List<InsuranceProviders> getAllInsuranceProviders(){
        return insuranceProviderRepository.findAll();
    }
}
