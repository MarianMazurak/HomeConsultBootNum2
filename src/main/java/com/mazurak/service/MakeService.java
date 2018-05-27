package com.mazurak.service;

import java.util.List;

import com.mazurak.entity.Make;

public interface MakeService {
	
	void save(Make make);
	
	Make findById(int id);

	List<Make> findll();
	
	Make findMakeByName(String name);
}
