package edu.mil.cet002.test;

import edu.mil.cet002.compraslita.LitaDB;
import edu.mil.cet002.compraslita.Mapa;
import edu.mil.cet002.compraslita.Recorrido;
import java.util.Scanner;

public class TestDikjstraDB {

    public static void main(String args[]) {

        LitaDB litaDB = new LitaDB();
        Mapa mapa = litaDB.getMapa();
        Recorrido r = new Recorrido(mapa);
        Scanner sc = new Scanner(System.in);
        int aux;

        //SE MUESTRAN NODOS DEL MAPA
        System.out.println("NODOS EN EL MAPA");
        for (int i = 0; i < mapa.getMapa().size(); i++) {
            System.out.println("#" + (i + 1) + " " + mapa.getMapa().get(i).getNombre());
        }

        // SE SELECCIONA ORIGEN
        System.out.print("Ingrese numero de nodo Origen: ");
        aux = sc.nextInt() - 1;
        r.setOrigen(mapa.getMapa().get(aux));
        System.out.println("");

        // SE SELECCIONA FINAL
        System.out.print("Ingrese numero de nodo Destino Final: ");
        aux = sc.nextInt() - 1;
        r.setDestinoFinal(mapa.getMapa().get(aux));
        System.out.println("");

        // SE AGREGAN DESTINOS INTERMEDIOS
        while (aux >= 0) {
            System.out.print("Ingrese numero de nodo Destino Intermedio o -1 para finalizar y calcular recorrido: ");
            aux = sc.nextInt() - 1;
            if (aux >= 0) {
                r.agregarDestino(mapa.getMapa().get(aux));
            }
            System.out.println("");
        }

        // SE SELECCIONA MODO CAMINANDO O AUTO
        aux = 99;
        while (aux != 0 && aux != 1) {
            System.out.print("Ingrese modo recorrido 0 = CAMINANDO o 1=AUTO --> ");
            aux = sc.nextInt();
        }

        // SE CALCULA EL RECORRIDO
        System.out.println("COMENZANDO CALCULO DE RECORRIDO...");
        switch (aux) {
            case 0:
                r.calcularRecorrido();
            case 1:
                r.calcularRecorridoAuto();
        }

    }

}
