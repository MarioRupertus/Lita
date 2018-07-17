package edu.mil.cet002.test;

import edu.mil.cet002.compraslita.LitaDB;
import edu.mil.cet002.compraslita.Mapa;
import edu.mil.cet002.compraslita.Nodo;
import edu.mil.cet002.compraslita.Proximos;

public class TestGetMapa {

    public static void main(String[] args) {

        LitaDB litaDB = new LitaDB();

        Mapa m = litaDB.getMapa();

        for (Nodo n : m.getMapa()) {
            System.out.println("Desde el NODO #" + n.getIdnodo() + " " + n.getNombre() + " se puede ir a...");
            for (Proximos p : n.getVecinos()) {
                System.out.println("--> #" + p.getNodoVecino().getIdnodo() + " " + p.getNodoVecino().getNombre());
            }
            System.out.println("");
        }

        litaDB.cerrarSesion();

    }

}
