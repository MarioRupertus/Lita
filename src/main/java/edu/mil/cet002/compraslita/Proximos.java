package edu.mil.cet002.compraslita;

import java.io.Serializable;

public class Proximos implements Serializable {

    private Nodo nodoVecino;
    private Nodo nodoOrigen;
    private int costo;
    private int sentido;

    public Proximos() {
    }

    public Proximos(Nodo vecino, int costo) {
        this.nodoVecino = vecino;
        this.costo = costo;
    }

    public Proximos(Nodo nodoVecino, int costo, int sentido) {
        this.nodoVecino = nodoVecino;
        this.costo = costo;
        this.sentido = sentido;
    }

    public Nodo getNodoVecino() {
        return nodoVecino;
    }

    public void setNodoVecino(Nodo nodoVecino) {
        this.nodoVecino = nodoVecino;
    }

    public Nodo getNodoOrigen() {
        return nodoOrigen;
    }

    public void setNodoOrigen(Nodo nodoOrigen) {
        this.nodoOrigen = nodoOrigen;
    }

    public Nodo getnodoVecino() {
        return nodoVecino;
    }

    public void setnodoVecino(Nodo nodoVecino) {
        this.nodoVecino = nodoVecino;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getSentido() {
        return sentido;
    }

    public void setSentido(int sentido) {
        this.sentido = sentido;
    }

    @Override
    public String toString() {
        return "Proximos{" + "nodoVecino=" + nodoVecino + ", nodoOrigen=" + nodoOrigen + ", costo=" + costo + ", sentido=" + sentido + '}';
    }

}
