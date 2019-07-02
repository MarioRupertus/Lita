package edu.mil.cet002.compraslita;

import java.util.ArrayList;
import java.util.List;

public class Carrito {

    private List<Producto> listaDeProductos;
    private double mejorPrecio;

    public Carrito() {
        listaDeProductos = new ArrayList<>();
        mejorPrecio = 0;
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

    public double getMejorPrecio() {
        return mejorPrecio;
    }

    public void eliminarCarrito() {
        listaDeProductos.clear();
    }

    public Comercio calcularCompraOptima() {
        // Recorro todos los productos del carro para guardar en una lista todos los comercios que aparecen en la lista seleccionada y los nombres los producto
        List<Comercio> comercios = new ArrayList<>();
        List<String> nombreProductos = new ArrayList<>();

        for (Producto producto : listaDeProductos) {
            nombreProductos.add(producto.getNombre());
            if (!comercios.contains(producto.getComercio())) {
                comercios.add(producto.getComercio());
            }
        }

        // Ahora recorremos la lista de comercios y nos fijamos si van teniendo los productos del carro. Si no los tienen, sacamos el comercio de la lista. Al final deberan quedar los comercios que tienen todos los productos del carro.
        if (comercios.size() != 0) {
            for (String producto : nombreProductos) {
                for (Comercio com : comercios) {
                    // Dame los objetos producto del comercio
                    //List<Producto> productosDelComercio = Servicios.getInstance().buscarProductosDelComercio(com); VER PORQUE NO FUNCIONA ESTE METODO, HAY ALGUN ERROR CON EL QUERY O CON EL MAPEO
                    List<Producto> productosDelComercio = filtrarProductosByComercio(com);
                    // guardo los nombres de los productos (para poder compararlos)
                    List<String> nombreProdCom = new ArrayList<>();
                    for (Producto prodCom : productosDelComercio) {
                        nombreProdCom.add(prodCom.getNombre());
                    }
                    // elimino al comercio si no tiene algun producto
                    if (!nombreProdCom.contains(producto)) {
                        comercios.remove(com);
                    }
                }
            }

            // A esta altura ya tenemos la lista de productos y la lista de comercios que tienen todos esos productos. Debemos hacer la cuenta del costo total de esos productos en cada comercio. Nos quedamos con el mas barato.
            double precioMenor = 99999999;
            double precioCarro = 0;
            Comercio comercioElegido = new Comercio();

            for (Comercio com : comercios) {
                for (Producto prod : listaDeProductos) { // sumo todos los productos para ese comercio
                    precioCarro = +prod.getPrecio();
                }
                if (precioCarro < precioMenor) { // comparo el costo de este comercio con el minimo anterior
                    precioMenor = precioCarro;
                    comercioElegido = com;
                }
            }
            mejorPrecio = precioMenor;
            return comercioElegido;
        } else { // si se cumple este else es porque ningun comercio tiene todos los productos
            return null;
        }

    }

    public List<Producto> filtrarProductosByComercio(Comercio com) {
        List<Producto> allProductos = Servicios.getInstance().getAllProductos();
        List<Producto> productoComercio = new ArrayList();
        for (Producto p : allProductos) {
            if (p.getComercio().equals(com)) {
                productoComercio.add(p);
            }
        }
        return productoComercio;
    }
}
