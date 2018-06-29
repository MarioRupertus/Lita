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

    public List<Producto> buscarProducto(String nombre,int horario,String criterioOrden,String orden) {
        return litaDB.buscarProductoPorNombre(nombre,horario,criterioOrden,orden);
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
        Dijkstra d =new Dijkstra();
        d.calcularDistTodos(origen, mapa);
    }
    
    public Carrito crearCarrito(){
        return new Carrito();
    }
    
    public List<Producto> mostrarCarrito(Carrito c){
        return c.getListaDeProductos();
    }
    

}


/*
PANEL BÚSQUEDA
buscarProducto(String nombre, int horario, String criterioOrden, String ordenSentido): list<> productos
getHorarioActual();

RESULTADO BÚSQUEDA
OK agregarProductoCarro(Carrito, Producto): void

CARRO
mostrarCarro(Carrito): List<> productos
OK eliminarProducto(Carrito): void
definirDestinos(Carrito): List<> Comercios
iniciarRecorridoCaminando(nodoOrigen, nodoDestino, destinos);
iniciarRecorridoAuto(nodoOrigen, nodoDestino, destinos);
calcularPrecioTotal(Carrito);
buscarUbicacion(): nodo; // utilizado para ubicacion final e inicial

INFO COMERCIO
El codigo interno de la pantalla se encarga de obtener los datos necesarios

CALIFICACION
mostrarComerciosVisitados(Carrito): List<> Comercios
OK calificarPositivo(Comercio): void
OK calificarNegativo(Comercio): void
 */
