package edu.mil.cet002.compraslita;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Maxi
 */
public class Mapa {
    
    private List <Nodo> mapa = new ArrayList<>();

    public List<Nodo> getMapa() {
        return mapa;
    }

    public void agregarNodo(Nodo nodo){
        mapa.add(nodo);
    }
}
