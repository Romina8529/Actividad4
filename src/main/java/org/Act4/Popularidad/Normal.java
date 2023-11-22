package org.Act4.Popularidad;

import org.Act4.Icono.Icono;

import java.util.Scanner;

public class Normal implements PopularidadEstado {
    Icono notaMusical = Icono.MUSICAL_NOTE;


    public Icono getNotaMusical() {
        System.out.println("Nuevo Lanzamiento");
        return notaMusical;
    }
       Scanner leer= new Scanner(System.in).useDelimiter("\n");
    public void leyenda(String nombreArtista, String nombreAlbum, String tituloCancion) {
        System.out.println(nombreArtista);
        System.out.println(nombreAlbum);
        System.out.println(tituloCancion);

        int reproducciones=0,canc=1000;
        System.out.println("cantidad de reproducione ");
        reproducciones= leer.nextInt();
        if ( reproducciones>=canc){
            System.out.println("Pasamos Auge");

        }else{
            System.out.println("Vamos por la meta ");
        }
    }
}