package edu.mil.cet002.test;

import edu.mil.cet002.compraslita.LitaDB;
import edu.mil.cet002.compraslita.Mapa;
import edu.mil.cet002.compraslita.Nodo;
import edu.mil.cet002.compraslita.Proximos;
import java.util.List;

public class TestGetProximos {

public static void main(String[] args) {

        LitaDB litaDB = new LitaDB();

        List<Proximos> p = litaDB.getProximos();
        for (Proximos i : p) {
            System.out.println("Desde " + i.getNodoOrigen().getNombre() + " hasta " + i.getNodoVecino().getNombre() + " con costo " + i.getCosto());
        }

          
        litaDB.cerrarSesion();

    }

}
