
package com.mycompany.control_2;


public class Biblioteca {
    
     String nombre;
     String direccion;
     String catalogodeLibros;

    public Biblioteca() {
    }

    public Biblioteca(String nombre, String direccion, String catalogodeLibros) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.catalogodeLibros = catalogodeLibros;
    }
     
    public void BuscarLibro(){
        System.out.println("EL LIBRO QUE ESTOY BUSCANDO , LO PUEDO ENCONTRAR EN LA "+nombre+
                " SE ENCUENTRA EN "+ direccion);
    }
}
