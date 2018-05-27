package com.mazurak.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mazurak.entity.Make;

public interface MakeRepository extends JpaRepository<Make, Integer> {

	@Query("Select m from Make m where lower(m.name) = :name")
	Make findMakeByName(@Param("name") String name);
}
