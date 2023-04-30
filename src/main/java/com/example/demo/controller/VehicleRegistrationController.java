package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.example.demo.models.VehicleRegistration;
import com.example.demo.repository.VehicleRegistrationDetails;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class VehicleRegistrationController {
    @Autowired
    VehicleRegistrationDetails vd;
     
    @PostMapping("/vehicleReg")
    @CrossOrigin
    public VehicleRegistration postStopsDetails(@RequestBody VehicleRegistration vehicle){
        return vd.save(vehicle);
    }
    
    @GetMapping("/vehicleReg")
    @CrossOrigin
    public VehicleRegistration getStopsDetails(@RequestParam String id){
        Optional<VehicleRegistration> route = vd.findById(id);
        if(route.isPresent()) {
            return route.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Vehicle not found with id " + id);
        }
    }
    
}
