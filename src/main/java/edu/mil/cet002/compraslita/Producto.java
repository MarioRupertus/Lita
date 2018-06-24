/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mil.cet002.compraslita;

/**
 *
 * @author User
 */
public class Producto {
    
    private String nombre;
    private double precio;
    private Comercio comercio;

    public Producto(String nombre, double precio, Comercio comercio) {
        this.nombre = nombre;
        this.precio = precio;
        this.comercio = comercio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public Comercio getComercio() {
        return comercio;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", precio=" + precio + ", comercio=" + comercio + '}';
    }
    
    
       
}
