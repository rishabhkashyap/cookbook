package com.example.repo;

import com.example.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@Repository
public interface DriverRepo extends JpaRepository<Driver, Integer> {

    public Driver findBydriverId(Integer driverId);
}
