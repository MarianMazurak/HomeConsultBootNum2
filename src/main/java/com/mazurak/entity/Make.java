package com.mazurak.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "car_make")
@Getter @Setter
@NoArgsConstructor
@ToString(callSuper = true ,exclude = "carModelList")
public class Make extends BaseEntity{

	@Column(name = "name")
	private String name;
	
	@OneToMany(mappedBy = "make" , fetch = FetchType.LAZY )
	private List<CarModel> carModelList;
	
	
}
