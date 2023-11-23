package org.Act4.Popularidad;

import java.util.HashMap;

public class Cancion {
    private String nombreArtista, nombreAlbum, tituloCancion;
    private int anoAlbum;
    private double reproducciones = 1000, like = 0, dislikes = 5000;

    public String getNombreArtista() {
        return nombreArtista;
    }

    public String getNombreAlbum() {
        return nombreAlbum;
    }

    public String getTituloCancion() {
        return tituloCancion;
    }

    public int getAnoAlbum() {
        return anoAlbum;
    }

    public double getReproducciones() {
        return reproducciones;
    }

    public double getLike() {
        return like;
    }

    public double getDislikes() {
        return dislikes;
    }

    public Cancion() {
        super();
    }

    public void setNombreArtista(String nombreArtista) {
        this.nombreArtista = nombreArtista;
    }

    public void setNombreAlbum(String nombreAlbum) {
        this.nombreAlbum = nombreAlbum;
    }

    public void setTituloCancion(String tituloCancion) {
        this.tituloCancion = tituloCancion;
    }

    public void setAnoAlbum(int anoAlbum) {
        this.anoAlbum = anoAlbum;
    }

    public void setReproducciones(double reproducciones) {
        this.reproducciones = reproducciones;
    }

    public void setLike(double like) {
        this.like = like;
    }

    public void setDislikes(double dislikes) {
        this.dislikes = dislikes;
    }

}

