/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejcolecciones4.newpackage2;

import ejcolecciones4.newpackage.Pelicula;
import java.util.Comparator;

/**
 *
 * @author franco
 */
public class Comparadores {
    public static Comparator<Pelicula> mostrarPelisDuracion=(Pelicula t, Pelicula t1) -> t1.getDuracion().compareTo(t.getDuracion());
        public static Comparator<Pelicula> mostrarPelisDuracionMenoraMayor=(Pelicula t, Pelicula t1) -> t.getDuracion().compareTo(t1.getDuracion());

}
