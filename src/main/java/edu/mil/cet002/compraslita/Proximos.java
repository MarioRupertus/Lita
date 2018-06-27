package edu.mil.cet002.compraslita;

/**
 *
 * @author Maxi
 */
public class Proximos {

    private Nodo nodoVecino;
    private int costo;
    private int sentido;

    public Proximos(Nodo vecino, int costo) {
        this.nodoVecino = vecino;
        this.costo = costo;
    }

    public Proximos(Nodo nodoVecino, int costo, int sentido) {
        this.nodoVecino = nodoVecino;
        this.costo = costo;
        this.sentido = sentido;
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

    
    
}
