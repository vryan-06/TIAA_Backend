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

import com.example.demo.models.Signup;
import com.example.demo.repository.SignupDetails;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class SignupController {
    @Autowired
    SignupDetails sd;
     
    @PostMapping("/signup")
    @CrossOrigin
    public Signup postSignupDetails(@RequestBody Signup signup){
        return sd.save(signup);
    }
    
    @GetMapping("/signup")
    @CrossOrigin
    public Signup getSignupDetails(@RequestParam String id){
        Optional<Signup> signup = sd.findById(id);
        if(signup.isPresent()) {
            return signup.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Signup not found with id " + id);
        }
    }
    
}
