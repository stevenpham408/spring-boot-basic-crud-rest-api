package com.phamst2learning.springbootrestapi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ProductNotFoundAdvice {
    @ResponseBody                                           // signals that this advice is rendered straight into the response body.
    @ExceptionHandler(ProductNotFoundException.class)       // configures the advice to only respond if an EmployeeNotFoundException is thrown.
    @ResponseStatus(HttpStatus.NOT_FOUND)                   // issues an HttpStatus.NOT_FOUND, i.e. an HTTP 404.
    String productNotFoundHandler(ProductNotFoundException ex){
        return ex.getMessage();
    }
}
