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
    private Integer idproducto;

    public Producto() {
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setComercio(Comercio comercio) {
        this.comercio = comercio;
    }

    public Integer getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(Integer idproducto) {
        this.idproducto = idproducto;
    }

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
