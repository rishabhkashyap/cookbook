package com.example.repo;

import com.example.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


public interface CustomerRepo  extends JpaRepository<Customer,String> {


}
