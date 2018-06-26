package maven_ejemplo_ok;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Maxi
 */
public class Nodo {

    private String nombre;
    private Nodo antecesor;
    private int pesoAcumulado;
    private List<Proximos> vecinos = new ArrayList<>();
    private boolean visitado;
    private int idnodo;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVecinos(List<Proximos> vecinos) {
        this.vecinos = vecinos;
    }
    
    

    public Nodo(String nombre) {
        this.nombre = nombre;
    }

    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }

    public void agregarVecino(Proximos vecino) {
        vecinos.add(vecino);
    }

    public String getNombre() {
        return nombre;
    }

    public List<Proximos> getVecinos() {
        return vecinos;
    }

    public Nodo getAntecesor() {
        return antecesor;
    }

    public void setAntecesor(Nodo antecesor) {
        this.antecesor = antecesor;
    }

    public int getPesoAcumulado() {
        return pesoAcumulado;
    }

    public void setPesoAcumulado(int pesoAcumulado) {
        this.pesoAcumulado = pesoAcumulado;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Nodo other = (Nodo) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
        
        
    }

    public Nodo() {
    }
    
    

    public int getIdnodo() {
        return idnodo;
    }

    public void setIdnodo(int idnodo) {
        this.idnodo = idnodo;
    }

    @Override
    public String toString() {
        return "Nodo{" + "nombre=" + nombre + ", idnodo=" + idnodo + '}';
    }

}
