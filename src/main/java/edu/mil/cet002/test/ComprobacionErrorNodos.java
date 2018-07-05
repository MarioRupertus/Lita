package edu.mil.cet002.test;

import edu.mil.cet002.compraslita.LitaDB;
import edu.mil.cet002.compraslita.Mapa;
import edu.mil.cet002.compraslita.Nodo;
import edu.mil.cet002.compraslita.Producto;
import edu.mil.cet002.compraslita.Servicios;
import java.util.List;

public class ComprobacionErrorNodos {
    
    public static void main(String args[]){
    
    LitaDB litaDB = new LitaDB();
    Servicios servicios = Servicios.getInstance();
    Mapa mapa = litaDB.getMapa();
    List<Producto> productos = litaDB.getProductos();
    List<Nodo> ubicacionesProductos = servicios.convertirProductosAUbicaciones(productos);
    
    int a = 0;
    // Debuggear y verificar referencia en memoria a los nodos en MAPA y en UBICACIONEPRODUCTOS --> NO SON LAS MISMAS
    }
}
