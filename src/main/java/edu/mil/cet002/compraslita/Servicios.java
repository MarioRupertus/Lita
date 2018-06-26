package edu.mil.cet002.compraslita;

import java.util.ArrayList;
import java.util.List;

public class Servicios {

    private List<Producto> listaDeProductos;
    private List<Comercio> listaDeComercios;
    private Mapa mapa;
    private LitaDB litaDB;

    private static final Servicios servicios = new Servicios();

    public static Servicios getInstance() {
        return servicios;
    }

    private Servicios() {
        litaDB = new LitaDB();
    }

    public List<Producto> buscarProducto(String nombre) {
        return litaDB.buscarProductoPorNombre(nombre);
    }

    public void calificarComercio(Comercio comercio) {
        
    }

    public void calcularRecorrido(Recorrido recorrido) {
    }
    
    public Carrito crearCarrito(){
        Carrito carrito = new Carrito();
        return carrito;
    }
    
     public List<Producto> buscarProductoReal(String nombre) {
          List<Producto> listaDeProductosBuscados = new ArrayList<>();
//        Comercio c1 = new Comercio(9, 18);
//        Comercio c2 = new Comercio(9, 20);
//        Comercio c3 = new Comercio(7, 18);
        
        lista.add(new Producto p1);
        lista.add(new Producto p2);
        lista.add(new Producto p3);
        return listaDeProductosBuscados;
    }
}
