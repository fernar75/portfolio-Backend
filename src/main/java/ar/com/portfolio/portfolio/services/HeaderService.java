/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.portfolio.portfolio.services;

import ar.com.portfolio.portfolio.models.Header;
import ar.com.portfolio.portfolio.repositories.IHeaderRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Yo
 */
@Service
public class HeaderService implements ICrudService<Header> {

    @Autowired
    IHeaderRepository headerRepo;

    @Override
    public List<Header> traerTodo() {
        return headerRepo.findAll();
    }

    @Override
    public Header traerUno(long id) {
         return headerRepo.findById(id).orElse(null);
    }

    @Override
    public boolean crear(Header h) {        
        headerRepo.save(h);
        return true;
    }

    @Override
    public boolean modificar(Header h) {

        headerRepo.save(h);
        return true;
    }

    @Override
    public boolean borrar(long id) {
        try {
            headerRepo.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean borrar(Header h) {
        headerRepo.delete(h);
        return false;
    }
}

