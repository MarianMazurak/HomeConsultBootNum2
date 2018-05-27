package com.mazurak.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mazurak.entity.CarModel;

public interface CarModelRepository extends JpaRepository<CarModel, Integer> {

}
