package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.example.demo.models.BusOperator;
import com.example.demo.repository.OperatorDetails;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class BusOperatorController {
	@Autowired
	OperatorDetails op;
	
	@RequestMapping(value = "/")
	public String redirect() {
		return "<h1>Springboot API</h1>";
	}
	
	@PostMapping("/bus")
	@CrossOrigin
	public BusOperator postBusOperatorDetails(@RequestBody BusOperator bus_op){
		return op.save(bus_op);
	}
	
	@GetMapping("/bus")
	@CrossOrigin
	public BusOperator getBusOperatorDetails(@RequestParam String id){
		Optional<BusOperator> operator = op.findById(id);
		if(operator.isPresent()) {
			return operator.get();
		} else {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Operator not found with id " + id);
		}
	}
}