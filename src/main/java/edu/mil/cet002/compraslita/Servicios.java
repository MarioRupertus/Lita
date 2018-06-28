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
agregarProductoCarro(Carro, Producto): void

CARRO
mostrarCarro(): void
eliminarProducto(Producto): void
definirDestinos(List<> Productos): List<> Comercios

INFO COMERCIO
getUbicacionCom(Comercio): String
getDuenioCom(Comercio): String
getHorarioAperturaCom(Comercio): int
getHorarioCierreCom(Comercio): int
getCalificacionPositivasCom(Comercio): int
getCalificacionNegativasCom(Comercio): int
getProductosCom(Comercio): list<> productos


CALIFICACION
calificarPositivo(Comercio): void
calificarNegativo(Comercio): void
 */