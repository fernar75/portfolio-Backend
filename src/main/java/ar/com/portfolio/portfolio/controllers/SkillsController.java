/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.portfolio.portfolio.controllers;

import ar.com.portfolio.portfolio.models.Skills;
import ar.com.portfolio.portfolio.services.SkillsService;
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
public class SkillsController {
    @Autowired
    private SkillsService skillsService;

    @GetMapping("/skills")
    public List<Skills> getAll() {

        return skillsService.traerTodo();
    }
    
    @GetMapping("/skills/{id}")
    public Skills getOne(@PathVariable int id) {

        return skillsService.traerUno(id);
    }
    
    @PostMapping("/skills")
    public boolean create(@RequestBody Skills s) {

        return skillsService.crear(s);
    }


    @PutMapping("/skills/{id}")
    public boolean update(@RequestBody Skills s) {

        return skillsService.modificar(s);
    }

    
    @DeleteMapping("/skills/{id}")
    public boolean remove(@PathVariable int id) {

        return skillsService.borrar(id);
    }    
}

