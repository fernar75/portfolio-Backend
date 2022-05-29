/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ar.com.portfolio.portfolio.repositories;

import ar.com.portfolio.portfolio.models.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Yo
 */
@Repository
public interface IProyectosRepository extends JpaRepository<Proyectos, Long> {
    
}
