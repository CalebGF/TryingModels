package com.ironhack.tryingModels.services.impl;

import com.ironhack.tryingModels.models.SalesRep;
import com.ironhack.tryingModels.repositories.SalesRepRepository;
import com.ironhack.tryingModels.services.interfaces.SalesRepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalesRepServiceImpl implements SalesRepService {
    @Autowired
    private SalesRepRepository salesRepRepository;

    public void createSalesRep(SalesRep salesRep) {
        salesRepRepository.save(salesRep);
    }
}
