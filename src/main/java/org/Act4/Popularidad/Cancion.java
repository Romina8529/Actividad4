package org.Act4.Popularidad;

public class Cancion {
    private String nombreArtista, nombreAlbum, tituloCancion;
    private int anoAlbum;
    private double reproducciones = 0, like = 0, dislikes = 0;

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




}

