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
public class LitaDB {
    
    public List<Producto> buscarProductoPorNombre(String nombre){
        List<Producto> lista = new ArrayList<>();
        Comercio c1 = new Comercio(9, 18);
        Comercio c2 = new Comercio(9, 20);
        Comercio c3 = new Comercio(7, 18);
        lista.add(new Producto("Martillo verde", 1, c1));
        lista.add(new Producto("Martillo de goma", 233, c2));
        lista.add(new Producto("Martillo neumatico", 1234, c3));       
        return lista;
        
    }
    
}
