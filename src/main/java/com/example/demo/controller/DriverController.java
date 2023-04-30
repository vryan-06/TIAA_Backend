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

import com.example.demo.models.Driver;
import com.example.demo.repository.DriverDetails;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class DriverController {
    @Autowired
    DriverDetails dd;
     
    @PostMapping("/driver")
    @CrossOrigin
    public Driver postDriverDetails(@RequestBody Driver driver){
        return dd.save(driver);
    }
    
    @GetMapping("/driver")
    @CrossOrigin
    public Driver getDriverDetails(@RequestParam String id){
        Optional<Driver> route = dd.findById(id);
        if(route.isPresent()) {
            return route.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Driver not found with id " + id);
        }
    }
    
}
