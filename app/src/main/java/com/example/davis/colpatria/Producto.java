package com.example.davis.colpatria;

public class Producto {

    public String nombre;
    public String url;
    public String puntos;
    public String descripcion;

    public Producto(String nombre, String url, String puntos, String descripcion) {
        this.nombre = nombre;
        this.url = url;
        this.puntos = puntos;
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPuntos() {
        return puntos;
    }

    public void setPuntos(String puntos) {
        this.puntos = puntos;
    }
}
