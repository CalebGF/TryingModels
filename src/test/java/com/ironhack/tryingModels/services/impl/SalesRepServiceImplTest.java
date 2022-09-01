package com.ironhack.tryingModels.services.impl;

import com.ironhack.tryingModels.controllers.interfaces.SalesRepController;
import com.ironhack.tryingModels.models.SalesRep;
import com.ironhack.tryingModels.repositories.SalesRepRepository;
import com.ironhack.tryingModels.services.interfaces.SalesRepService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SalesRepServiceImplTest {

    @Autowired
    private SalesRepController salesRepController;
    @Autowired
    private SalesRepRepository salesRepRepository;

    @Test
    void createSalesRep() {
        salesRepController.createSalesRep(new SalesRep("MaximoRamon"));
        System.out.println(salesRepRepository.findAll());
    }
}