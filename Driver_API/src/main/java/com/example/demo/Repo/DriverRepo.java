package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Driver;

public interface DriverRepo extends JpaRepository<Driver, Integer> {

}
