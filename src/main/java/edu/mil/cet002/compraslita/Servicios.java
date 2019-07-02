package edu.mil.cet002.compraslita;

import java.util.ArrayList;
import java.util.List;

public class Servicios {

    private List<Producto> listaDeProductos;
    private List<Comercio> listaDeComercios;
    private Mapa mapa;
    private LitaDB litaDB;

    private static final Servicios servicios = new Servicios();

    private Servicios() {
        litaDB = new LitaDB();
    }

    public Mapa getMapa() {
        return litaDB.getMapa();
    }

    public static Servicios getInstance() {
        return servicios;
    }

    public void cerrarSesion() {
        if (litaDB != null) {
            litaDB.cerrarSesion();
        }
    }
    
    public List<Producto>buscarProductosDelComercio(Comercio comercio){
        return litaDB.getProductosPorComercio(comercio);
    }

    public List<Producto> buscarProducto(String nombre, int horario, String criterioOrden, String orden) {
        return litaDB.buscarProductoPorNombre(nombre, horario, criterioOrden, orden);
    }

    /*
    public void calificarPositivo(Comercio comercio) {
        comercio.sumarVotoPositivo();
        litaDB.actualizarComercio(comercio);
    }

    public void calificarNegativo(Comercio comercio) {
        comercio.sumarVotoNegativo();
        litaDB.actualizarComercio(comercio);
    }*/
    public void agregarProductoCarro(Carrito carrito, Producto producto) {
        carrito.agregarAlCarrito(producto);
    }

    public void eliminarProductoCarro(Carrito carrito, Producto producto) {
        carrito.eliminarProducto(producto);
    }

    public Carrito crearCarrito() {
        return new Carrito();
    }

    public List<Producto> mostrarCarrito(Carrito carrito) {
        return carrito.getListaDeProductos();
    }

    public Recorrido calcularRecorrido(Nodo origen, Nodo destinoFinal, List<Nodo> destinoIntermedio, Mapa mapa, int auto) {

        // IMPORTANTE: HACER ESTO PARA TRANSFORMAR LOS DESTINOS INTERMEDIOS (LISTA) EN DESTINOS DEL MAPA
        List<Nodo> ubiAux = new ArrayList<>();
        for (Nodo nodo : destinoIntermedio) {
            int indiceNodo = mapa.getMapa().indexOf(nodo);
            if (indiceNodo != -1) {
                ubiAux.add(mapa.getMapa().get(indiceNodo));
            }

        }

        Recorrido recorrido = new Recorrido(origen, destinoFinal, ubiAux, mapa, auto); //Instancio un recorrido con el origen, destino, lista nodos de lugares a visiar y auto(0/1)

        if (auto == 0) {
            recorrido.calcularRecorrido();//si auto es 0 (false) se calcula caminando
        } else if (auto == 1) {
            recorrido.calcularRecorridoAuto();//si auto es 1 (true) se calcula en auto
        }

        return recorrido;
    }

    public List<Nodo> convertirComerciosAUbicaciones(List<Comercio> comercios) {
        List<Nodo> ubicaciones = new ArrayList<>();

        for (Comercio comercio : comercios) {
            if (!ubicaciones.contains(comercio.getUbicacion())) {
                ubicaciones.add(comercio.getUbicacion());
            }
        }
        return ubicaciones;
    }

    public List<Nodo> convertirProductosAUbicaciones(List<Producto> productos) {

        List<Nodo> ubicaciones = new ArrayList<>();
        Comercio comercio = new Comercio();

        for (Producto producto : productos) {
            comercio = producto.getComercio();
            if (!ubicaciones.contains(comercio.getUbicacion())) {
                ubicaciones.add(comercio.getUbicacion());
            }
        }
        return ubicaciones;
    }

    public List<Comercio> convertirProductosAComercios(List<Producto> productos) {

        List<Comercio> comercios = new ArrayList<>();

        for (Producto producto : productos) {
            if (!comercios.contains(producto.getComercio())) {
                comercios.add(producto.getComercio());
            }
        }
        return comercios;
    }

    public void actualizarComercio(Comercio comercio) {
        litaDB.actualizarComercio(comercio);
    }
    
    public List<Producto> getAllProductos(){
        return litaDB.getProductos();
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
