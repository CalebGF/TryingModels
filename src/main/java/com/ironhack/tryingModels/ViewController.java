package com.ironhack.tryingModels;

import com.ironhack.tryingModels.controllers.interfaces.SalesRepController;
import com.ironhack.tryingModels.models.SalesRep;
import com.ironhack.tryingModels.repositories.SalesRepRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;
public class ViewController {
    @Autowired
    private SalesRepRepository salesRepRepository;

    public void addSalesRep(){
        String name = "";
        Scanner input = new Scanner(System.in);
        System.out.print("Please type the SalesRep's name: ");
        name = input.nextLine();

        salesRepRepository.save(new SalesRep(name));
    }
}
