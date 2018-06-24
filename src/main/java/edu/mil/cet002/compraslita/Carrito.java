/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mil.cet002.compraslita;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class Carrito {
    
    private List<Producto> listaDeProductos;

    public Carrito() {
        listaDeProductos = new ArrayList<>();
    }
    
    public void agregarAlCarrito(Producto p){
        listaDeProductos.add(p);
    }
    
    public void eliminarProducto(Producto p){
        listaDeProductos.remove(p);
    }
    public void eliminarProducto(int i){
        listaDeProductos.remove(i);
    }
    
    public void eliminarCarrito(){
        listaDeProductos.clear();
    }

    public List<Producto> getListaDeProductos() {
        return listaDeProductos;
    }

    public void setListaDeProductos(List<Producto> listaDeProductos) {
        this.listaDeProductos = listaDeProductos;
    }
    
    
    
    
}
