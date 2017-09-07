package com.agrocore.spatial.controller;

import com.agrocore.spatial.model.Driver;
import com.agrocore.spatial.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/drivers")
public class DriverController {

    @Autowired
    DriverRepository driverRepository;

    @GetMapping(value = "/all")
    public List<Driver> findAll(){
        return driverRepository.findAll();
    }

    @GetMapping(value = "/{name}")
    public Driver findByName(@PathVariable final String name){
        return driverRepository.findByName(name);
    }

    @PostMapping(value="/load")
    public Driver load(@RequestBody final Driver driver){
        driverRepository.save(driver);
        return driverRepository.findByName(driver.getName());
    }
}
