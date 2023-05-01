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

import com.example.demo.models.Route;
import com.example.demo.repository.RouteDetails;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class RouteController {
    @Autowired
    RouteDetails rd;
     
    @PostMapping("/route")
    @CrossOrigin
    public Route postRouteDetails(@RequestBody Route route){
        return rd.save(route);
    }
    
    @GetMapping("/route")
    @CrossOrigin
    public Route getRouteDetails(@RequestParam String id){
        Optional<Route> route = rd.findById(id);
        if(route.isPresent()) {
            return route.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Route not found with id " + id);
        }
    }
    
}
