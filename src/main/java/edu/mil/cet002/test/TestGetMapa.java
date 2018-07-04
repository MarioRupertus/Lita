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

/**        List<Proximos> p = litaDB.getProximos();
        for (Proximos i : p) {
            System.out.println("Nodo origen: " + i.getNodoOrigen().getNombre());
            System.out.println("Nodo vecino: " + i.getNodoVecino().getNombre());
            
        }
**/

    Mapa m = litaDB.getMapa();
        
        for (Nodo n : m.getMapa()){
            System.out.println("");
            System.out.println(n);
            System.out.println("Vecino de " + n.getNombre());
            for (Proximos p : n.getVecinos()){
                System.out.println(p);
            }
            System.out.println("");
        }
        
        litaDB.cerrarSesion();

    }

}
