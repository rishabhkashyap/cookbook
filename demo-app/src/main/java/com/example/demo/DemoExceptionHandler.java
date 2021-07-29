package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class DemoExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity handleException(Exception exception) {
        ResponseEntity responseEntity = new ResponseEntity(exception.getMessage(), HttpStatus.NETWORK_AUTHENTICATION_REQUIRED);
        return responseEntity;
    }

}
