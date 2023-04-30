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

import com.example.demo.models.Stops;
import com.example.demo.repository.StopsDetails;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class StopsController {
    @Autowired
    StopsDetails sd;
     
    @PostMapping("/stops")
    @CrossOrigin
    public Stops postStopsDetails(@RequestBody Stops stop){
        return sd.save(stop);
    }
    
    @GetMapping("/stops")
    @CrossOrigin
    public Stops getStopsDetails(@RequestParam String id){
        Optional<Stops> route = sd.findById(id);
        if(route.isPresent()) {
            return route.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Stop not found with id " + id);
        }
    }
    
}
