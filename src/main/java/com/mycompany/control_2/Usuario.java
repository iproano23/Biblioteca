/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.control_2;

/**
 *
 * @author Admin
 */
public class Usuario {
     int id;
    String nombre;
    String listadelibrosprestados;

    public Usuario() {
    }

    public Usuario(int id, String nombre, String listadelibrosprestados) {
        this.id = id;
        this.nombre = nombre;
        this.listadelibrosprestados = listadelibrosprestados;
    }
    
    
    public void solictarLibro(){
        System.out.println("El libro que deseo solicitar es:"+nombre);
    }
}