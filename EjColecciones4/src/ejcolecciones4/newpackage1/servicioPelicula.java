/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejcolecciones4.newpackage1;

import ejcolecciones4.newpackage.Pelicula;
import ejcolecciones4.newpackage2.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author franco
 */
public class servicioPelicula {

    Scanner leer = new Scanner(System.in);
    ArrayList<Pelicula> peli = new ArrayList<>();

    public void crearPelicula() {
        servicioPelicula r = new servicioPelicula();
        String resp;
        
        do {
            Pelicula p = new Pelicula();
            System.out.println("ingrese el titulo de la pelicula");
            p.setTitulo(leer.next());
            System.out.println("ingrese el director de la pelicula");
            p.setDirector(leer.next());
            System.out.println("ingrese la duracion de la pelicula");
            p.setDuracion(leer.nextInt());
            peli.add(p);

            System.out.println("quiere crear otra pelicula,Si o No");
            resp = leer.next();

        } while (resp.equals("si"));
        //for (Pelicula pelicula : peli) {
           // System.out.println(pelicula);
        //}
        
    }
    public void mostrarPeliculasDeUna1hr(){
        for (int i = 0; i < peli.size(); i++) {
            Pelicula get = peli.get(i);
            if(get.getDuracion()>60){
                System.out.println("las peliculas mayor a 1 hr son: "+get.getDuracion());
            }else{
                System.out.println("no hay pelis mayores a 1 hr");
            }
           
        }
    }
    public void mostrarPelisDuracionMayorAMernor(){
    Collections.sort(peli, Comparadores.mostrarPelisDuracion);
        for (Pelicula pelicula : peli) {
            System.out.println(pelicula);
        }
}
    public void mostrarPelisDuracionMenoraMayor(){
        Collections.sort(peli,Comparadores.mostrarPelisDuracionMenoraMayor);
        for (Pelicula pelicula : peli) {
            System.out.println(pelicula);
        }
    }
}
