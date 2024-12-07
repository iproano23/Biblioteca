
package com.mycompany.control_2;


public class Ejecutable {
    public static void main(String[] args) {
        
       //LIBRO
        Libro librito1=new Libro();
        librito1.isbn="25";
        librito1.titulo="Las Tinieblas";
        librito1.autor="PABLO PICCASO";
        librito1.prestar();
        librito1.devolver();
        Libro librito2=new Libro();
        librito2.isbn="45";
        librito2.titulo="100 años de Soledad";
        librito2.autor="GABRIEL GARCIA MARQUEZ";
        librito2.prestar();
        librito2.devolver();
        Libro librito3=new Libro();
        librito3.isbn="63";
        librito3.titulo="Preludio a la fundación";
        librito3.autor="ISAAC ASIMOV";
        librito3.prestar();
        librito3.devolver();
        Libro librito4=new Libro();
        librito4.isbn="9";
        librito4.titulo="La Comedia Humana";
        librito4.autor="HONORÉ DE BALZAC";
        librito4.prestar();
        librito4.devolver();
        Libro librito5=new Libro();
        librito5.isbn="14";
        librito5.titulo="Ensayo sobre la ceguera";
        librito5.autor="JOSE SARAMANGO";
        librito5.prestar();
        librito5.devolver();
        //USUARIO
       Usuario usuarios=new Usuario();
       usuarios.nombre="HARRY POTTER";
       usuarios.solictarLibro();
       //BIBLIOTECA
       
        Biblioteca bibli1=new Biblioteca();
        bibli1.nombre="Biblioteca Municipal “Federico González Suárez”";
        bibli1.direccion="Centro Historico de Quito";
        bibli1.BuscarLibro();
        
        // EMPLEADO
        Empleado empleado1=new Empleado();
        
        empleado1.nombre="Isaac";
        empleado1.GestionarUsuario();
        empleado1.Registrar_Transaccion();
        
        //Transaccion
        Transaccion tr=new Transaccion();
        tr.libro="HARRY POTTER";
        tr.usuario="Anahi";
        tr.Registrar();
               
    }
}
