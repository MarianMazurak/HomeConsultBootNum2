package com.mazurak.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mazurak.entity.Make;
import com.mazurak.repository.MakeRepository;
import com.mazurak.service.MakeService;
@Service
public class MakeServiceImpl implements MakeService {

	@Autowired
	MakeRepository makeRepository;

	@Override
	public void save(Make make) {
		makeRepository.save(make);
	}

	@Override
	public Make findById(int id) {
		return makeRepository.getOne(id);
	}

	@Override
	public List<Make> findll() {
		return makeRepository.findAll();
	}

	@Override
	public Make findMakeByName(String name) {
		return makeRepository.findMakeByName(name);
	}

}
