package edu.mil.cet002.test;

import edu.mil.cet002.compraslita.Carrito;
import edu.mil.cet002.compraslita.Comercio;
import edu.mil.cet002.compraslita.LitaDB;
import edu.mil.cet002.compraslita.Mapa;
import edu.mil.cet002.compraslita.Nodo;
import edu.mil.cet002.compraslita.Producto;
import edu.mil.cet002.compraslita.Recorrido;
import edu.mil.cet002.compraslita.Servicios;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestCompleto {

    public static void main(String args[]) {

        LitaDB litaDB = new LitaDB();
        List<Producto> prod = litaDB.getProductos();
        List<Comercio> com = new ArrayList<>();
        List<Nodo> ubicaciones = new ArrayList<>();
        Nodo nodoInicial, nodoFinal;
        Mapa mapa = litaDB.getMapa();
        Recorrido r = new Recorrido(mapa);
        Carrito carrito = new Carrito();
        Scanner scan = new Scanner(System.in);
        Servicios servicios = Servicios.getInstance();
        int input = 0;
        int indice = 0;

        // SE MUESTRAN PRODUCTOS
        System.out.println("MOSTRANDO LISTA DE PRODUCTOS");
        for (Producto p : prod) {
            indice++;
            System.out.println("#" + indice + " " + p.getComercio().getNombre() + "\t" + p.getComercio().getUbicacion().getNombre() + "\t" + p.getNombre());
        }

        // SE SELECCIONAN PRODUCTOS
        while (input >= 0) {
            System.out.print("Seleccione numero de producto a agregar al carrito o -1 para finalizar carga de productos: ");
            input = scan.nextInt() - 1; // Le restamos uno porque el ID tiene +1 respecto a la posicion de la lista q comienza en 0
            try {
                carrito.agregarAlCarrito(prod.get(input));
                System.out.println(prod.get(input).getNombre() + " agregado al carrito");
            } catch (Exception e) {
                if (input < 0) {
                    System.out.println("Finalizada carga de productos\n ");

                } else {
                    System.out.println("Producto inválido.");
                }
            }
        }

        // SE MUESTRA EL CARRITO
        System.out.println("CARRITO:");
        for (Producto p : carrito.getListaDeProductos()) {
            System.out.println("ID"+p.getIdproducto()+" "+p.getComercio().getNombre() + "\t" + p.getComercio().getUbicacion().getNombre() + "\t" + p.getNombre());
        }
        System.out.println("");

        // SE CALCULAN COMERCIOS A VISITAR y se muestran
        System.out.print("Transformando lista de productos en comercios... ");
        com = servicios.convertirProductosAComercios(carrito.getListaDeProductos());
        System.out.println("Los comercios a visitar son: ");
        for (Comercio c : com) {
            System.out.println("ID"+c.getIdcomercio()+" "+c.getNombre() + " --> " + c.getUbicacion().getNombre());
        }
        System.out.println("");

        // SE CALCULAN UBICACION DESDE LOS COMERCIOS
        System.out.print("Transformando lista de comercios en ubicaciones... ");
        ubicaciones = servicios.convertirComerciosAUbicaciones(com);
        System.out.println("Las ubicaciones a visitar son: ");
        for (Nodo u : ubicaciones) {
            System.out.println("ID"+u.getIdnodo()+" "+u.getNombre());
        }
        System.out.println("");
        System.out.println("Presione enter para continuar");
        String aux;
        aux = scan.nextLine();
        System.out.println("");

        // MOSTRANDO NODOS DEL MAPA PARA SELECCIONAR INICIO Y FIN
        System.out.println("NODOS EN EL MAPA");
        indice = 0;
        for (Nodo n : mapa.getMapa()) {
            indice++;
            System.out.println(indice + " " + n.getNombre());
        }

        System.out.print("Ingrese numero de nodo Origen: ");
        input = scan.nextInt()-1;
        nodoInicial = mapa.getMapa().get(input);
        System.out.println("");

        System.out.print("Ingrese numero de nodo Destino Final: ");
        input = scan.nextInt()-1;
        nodoFinal = mapa.getMapa().get(input);
        System.out.println("");
        
        // SE CALCULA EL RECORRIDO
        System.out.println("Ingrese 0 para caminar // Ingrese 1 para ir en auto: ");
        input = scan.nextInt();
        servicios.calcularRecorrido(nodoInicial, nodoFinal, ubicaciones, input);

    }

}
