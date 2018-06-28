/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mil.cet002.compraslita;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 *
 * @author User
 */
public class Comercio {

    private List<Producto> listaDeProductos;
    private Nodo ubicacion;
    private String duenio;
    private Date horario;
    private int horarioApertura;
    private int horarioCierre;
    private int calificacionPositiva;
    private int calificacionNegativa;
    private Integer idcomercio;
    private String nombre;
    
    public Comercio(){}

    //CONSTRUCTORES
    public Comercio(int horarioApertura, int horarioCierre) {
        this.horarioApertura = horarioApertura;
        this.horarioCierre = horarioCierre;
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
    public void sumarVotoPositivo(){
        calificacionPositiva ++;
    }
    public void sumarVotoNegativo(){
        calificacionNegativa ++;
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

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

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
}
