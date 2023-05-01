package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.models.Signup;

public interface SignupDetails extends MongoRepository<Signup, String> {

}
