/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;

import com.mycompany.EJB.CategoriaFacadeLocal;
import com.mycompany.modelo.Categoria;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author carlo
 */

@Named
@ViewScoped

public class AltaCategoriaController implements Serializable{
    private Categoria categoria;
    @EJB
    private CategoriaFacadeLocal categoriaEJB;
    
    @PostConstruct
    public void init(){
        categoria = new Categoria();
    }
    
    public void insertarCategoria(){
        
        try{
            categoriaEJB.create(categoria);
        }
        catch(Exception e){
            System.out.print("Error al instertar la categoria: " + e);
        }
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public CategoriaFacadeLocal getCategoriaEJB() {
        return categoriaEJB;
    }

    public void setCategoriaEJB(CategoriaFacadeLocal categoriaEJB) {
        this.categoriaEJB = categoriaEJB;
    }
}
