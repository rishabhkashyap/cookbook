package com.example.demo.conrollers;

import com.example.demo.service.DemoService;
import com.example.demo.service.DriverService;
import com.example.model.Driver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {

    @Autowired
    private DriverService driverService;

    @PostMapping("/drivers")
    public ResponseEntity addDriver(@RequestBody Driver driver) throws Exception {
        Driver createdDriver = driverService.addDriver(driver);
        if (driverService != null) {
            return new ResponseEntity(createdDriver, HttpStatus.CREATED);
        }
        return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);

    }

    @GetMapping("/drivers/{driverid}")
    public ResponseEntity getDriver(@PathVariable String driverid)  {
        Driver createdDriver = driverService.search(Integer.parseInt(driverid));
        if (driverService != null) {
            return new ResponseEntity(createdDriver, HttpStatus.FOUND);
        }
       return new ResponseEntity(HttpStatus.NOT_FOUND);

    }


}
