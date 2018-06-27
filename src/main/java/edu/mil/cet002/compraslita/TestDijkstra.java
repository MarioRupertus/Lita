package edu.mil.cet002.compraslita;

import java.util.Scanner;

/**
 *
 * @author Maxi
 */
public class TestDijkstra {

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
        Nodo M = new Nodo("M");
        Nodo N = new Nodo("N");
        Nodo O = new Nodo("O");
        Nodo P = new Nodo("P");
        Nodo Q = new Nodo("Q");
        Nodo R = new Nodo("R");
        Nodo S = new Nodo("S");
        Nodo T = new Nodo("T");
        Nodo U = new Nodo("U");
        
        

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
        mapa.agregarNodo(M);
        mapa.agregarNodo(N);
        mapa.agregarNodo(O);
        mapa.agregarNodo(P);
        mapa.agregarNodo(Q);
        mapa.agregarNodo(R);
        mapa.agregarNodo(S);
        mapa.agregarNodo(T);
        mapa.agregarNodo(U);

        // Defino vecinos de cada nodo
        
        // Ver porque se rompe la ejecucion si los vecinos se agregran en orden diferente al que fueron agregados al mapa. En este ejemplo, si no agregamos los vecinos en orden alfabetico, falla la ejecucion.
        A.agregarVecino(new Proximos(B, 100));
        B.agregarVecino(new Proximos(A, 100));
        A.agregarVecino(new Proximos(D, 100));
        D.agregarVecino(new Proximos(A, 100));
        A.agregarVecino(new Proximos(C, 100));
        C.agregarVecino(new Proximos(A, 100));
        A.agregarVecino(new Proximos(E, 100));
        E.agregarVecino(new Proximos(A, 100));
        B.agregarVecino(new Proximos(N, 100));
        N.agregarVecino(new Proximos(B, 100));
        B.agregarVecino(new Proximos(J, 100));
        J.agregarVecino(new Proximos(B, 100));
        D.agregarVecino(new Proximos(M, 100));
        M.agregarVecino(new Proximos(D, 100));              
        J.agregarVecino(new Proximos(E, 100));
        E.agregarVecino(new Proximos(J, 100));
        E.agregarVecino(new Proximos(K, 100));
        K.agregarVecino(new Proximos(E, 100));
        N.agregarVecino(new Proximos(C, 100));
        C.agregarVecino(new Proximos(N, 100));
        C.agregarVecino(new Proximos(M, 100));
        M.agregarVecino(new Proximos(C, 100));
               
        D.agregarVecino(new Proximos(L, 80));
        L.agregarVecino(new Proximos(D, 80));
        K.agregarVecino(new Proximos(L, 80));
        L.agregarVecino(new Proximos(K, 80));
        L.agregarVecino(new Proximos(G, 80));
        G.agregarVecino(new Proximos(L, 80));
        
        J.agregarVecino(new Proximos(F, 75));
        F.agregarVecino(new Proximos(J, 75));
        F.agregarVecino(new Proximos(A, 75));
        A.agregarVecino(new Proximos(F, 75));
        F.agregarVecino(new Proximos(B, 75));
        B.agregarVecino(new Proximos(F, 75));
        F.agregarVecino(new Proximos(E, 75));
        E.agregarVecino(new Proximos(F, 75));
        I.agregarVecino(new Proximos(B, 75));
        B.agregarVecino(new Proximos(I, 75));
        I.agregarVecino(new Proximos(N, 75));
        N.agregarVecino(new Proximos(I, 75));
        I.agregarVecino(new Proximos(A, 75));
        A.agregarVecino(new Proximos(I, 75));
        I.agregarVecino(new Proximos(C, 75));
        C.agregarVecino(new Proximos(I, 75));
        G.agregarVecino(new Proximos(E, 75));
        E.agregarVecino(new Proximos(G, 75));
        G.agregarVecino(new Proximos(A, 75));
        A.agregarVecino(new Proximos(G, 75));
        G.agregarVecino(new Proximos(K, 75));
        K.agregarVecino(new Proximos(G, 75));
        G.agregarVecino(new Proximos(D, 75));
        D.agregarVecino(new Proximos(G, 75));
        H.agregarVecino(new Proximos(A, 75));
        A.agregarVecino(new Proximos(H, 75));
        H.agregarVecino(new Proximos(C, 75));
        C.agregarVecino(new Proximos(H, 75));
        H.agregarVecino(new Proximos(D, 75));
        D.agregarVecino(new Proximos(H, 75));
        H.agregarVecino(new Proximos(M, 75));
        M.agregarVecino(new Proximos(H, 75));
        
        S.agregarVecino(new Proximos(J, 60));
        J.agregarVecino(new Proximos(S, 60));
        S.agregarVecino(new Proximos(B, 60));
        B.agregarVecino(new Proximos(S, 60));
        S.agregarVecino(new Proximos(F, 60));
        F.agregarVecino(new Proximos(S, 60));
        O.agregarVecino(new Proximos(B, 60));
        B.agregarVecino(new Proximos(O, 60));
        O.agregarVecino(new Proximos(A, 60));
        A.agregarVecino(new Proximos(O, 60));
        O.agregarVecino(new Proximos(F, 60));
        F.agregarVecino(new Proximos(O, 60));
        T.agregarVecino(new Proximos(N, 60));
        N.agregarVecino(new Proximos(T, 60));
        T.agregarVecino(new Proximos(I, 60));
        I.agregarVecino(new Proximos(T, 60));
        T.agregarVecino(new Proximos(C, 60));
        C.agregarVecino(new Proximos(T, 60));
        P.agregarVecino(new Proximos(I, 60));
        I.agregarVecino(new Proximos(P, 60));
        P.agregarVecino(new Proximos(C, 60));
        C.agregarVecino(new Proximos(P, 60));
        P.agregarVecino(new Proximos(A, 60));
        A.agregarVecino(new Proximos(P, 60));
        Q.agregarVecino(new Proximos(H, 60));
        H.agregarVecino(new Proximos(Q, 60));
        Q.agregarVecino(new Proximos(M, 60));
        M.agregarVecino(new Proximos(Q, 60));
        Q.agregarVecino(new Proximos(D, 60));
        D.agregarVecino(new Proximos(Q, 60));
        R.agregarVecino(new Proximos(A, 60));
        A.agregarVecino(new Proximos(R, 60));
        R.agregarVecino(new Proximos(D, 60));
        D.agregarVecino(new Proximos(R, 60));
        R.agregarVecino(new Proximos(G, 60));
        G.agregarVecino(new Proximos(R, 60));
        U.agregarVecino(new Proximos(E, 60));
        E.agregarVecino(new Proximos(U, 60));
        U.agregarVecino(new Proximos(G, 60));
        G.agregarVecino(new Proximos(U, 60));
        U.agregarVecino(new Proximos(K, 60));
        K.agregarVecino(new Proximos(U, 60));
                        
        Recorrido r = new Recorrido(mapa);
        r.setOrigen(O);
        r.agregarDestino(L);
        r.agregarDestino(E);
        r.agregarDestino(C);
        r.agregarDestino(I);
        r.agregarDestino(N);
        r.setDestinoFinal(M);
        r.calcularRecorrido();

    }

}

