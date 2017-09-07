package com.agrocore.spatial.controller;

import com.agrocore.spatial.model.Vehicle;
import com.agrocore.spatial.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {

    @Autowired
    VehicleRepository vehicleRepository;

    @GetMapping(value = "/all")
    public List<Vehicle> findAll(){
        return vehicleRepository.findAll();
    }

    @GetMapping(value = "/{name}")
    public Vehicle findByName(@PathVariable final String name){
        return vehicleRepository.findByName(name);
    }

    @PostMapping(value = "/load")
    public Vehicle load(@RequestBody final Vehicle vehicle){
        vehicleRepository.save(vehicle);
        return vehicleRepository.findByName(vehicle.getName());
    }
}
