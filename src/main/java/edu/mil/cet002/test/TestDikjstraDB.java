package edu.mil.cet002.test;

import edu.mil.cet002.compraslita.LitaDB;
import edu.mil.cet002.compraslita.Mapa;
import edu.mil.cet002.compraslita.Nodo;
import edu.mil.cet002.compraslita.Recorrido;
import edu.mil.cet002.compraslita.Servicios;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestDikjstraDB {
    
    public static void main(String args[]) {

        LitaDB litaDB = new LitaDB();
        Mapa mapa = litaDB.getMapa();
        Recorrido r = new Recorrido(mapa);
        Scanner sc = new Scanner(System.in);
        int aux;
        
        System.out.println("NODOS EN EL MAPA");
        for (int i = 0; i < mapa.getMapa().size();i++){
            System.out.println("#" + i + " " + mapa.getMapa().get(i).getNombre());
        }
        
        System.out.print("Ingrese numero de nodo Origen: ");
        aux  = sc.nextInt();
        r.setOrigen(mapa.getMapa().get(aux)); 
        System.out.println("");
        
        System.out.print("Ingrese numero de nodo Destino Final: ");
        aux  = sc.nextInt();
        r.setDestinoFinal(mapa.getMapa().get(aux));
        System.out.println("");
        
        while (aux>=0){
        System.out.print("Ingrese numero de nodo Destino Intermedio o -1 para finalizar y calcular recorrido: ");
        aux  = sc.nextInt();
        if (aux>=0){
            r.agregarDestino(mapa.getMapa().get(aux));
        }
        System.out.println("");
        }
                
        System.out.println("COMENZANDO CALCULO DE RECORRIDO...");
        r.calcularRecorridoAuto();
        
        
    }
    
}
