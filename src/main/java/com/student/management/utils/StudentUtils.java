package com.student.management.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class StudentUtils {

    public StudentUtils() {

    }

    public static ResponseEntity<String> getResponseEntity(String responseMessage, HttpStatus httpStatus){
        return  new ResponseEntity<String>("{\"message\":\"" + responseMessage + "\"}", httpStatus);
    }
}
