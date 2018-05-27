package com.mazurak.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.mazurak.entity.CarModel;
import com.mazurak.entity.Make;
import com.mazurak.entity.enums.BodyType;
import com.mazurak.entity.enums.FuelType;
import com.mazurak.service.CarModelService;
import com.mazurak.service.MakeService;

@Controller
public class HomeController {

	
	private MakeService makeServise;
	private CarModelService carModelService;
	
	@Autowired
	public HomeController(MakeService makeServise, CarModelService carModelService) {
		this.makeServise = makeServise;
		this.carModelService = carModelService;
	}

	@GetMapping("/")
	public String showHome() {
		return "home";
	}
	
	@GetMapping("/add/make")
	public String showAddCarMakeForm(Model model) {
		model.addAttribute("carMakeAttr", new Make());
		return "add-make";
	}
	@GetMapping("/add/model")
	public String showAddCarModelForm(Model model) {
		model.addAttribute("carModelAttr", new CarModel());
		model.addAttribute("makeListAttr", makeServise.findll());
		model.addAttribute("fuelTypeAttr", FuelType.values());
		model.addAttribute("bodyTypeAttr", BodyType.values());
		return "add-model";
	}
	
	
	
	@PostMapping("/add/make")
	public String saveMake(@ModelAttribute("carMakeAttr") Make make) {
		
		if(makeServise.findMakeByName(make.getName().toLowerCase()) == null) {
			makeServise.save(make);
		} else {
			return "redirect:/add/make";
		}
	
		return "redirect:/";
	}
	@PostMapping("/add/model")
	public String saveModel(@ModelAttribute("carModelAttr") CarModel carModel) {
		carModelService.save(carModel);
		return "redirect:/add/model";
	}
	
	@GetMapping("/show/table")
	public String showCarTableInfo(Model model) {
		
		model.addAttribute("listAttr", makeServise.findll());
		return "list";
	}
	
	
}











