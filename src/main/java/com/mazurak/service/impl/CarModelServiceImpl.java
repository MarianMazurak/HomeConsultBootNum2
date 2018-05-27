package com.mazurak.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mazurak.entity.CarModel;
import com.mazurak.repository.CarModelRepository;
import com.mazurak.service.CarModelService;

@Service
public class CarModelServiceImpl implements CarModelService {

	@Autowired CarModelRepository carModelRepository; 
	
	@Override
	public void save(CarModel carModel) {
		carModelRepository.save(carModel);
	}

	@Override
	public CarModel findById(int id) {
		return carModelRepository.getOne(id);
	}

	@Override
	public List<CarModel> findll() {
		return carModelRepository.findAll();
	}

}
