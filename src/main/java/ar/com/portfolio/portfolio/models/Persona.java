/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.portfolio.portfolio.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Yo
 */
@Getter
@Setter
@Entity
@Table(name="persona")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String urlFotoPerfil;
    private String nombreYApellido;
    private String titulo;
    private String acercaDe;

    /*Relaciones*/       
    @JsonIgnore
    @OneToMany(mappedBy = "persona")
    private List<Educacion> educacion; 
    
    @JsonIgnore 
    @OneToMany(mappedBy = "persona")
    private List<Experiencia> experiencia;
    
    @JsonIgnore
    @OneToMany(mappedBy = "persona")
    private List<Skills> skills;
    
    @JsonIgnore
    @OneToMany(mappedBy = "persona")
    private List<Proyectos> proyectos;    
    
    /*Constructores*/

    public Persona(long id, String urlFotoPerfil, String nombreYApellido, String titulo, String acercaDe) {
        this.id = id;
        this.urlFotoPerfil = urlFotoPerfil;
        this.nombreYApellido = nombreYApellido;
        this.titulo = titulo;
        this.acercaDe = acercaDe;
    }
    
    public Persona() {
    }
}
