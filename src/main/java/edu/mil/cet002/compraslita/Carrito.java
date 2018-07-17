package edu.mil.cet002.compraslita;

import java.util.ArrayList;
import java.util.List;

public class Carrito {

    private List<Producto> listaDeProductos;

    public Carrito() {
        listaDeProductos = new ArrayList<>();
    }

    public List<Producto> getListaDeProductos() {
        return listaDeProductos;
    }

    public void setListaDeProductos(List<Producto> listaDeProductos) {
        this.listaDeProductos = listaDeProductos;
    }

    public void agregarAlCarrito(Producto producto) {
        listaDeProductos.add(producto);
    }

    public void eliminarProducto(Producto producto) {
        listaDeProductos.remove(producto);
    }

    public void eliminarProducto(int posProducto) {
        listaDeProductos.remove(posProducto);
    }

    public void eliminarCarrito() {
        listaDeProductos.clear();
    }
}
