package com.jaswanth.hibernate.demo.config;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.sql.SQLException;

@ControllerAdvice
public class GlobalException {

    @ExceptionHandler
    public ResponseEntity<?> sqlException(SQLException e){
        return new ResponseEntity<>(HttpStatus.BAD_GATEWAY);
    }
}