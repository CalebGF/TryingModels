package com.ironhack.tryingModels.controllers.impl;

import com.ironhack.tryingModels.controllers.interfaces.SalesRepController;
import com.ironhack.tryingModels.models.SalesRep;
import com.ironhack.tryingModels.services.interfaces.SalesRepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SalesRepControllerImpl implements SalesRepController {
    @Autowired
    private SalesRepService salesRepService;

    public void createSalesRep(SalesRep salesRep) {
        salesRepService.createSalesRep(salesRep);
    }
}
