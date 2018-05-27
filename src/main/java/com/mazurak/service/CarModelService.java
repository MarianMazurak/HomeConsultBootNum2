package com.mazurak.service;

import java.util.List;

import com.mazurak.entity.CarModel;

public interface CarModelService {

	void save(CarModel carModel);
	
	CarModel findById(int id);

	List<CarModel> findll();
}
