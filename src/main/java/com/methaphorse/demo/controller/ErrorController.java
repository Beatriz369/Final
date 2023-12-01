package com.methaphorse.demo.controller;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@ControllerAdvice
public class ErrorController {


    @ExceptionHandler(ResourceNotFoundException.class)
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public @ResponseBody ExceptionResponse handleResourceNotfound(
    		final ResourceNotFoundException exception, final HttpServletRequest request) {
			ExceptionResponse error = new ExceptionResponse();
			error.setErrorRespose(exception.getMessage());
			error.setRequestedURL(request.getRequestURI());
    	return error;
    	
    }
    
//    @ExceptionHandler(ResourceNotFoundException.class)
//    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
//    public @ResponseBody ExceptionResponse handleResourceNotfound(
//    		final Exception exception, final HttpServletRequest request) {
//			ExceptionResponse error = new ExceptionResponse();
//			error.setErrorRespose(exception.getMessage());
//			error.setRequestedURL(request.getRequestURI());
//    	return error;
//    	
//    }

    
    
}
