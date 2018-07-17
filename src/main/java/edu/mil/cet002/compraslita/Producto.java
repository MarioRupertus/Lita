package edu.mil.cet002.compraslita;

public class Producto {

    private String nombre;
    private double precio;
    private Comercio comercio;
    private Integer idproducto;

    public Producto() {
    }

    public Producto(String nombre, double precio, Comercio comercio) {
        this.nombre = nombre;
        this.precio = precio;
        this.comercio = comercio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setComercio(Comercio comercio) {
        this.comercio = comercio;
    }

    public Integer getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(Integer idproducto) {
        this.idproducto = idproducto;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public Comercio getComercio() {
        return comercio;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", precio=" + precio + ", comercio=" + comercio + '}';
    }

}
