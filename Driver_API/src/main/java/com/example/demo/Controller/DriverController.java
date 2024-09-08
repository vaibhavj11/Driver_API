package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Driver;
import com.example.demo.Service.DriverService;

@RestController
public class DriverController {

	@Autowired
	DriverService ds;


	
	@GetMapping("/get")
	public Driver driver(Driver driver) {
		
		driver.setDid(101);
		driver.setDname("Vaibhav");
		driver.setDcity("Pachora");
		driver.setDmob("8308313970");
		
		ds.saveDriver(driver);
		
	  return  driver;
	}
	
	@GetMapping("/get/{did}")
	public Object driver(@PathVariable Integer did) {
		
		return ds.getDriver(did);
		
	 
	}
	
	@PostMapping("/add")
	public String addDriver(@RequestBody Driver driver) {
		
		
		ds.saveNewDriver(driver);

		return "Driver Added Successfully !" ;
		
	}
	
	@PutMapping("/update")
	public String update(@RequestBody Driver driver) {
		
		ds.updateDriver(driver);
		
		
		return "Driver Data is updated !";
	}
	
	@DeleteMapping("/delete/{did}")
	public String delete(@PathVariable Integer did) {
		
		 ds.removeDriver(did);
	
		 return "Driver Data is deleted !";
	}
	 
	
}
