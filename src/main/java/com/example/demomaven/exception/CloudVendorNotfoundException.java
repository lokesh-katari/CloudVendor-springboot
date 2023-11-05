package com.example.demomaven.exception;

import java.lang.RuntimeException;

public class CloudVendorNotfoundException extends RuntimeException {

    public CloudVendorNotfoundException(String message) {
        super(message);
    }

    public CloudVendorNotfoundException(String meString, Throwable cause) {

        super(meString, cause);
    }

}
