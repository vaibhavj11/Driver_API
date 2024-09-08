package com.example.demo.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Driver;
import com.example.demo.Repo.DriverRepo;
import com.example.demo.Service.DriverService;

@Service
public class DriverDao implements DriverService {

	@Autowired
	DriverRepo dr;
	
	@Override
	public void saveDriver(Driver driver) {
		// TODO Auto-generated method stub
		
		dr.save(driver);
		
		
		
	}

	@Override
	public void saveNewDriver(Driver driver) {
		// TODO Auto-generated method stub
		
		System.out.println("kfjsdjfms");
		
		dr.save(driver);
		
	}

	@Override
	public Object getDriver(Integer did) {
		// TODO Auto-generated method stub
		
		return dr.findById(did);
		
	}

	@Override
	public void updateDriver(Driver driver) {
		// TODO Auto-generated method stub
		dr.save(driver);
		
	}

	@Override
	public void removeDriver(Integer did) {
		// TODO Auto-generated method stub
		
		dr.deleteById(did);
		
		System.out.println("Driver Deleted !");
		
	}

	
	
	
}
