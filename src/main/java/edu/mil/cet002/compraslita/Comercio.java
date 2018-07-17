package edu.mil.cet002.compraslita;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class Comercio {

    private List<Producto> listaDeProductos;
    private Nodo ubicacion;
    private String duenio;
    // Atributo Date reemplazado por int Apertura e Int Cierre 
    // private Date horario;
    private int horarioApertura;
    private int horarioCierre;
    private int calificacionPositiva;
    private int calificacionNegativa;
    private Integer idcomercio;
    private String nombre;

    //CONSTRUCTORES
    public Comercio() {
    }

    public Comercio(int horarioApertura, int horarioCierre) {
        this.horarioApertura = horarioApertura;
        this.horarioCierre = horarioCierre;
    }

    // GETTER Y SETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorarioApertura() {
        return horarioApertura;
    }

    public void setHorarioApertura(int horarioApertura) {
        this.horarioApertura = horarioApertura;
    }

    public int getHorarioCierre() {
        return horarioCierre;
    }

    public void setHorarioCierre(int horarioCierre) {
        this.horarioCierre = horarioCierre;
    }

    public Integer getIdcomercio() {
        return idcomercio;
    }

    public void setIdcomercio(Integer idcomercio) {
        this.idcomercio = idcomercio;
    }

    public List<Producto> getListaDeProductos() {
        return listaDeProductos;
    }

    public void setListaDeProductos(List<Producto> listaDeProductos) {
        this.listaDeProductos = listaDeProductos;
    }

    public Nodo getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Nodo ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getDuenio() {
        return duenio;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }

    /* public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }*/
    public int getCalificacionPositiva() {
        return calificacionPositiva;
    }

    public void setCalificacionPositiva(int calificacionPositiva) {
        this.calificacionPositiva = calificacionPositiva;
    }

    public int getCalificacionNegativa() {
        return calificacionNegativa;
    }

    public void setCalificacionNegativa(int calificacionNegativa) {
        this.calificacionNegativa = calificacionNegativa;
    }

    // OTROS METODOS
    public void saberSiEstaAbierto(int horaApertura, int horaCierre) {
        Calendar fecha = new GregorianCalendar();
        int horaActual = fecha.get(Calendar.HOUR_OF_DAY);

        if ((horaActual) >= (horaApertura) && (horaActual) <= (horaCierre)) {
            System.out.println("Abierto");
        } else {
            System.out.println("Cerrado");
        }
    }

    public void sumarVotoPositivo() {
        calificacionPositiva++;
    }

    public void sumarVotoNegativo() {
        calificacionNegativa++;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        Comercio otro = (Comercio) obj;
        return this.idcomercio == otro.idcomercio;
    }
}
