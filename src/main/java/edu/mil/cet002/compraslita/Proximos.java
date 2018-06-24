package edu.mil.cet002.compraslita;

/**
 *
 * @author Maxi
 */
public class Proximos {

    private Nodo nodoVecino;
    private int costo;

    public Proximos(Nodo vecino, int costo) {
        this.nodoVecino = vecino;
        this.costo = costo;
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

}
