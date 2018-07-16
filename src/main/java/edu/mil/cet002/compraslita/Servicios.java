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
    
    public void cerrarSesion(){
        if (litaDB!=null)
            litaDB.cerrarSesion();
    }
    
    

    public List<Producto> buscarProducto(String nombre, int horario, String criterioOrden, String orden) {
        return litaDB.buscarProductoPorNombre(nombre, horario, criterioOrden, orden);
    }

    /* NO UTILIZADO, ree
    public void calificarPositivo(Comercio comercio) {
        comercio.sumarVotoPositivo();
        litaDB.actualizarComercio(comercio);
    }

    public void calificarNegativo(Comercio comercio) {
        comercio.sumarVotoNegativo();
        litaDB.actualizarComercio(comercio);
    }*/ 

    public void agregarProductoCarro(Carrito c, Producto p) {
        c.agregarAlCarrito(p);
    }

    public void eliminarProductoCarro(Carrito c, Producto p) {
        c.eliminarProducto(p);
    }

    public void calcularRecorrido(Recorrido recorrido) {

    }

    public Carrito crearCarrito() {
        return new Carrito();
    }

    public List<Producto> mostrarCarrito(Carrito c) {
        return c.getListaDeProductos();
    }

    public Mapa getMapa() {
        return litaDB.getMapa();
    }

    public Recorrido calcularRecorrido(Nodo origen, Nodo destinoFinal, List<Nodo> destinoIntermedio, Mapa mapa, int auto) {
        
        // IMPORTANTE: HACER ESTO PARA TRANSFORMAR LOS DESTINOS INTERMEDIOS (LISTA) EN DESTINOS DEL MAPA
        List<Nodo> ubiAux = new ArrayList<>();
        for (Nodo n:destinoIntermedio){
            int i=mapa.getMapa().indexOf(n);
            if (i!=-1){
                ubiAux.add(mapa.getMapa().get(i));
            }
        
        }
        
        
        Recorrido r = new Recorrido(origen, destinoFinal, ubiAux, mapa, auto); //Instancio un recorrido con el origen, destino, lista nodos de lugares a visiar y auto(0/1)

        if (auto == 0) {
            r.calcularRecorrido();//si auto es 0 (false) se calcula caminando
        } else if (auto == 1) {
            r.calcularRecorridoAuto();//si auto es 1 (true) se calcula en auto
        }

        return r;
    }

    public List<Nodo> convertirComerciosAUbicaciones(List<Comercio> com) {
        List<Nodo> ubicaciones = new ArrayList<>();

        for (Comercio c : com) {
            if (!ubicaciones.contains(c.getUbicacion())) {
                ubicaciones.add(c.getUbicacion());
            }
        }
        return ubicaciones;
    }

    public List<Nodo> convertirProductosAUbicaciones(List<Producto> prod) {

        List<Nodo> ubicaciones = new ArrayList<>();
        Comercio c = new Comercio();

        for (Producto p : prod) {
            c = p.getComercio();
            if (!ubicaciones.contains(c.getUbicacion())) {
                ubicaciones.add(c.getUbicacion());
            }
        }
        return ubicaciones;
    }

    public List<Comercio> convertirProductosAComercios(List<Producto> prod) {

        List<Comercio> comercios = new ArrayList<>();

        for (Producto p : prod) {
            if (!comercios.contains(p.getComercio())) {
                comercios.add(p.getComercio());
            }
        }
        return comercios;
    }
    
    public void actualizarComercio(Comercio c){
        litaDB.actualizarComercio(c);
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
