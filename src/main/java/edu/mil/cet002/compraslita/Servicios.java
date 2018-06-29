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

    public List<?> buscarProducto(String nombre,int horario) {
        return litaDB.buscarProductoPorNombre(nombre,horario);
    }
    
    

    public void calificarPositivo(Comercio comercio) {
        comercio.sumarVotoPositivo();
        litaDB.actualizarComercio(comercio);
    }
    
    public void calificarNegativo(Comercio comercio) {
        comercio.sumarVotoNegativo();
        litaDB.actualizarComercio(comercio);
    }
    
    public void agregarProductoCarro(Carrito c, Producto p){
        c.agregarAlCarrito(p);
    }
    
    public void eliminarProductoCarro(Carrito c, Producto p){
        c.eliminarProducto(p);
    }

    public void calcularRecorrido(Recorrido recorrido) {
    }
    
    public Carrito crearCarrito(){
        return new Carrito();
    }
    
     public List<Producto> buscarProductoReal(String nombre) {
          List<Producto> listaDeProductosBuscados = new ArrayList<>();
//        Comercio c1 = new Comercio(9, 18);
//        Comercio c2 = new Comercio(9, 20);
//        Comercio c3 = new Comercio(7, 18);
        
/*
        lista.add(new Producto());
        lista.add(new Producto());
        lista.add(new Producto p3);
  */      return listaDeProductosBuscados;
    }
}


/**
PANEL BÚSQUEDA
buscarProductoSinHorario(String): list<> productos
buscarProductoConHorario(String nombre, int horario): list<> productos

RESULTADO BÚSQUEDA
ordenarResultadoProdNombre(List<> productos): List<> Productos;
ordenarResultadoProdPrecioAscendente(List<> productos): List<> Productos;
ordenarResultadoProdPrecioDescendente(List<> productos): List<> Productos;
ordenarResultadoProdPuntosAscendente(List<> productos): List<> Productos;
ordenarResultadoProdPuntosDescendente(List<> productos): List<> Productos;
OK agregarProductoCarro(Carrito, Producto): void

CARRO
mostrarCarro(Carrito): void
OK eliminarProducto(Carrito): void
definirDestinos(Carrito): List<> Comercios

INFO COMERCIO
getUbicacionCom(Comercio): String
getDuenioCom(Comercio): String
getHorarioAperturaCom(Comercio): int
getHorarioCierreCom(Comercio): int
getCalificacionPositivasCom(Comercio): int
getCalificacionNegativasCom(Comercio): int
getProductosCom(Comercio): list<> productos


CALIFICACION
OK calificarPositivo(Comercio): void
OK calificarNegativo(Comercio): void
 */