package com.escom.ipn.modelo;

import java.io.Serializable;

public class Articulo implements Serializable {

    private int idArticulo;
    private String nombre;
    private double precio;
    private int existencia;
    private int categoria;

    public Articulo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public int getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }

    @Override
    public String toString() {
        return "Articulo{" + "idArticulo=" + idArticulo + ", nombre=" + nombre + ", precio=" + precio + ", existencia=" + existencia + ", categoria=" + categoria + '}';
    }

}
