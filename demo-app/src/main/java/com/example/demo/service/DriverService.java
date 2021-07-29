package com.example.demo.service;

import com.example.model.Driver;
import com.example.repo.DriverRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DriverService {
    @Autowired
    DriverRepo driverRepo;

    public Driver addDriver(Driver driver) {
        Driver savedDriver = driverRepo.save(driver);
        return savedDriver;
    }

    public Driver search(Integer driverId) {
        return driverRepo.findBydriverId(driverId);
    }
}
