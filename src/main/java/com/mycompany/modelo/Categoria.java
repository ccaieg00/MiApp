/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.modelo;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author carlo
 */

@Entity
@Table(name="categorias")
public class Categoria implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCategoria;
    
    @Column(name = "nombre")
    private String nombreCategoria;
    
    @Column(name = "estado")
    private boolean activada;

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public boolean isActivada() {
        return activada;
    }

    public void setActivada(boolean activada) {
        this.activada = activada;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.idCategoria;
        hash = 59 * hash + Objects.hashCode(this.nombreCategoria);
        hash = 59 * hash + (this.activada ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Categoria other = (Categoria) obj;
        if (this.idCategoria != other.idCategoria) {
            return false;
        }
        if (this.activada != other.activada) {
            return false;
        }
        if (!Objects.equals(this.nombreCategoria, other.nombreCategoria)) {
            return false;
        }
        return true;
    }
    
    
}
