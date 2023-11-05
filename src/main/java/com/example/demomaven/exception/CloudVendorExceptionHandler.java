package com.example.demomaven.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CloudVendorExceptionHandler {

    @ExceptionHandler(value = { CloudVendorNotfoundException.class })
    public ResponseEntity<Object> handlecloudVendorException(
            CloudVendorNotfoundException cloudVendorNotfoundException) {

        CloudVendorException cloudVendorException = new CloudVendorException(cloudVendorNotfoundException.getMessage(),
                cloudVendorNotfoundException.getCause(), HttpStatus.NOT_FOUND);
        return new ResponseEntity<Object>(cloudVendorException, HttpStatus.NOT_FOUND);
    }

}
