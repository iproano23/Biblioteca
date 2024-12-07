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
public class Transaccion {
   int id;
   String fecha;
   String usuario;
    String libro;

    public Transaccion() {
    }

    public Transaccion(int id, String fecha, String usuario, String libro) {
        this.id = id;
        this.fecha = fecha;
        this.usuario = usuario;
        this.libro = libro;
    }
    
    public void Registrar(){
        System.out.println("La trasancion del libro"+libro+"Se realizo con exito por parate del usuario:"+usuario);
    }
}
