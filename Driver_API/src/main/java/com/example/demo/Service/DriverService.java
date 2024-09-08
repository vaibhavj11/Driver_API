package com.example.demo.Service;

import com.example.demo.Model.Driver;

public interface DriverService {

	void saveDriver(Driver driver);

	void saveNewDriver(Driver driver);

	Object getDriver(Integer did);

	void updateDriver(Driver driver);

	void removeDriver(Integer did);



	

	

}
