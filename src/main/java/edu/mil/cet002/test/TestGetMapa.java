/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mil.cet002.test;

import edu.mil.cet002.compraslita.LitaDB;
import edu.mil.cet002.compraslita.Mapa;
import edu.mil.cet002.compraslita.Nodo;
import edu.mil.cet002.compraslita.Proximos;


/**
 *
 * @author User
 */
public class TestGetMapa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        LitaDB litaDB = new LitaDB();

        Mapa m = litaDB.getMapa();
        
        for (Nodo n : m.getMapa()){
            System.out.println("Desde el NODO #" + n.getIdnodo() +" "+ n.getNombre() + " se puede ir a...");
            for (Proximos p : n.getVecinos()){
                System.out.println("--> #"+p.getNodoVecino().getIdnodo() +" "+ p.getNodoVecino().getNombre());
            }
            System.out.println("");
        }
        
        litaDB.cerrarSesion();

    }

}
