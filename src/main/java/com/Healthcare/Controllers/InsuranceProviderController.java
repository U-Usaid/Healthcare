package com.Healthcare.Controllers;

import com.Healthcare.Models.InsuranceProviders;
import com.Healthcare.Services.InsuracneProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "InsuranceProvider")
public class InsuranceProviderController {
    @Autowired
    InsuracneProviderService insuracneProviderService;

    @GetMapping(value = "getAll")

    public List<InsuranceProviders> getInsuranceProviders() {
        return insuracneProviderService.getAllInsuranceProviders();
    }
}
