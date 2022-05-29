package ar.com.portfolio.portfolio.controllers;

import ar.com.portfolio.portfolio.models.Usuario;
import ar.com.portfolio.portfolio.models.dto.UserDto;
import ar.com.portfolio.portfolio.services.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    @Autowired
    AuthService service;
    
    @PostMapping("/login")
    public boolean login(@RequestBody UserDto userDto) {
        return service.isUserEnabled(userDto);
    }
    
 /*Borrar una vez que estén creados los usuarios*/    
 //   
 //   
 //       
 //   

    }

