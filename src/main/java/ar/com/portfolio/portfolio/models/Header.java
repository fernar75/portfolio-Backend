/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.portfolio.portfolio.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name="header")
public class Header {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String urlLogo;
    private String urlRedSocial1;
    private String urlIconoRedSocial1;
    private String urlRedSocial2;
    private String urlIconoRedSocial2;
    private String urlRedSocial3;
    private String urlIconoRedSocial3;
    private String urlBanner;              

    /*Constructores*/
    public Header(long id, String urlLogo, String urlRedSocial1, String urlIconoRedSocial1, String urlRedSocial2, String urlIconoRedSocial2, String urlRedSocial3, String urlIconoRedSocial3, String urlBanner) {
        this.id = id;
        this.urlLogo = urlLogo;
        this.urlRedSocial1 = urlRedSocial1;
        this.urlIconoRedSocial1 = urlIconoRedSocial1;
        this.urlRedSocial2 = urlRedSocial2;
        this.urlIconoRedSocial2 = urlIconoRedSocial2;
        this.urlRedSocial3 = urlRedSocial3;
        this.urlIconoRedSocial3 = urlIconoRedSocial3;
        this.urlBanner = urlBanner;
    }


    public Header() {
    }
}
