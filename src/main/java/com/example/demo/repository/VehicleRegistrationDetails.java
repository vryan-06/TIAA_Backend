package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.models.VehicleRegistration;

public interface VehicleRegistrationDetails extends MongoRepository<VehicleRegistration, String> {

}
