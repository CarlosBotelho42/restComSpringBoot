package com.example.restComSpring1.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsuportedMathOperatorException extends RuntimeException{

    public UnsuportedMathOperatorException(String exception){
        super(exception);
    }
}
