package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    public ResponseEntity<String> getUser(){
        return new ResponseEntity<>("Hello java", HttpStatus.OK);
    }
}
