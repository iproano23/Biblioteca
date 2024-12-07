
package com.mycompany.control_2;


public class Libro {
    String isbn;
    String titulo;
    String autor;


    public Libro() {
    }
    

    public Libro(String isbn, String titulo, String autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
       
    }

   
    
    public void prestar(){
        
        System.out.println("El libro  que ha sido prestado es:"+titulo);
    }
    
     public void devolver(){
         
         
             
             System.out.println("El libro con ISBN"+","+isbn+"ha sido devuelto con exito");
         
             
            
       
         }
             
         
         }
     

    
    

