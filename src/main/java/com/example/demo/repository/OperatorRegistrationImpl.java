package com.example.demo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.convert.MongoConverter;
import org.springframework.stereotype.Component;
import com.example.demo.models.BusOperator;
import com.mongodb.client.MongoClient;

@Component
public class OperatorRegistrationImpl implements OperatorRegistration{
	@Autowired
	MongoClient client;
	
	@Autowired
	MongoConverter converter;
	
	@Override
	public List<BusOperator> findByText(String text) {
		// TODO Auto-generated method stub
		
		return null;
	}

}
