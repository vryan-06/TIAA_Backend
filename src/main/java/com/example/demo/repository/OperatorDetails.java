package com.example.demo.repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.models.BusOperator;

public interface OperatorDetails extends MongoRepository<BusOperator,String> {
	
}
