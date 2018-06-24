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
public class Servicios {
    private List<Producto> listaDeProductos;
    private LitaDB litaDB;
    
    private static final Servicios servicios = new Servicios();
    
    public static Servicios getInstance(){
        return servicios;
    }
    
    private Servicios(){
        litaDB = new LitaDB();
    }

    public List<Producto> buscarProducto(String nombre){
        return litaDB.buscarProductoPorNombre(nombre);
        
    }
}
