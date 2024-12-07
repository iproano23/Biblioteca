
package com.mycompany.control_2;

public class Empleado {
     int id;
     String nombre;
     String rol;

    public Empleado() {
    }

    public Empleado(int id, String nombre, String rol) {
        this.id = id;
        this.nombre = nombre;
        this.rol = rol;
    }
     
     public void GestionarUsuario(){
         System.out.println("El usuairo ha sido creado o editado por el empleado: "+nombre);
     }
     
     public void Registrar_Transaccion(){
         
         System.out.println("La Transaccion ha sido registrada con exito");
         
     }
}
