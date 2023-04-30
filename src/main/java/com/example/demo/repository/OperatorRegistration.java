package com.example.demo.repository;

import java.util.List;
import com.example.demo.models.BusOperator;

public interface OperatorRegistration {
	public List<BusOperator> findByText(String text);
}
