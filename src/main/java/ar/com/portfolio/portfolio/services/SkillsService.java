/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.portfolio.portfolio.services;

import ar.com.portfolio.portfolio.models.Skills;
import ar.com.portfolio.portfolio.repositories.ISkillsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Yo
 */
@Service
public class SkillsService implements ICrudService<Skills> {

    @Autowired
    ISkillsRepository skillsRepo;

    @Override
    public List<Skills> traerTodo() {
        return skillsRepo.findAll();
    }

    @Override
    public Skills traerUno(long id) {
         return skillsRepo.findById(id).orElse(null);
    }

    @Override
    public boolean crear(Skills s) {        
        skillsRepo.save(s);
        return true;
    }

    @Override
    public boolean modificar(Skills s) {

        skillsRepo.save(s);
        return true;
    }

    @Override
    public boolean borrar(long id) {
        try {
            skillsRepo.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean borrar(Skills s) {
        skillsRepo.delete(s);
        return false;
    }
}

