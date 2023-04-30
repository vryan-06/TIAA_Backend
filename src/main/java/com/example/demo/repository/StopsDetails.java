package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.models.Stops;

public interface StopsDetails extends MongoRepository<Stops, String> {

}
