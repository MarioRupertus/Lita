package edu.mil.cet002.test;

import edu.mil.cet002.compraslita.Mapa;
import edu.mil.cet002.compraslita.Nodo;
import edu.mil.cet002.compraslita.Proximos;
import edu.mil.cet002.compraslita.Recorrido;
import java.util.Scanner;

/**
 *
 * @author Maxi
 */
public class TestDijkstraAuto {

    public static void main(String args[]) {

        // Creo nodos
        Nodo A = new Nodo("A");
        Nodo B = new Nodo("B");
        Nodo C = new Nodo("C");
        Nodo D = new Nodo("D");
        Nodo E = new Nodo("E");
        Nodo F = new Nodo("F");
        Nodo G = new Nodo("G");
        Nodo H = new Nodo("H");
        Nodo I = new Nodo("I");
        Nodo J = new Nodo("J");
        Nodo K = new Nodo("K");
        Nodo L = new Nodo("L");
   
        // Creo mapa y agrego nodos
        Mapa mapa = new Mapa();

        mapa.agregarNodo(A);
        mapa.agregarNodo(B);
        mapa.agregarNodo(C);
        mapa.agregarNodo(D);
        mapa.agregarNodo(E);
        mapa.agregarNodo(F);
        mapa.agregarNodo(G);
        mapa.agregarNodo(H);
        mapa.agregarNodo(I);
        mapa.agregarNodo(J);
        mapa.agregarNodo(K);
        mapa.agregarNodo(L);

        // Defino vecinos de cada nodo
        
        // Ver porque se rompe la ejecucion si los vecinos se agregran en orden diferente al que fueron agregados al mapa. En este ejemplo, si no agregamos los vecinos en orden alfabetico, falla la ejecucion.
        A.agregarVecino(new Proximos(F, 100,1));
        F.agregarVecino(new Proximos(A, 100,0));
        
        F.agregarVecino(new Proximos(G, 100,1));
        G.agregarVecino(new Proximos(F, 100,0));
        
        G.agregarVecino(new Proximos(L, 100,1));
        L.agregarVecino(new Proximos(G, 100,0));
        
        L.agregarVecino(new Proximos(K, 100,1));
        K.agregarVecino(new Proximos(L, 100,0));
        
        K.agregarVecino(new Proximos(J, 100,1));
        J.agregarVecino(new Proximos(K, 100,0));
        
        J.agregarVecino(new Proximos(I, 100,1));
        I.agregarVecino(new Proximos(J, 100,0));
        
        I.agregarVecino(new Proximos(D, 100,1));
        D.agregarVecino(new Proximos(I, 100,0));
        
        D.agregarVecino(new Proximos(C, 100,1));
        C.agregarVecino(new Proximos(D, 100,0));
        
        C.agregarVecino(new Proximos(B, 100,1));
        B.agregarVecino(new Proximos(C, 100,0));
        
        B.agregarVecino(new Proximos(A, 100,1));
        A.agregarVecino(new Proximos(B, 100,0));
        
        F.agregarVecino(new Proximos(E, 100,1));
        E.agregarVecino(new Proximos(F, 100,0));
        
        E.agregarVecino(new Proximos(D, 100,1));
        D.agregarVecino(new Proximos(E, 100,0));
        
        G.agregarVecino(new Proximos(H, 100,0));
        H.agregarVecino(new Proximos(G, 100,1));
        
        H.agregarVecino(new Proximos(I, 100,0));
        I.agregarVecino(new Proximos(H, 100,1));
        
        B.agregarVecino(new Proximos(E, 100,0));
        E.agregarVecino(new Proximos(B, 100,1));
        
        E.agregarVecino(new Proximos(H, 100,0));
        H.agregarVecino(new Proximos(E, 100,1));
        
        H.agregarVecino(new Proximos(K, 100,0));
        K.agregarVecino(new Proximos(H, 100,1));

                        
        Recorrido r = new Recorrido(mapa);
        r.setOrigen(E);
        r.agregarDestino(C);
        r.agregarDestino(H);
        r.setDestinoFinal(J);
        r.calcularRecorridoAuto();

    }

}


