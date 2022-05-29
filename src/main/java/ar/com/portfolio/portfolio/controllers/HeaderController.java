/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.portfolio.portfolio.controllers;

import ar.com.portfolio.portfolio.models.Header;
import ar.com.portfolio.portfolio.services.HeaderService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Yo
 */
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class HeaderController {
    @Autowired
    private HeaderService headerService;

    @GetMapping("/header")
    public List<Header> getAll() {

        return headerService.traerTodo();
    }
    
    @GetMapping("/header/{id}")
    public Header getOne(@PathVariable int id) {

        return headerService.traerUno(id);
    }
    
    @PostMapping("/header")
    public boolean create(@RequestBody Header h) {

        return headerService.crear(h);
    }


    @PutMapping("/header/{id}")
    public boolean update(@RequestBody Header h) {

        return headerService.modificar(h);
    }

    
    @DeleteMapping("/header/{id}")
    public boolean remove(@PathVariable int id) {

        return headerService.borrar(id);
    }    
}

