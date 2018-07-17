package edu.mil.cet002.compraslita;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Nodo {

    private String nombre;
    private Integer idnodo;

    private List<Proximos> vecinos = new ArrayList<>();

    private Nodo antecesor; // Utilizados y completados por Dijkstra
    private int pesoAcumulado; // Utilizados y completados por Dijkstra
    private boolean visitado; // Utilizados y completados por Dijkstra

    public Nodo() {
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVecinos(List<Proximos> vecinos) {
        this.vecinos = vecinos;
    }

    public Integer getIdnodo() {
        return idnodo;
    }

    public void setIdnodo(Integer idnodo) {
        this.idnodo = idnodo;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
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

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Nodo{" + "nombre=" + nombre + ", idnodo=" + idnodo + ", antecesor=" + antecesor + ", pesoAcumulado=" + pesoAcumulado + ", vecinos=" + vecinos + ", visitado=" + visitado + '}';
    }

    public Nodo(String nombre) {
        this.nombre = nombre;
    }

    public boolean isVisitado() {
        return visitado;
    }

    public void agregarVecino(Proximos vecino) {
        vecinos.add(vecino);
    }

    public List<Proximos> getVecinos() {
        return vecinos;
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

}
