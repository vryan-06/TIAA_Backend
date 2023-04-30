package com.example.demo.repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.models.Route;

public interface RouteDetails extends MongoRepository<Route, String> {

}
