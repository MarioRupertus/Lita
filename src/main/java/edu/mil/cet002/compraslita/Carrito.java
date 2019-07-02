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
        List<Comercio> comercios = new ArrayList<>(); //comercios que tienen los productos elegidos
        List<String> nombreProductos = new ArrayList<>();
        List<Producto> allProductos = Servicios.getInstance().getAllProductos(); //todos los productos de la base
        List<Comercio> eliminarComercios = new ArrayList<>();

        // GUARDO EL NOMBRE DE LOS PRODUCTOS
        for (Producto producto : listaDeProductos) { //recorro el carrito elegido
            nombreProductos.add(producto.getNombre()); //guardo el string del nombre de los productos (para poder comparar)
        }

        // BUSCO LOS COMERCIOS QUE TIENEN ALGUNO DE LOS PRODUCTOS ELEGIDOS (Busco por el nombre)
        for (String nombreProd : nombreProductos) {
            for (Producto p : allProductos) {
                if (p.getNombre().equals(nombreProd)) {
                    if (!comercios.contains(p.getComercio())) {
                        comercios.add(p.getComercio());
                    }
                }
            }
        }

        // RECORREMOS LOS COMERCIOS PARA FILTRAR LOS QUE SOLO TIENEN TODOS LOS PRODUCTOS
        // Ahora recorremos la lista de comercios y nos fijamos si van teniendo los productos del carro. Si no los tienen, sacamos el comercio de la lista. Al final deberan quedar los comercios que tienen todos los productos del carro.
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
                    eliminarComercios.add(com);
                }
            }
        }
        for (Comercio comEliminar : eliminarComercios) {
            comercios.remove(comEliminar);
        }

        if (comercios.size() > 0) {

            // BUSCO EL COMERCIO MAS BARATO
            // A esta altura ya tenemos la lista de productos y la lista de comercios que tienen todos esos productos. Debemos hacer la cuenta del costo total de esos productos en cada comercio. Nos quedamos con el mas barato.
            double precioMenor = 99999999;
            double precioCarro;
            Comercio comercioElegido = new Comercio();

            for (Comercio com : comercios) {
                precioCarro = 0;
                for (Producto prodCarro : listaDeProductos) { // sumo todos los productos para ese comercio
                    List<Producto> productosDelComercio = filtrarProductosByComercio(com);
                    for (Producto prodCom : productosDelComercio) {
                        if (prodCom.getNombre().equals(prodCarro.getNombre())) {
                            precioCarro += prodCom.getPrecio();
                        }
                    }
                }
                if (precioCarro < precioMenor) { // comparo el costo de este comercio con el minimo anterior
                    precioMenor = precioCarro;
                    comercioElegido = com;
                }
            }
            mejorPrecio = precioMenor;

            return comercioElegido;
        } else {
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
