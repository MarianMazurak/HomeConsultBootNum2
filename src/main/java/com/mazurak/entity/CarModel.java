package com.mazurak.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.mazurak.entity.enums.BodyType;
import com.mazurak.entity.enums.FuelType;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "car_model")
@NoArgsConstructor
@Getter @Setter
@ToString(callSuper = true)
public class CarModel extends BaseEntity {

	private String name;
	
	private String year;
	
	@Enumerated(EnumType.STRING)
	private BodyType bodyType;
	
	@Enumerated(EnumType.STRING)
	private FuelType fuelType;

	@ManyToOne
	@JoinColumn(name = "car_make_id")
	private Make make;
}
