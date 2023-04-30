package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.models.Driver;

public interface DriverDetails extends MongoRepository<Driver, String>{

}
