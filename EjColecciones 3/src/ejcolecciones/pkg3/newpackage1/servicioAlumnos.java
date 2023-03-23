/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejcolecciones.pkg3.newpackage1;

import ejcolecciones.pkg3.newpackage.Alumnos;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author franco
 */
public class servicioAlumnos {

    Scanner leer = new Scanner(System.in);
    ArrayList<Alumnos> alum = new ArrayList<>();

    public void crearAlumnos() {
        String resp;
        do {

            Alumnos r = new Alumnos();
            System.out.println("ingrese nombre del alumno");
            r.setNombres(leer.next());

            for (int i = 0; i < 3; i++) {
                System.out.println("ingrese notas");
                int nota = leer.nextInt();
                r.getNotas().add(nota);

            }
            //for (Integer aux : r.getNotas()) {
//                System.out.println(aux);
            //}
            alum.add(r);
            for (Alumnos aux : alum) {
                System.out.println(aux);
            }

            System.out.println("quiere crear otro alumno,SI o NO");
            resp = leer.next();

        } while (resp.equals("si"));

    }

    /*Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main*/
    public void metodoFinal() {
        System.out.println("ingrese el nombre del alumno");
        String nombre = leer.next();

        for (int i = 0; i < alum.size(); i++) {
            Alumnos get = alum.get(i);
            if (get.getNombres().equalsIgnoreCase(nombre)) {
                System.out.println("el nombre se encuentra en la lista");

                //for (int j = 0; j < alum.size(); j++) {
                   // Alumnos get1 = alum.get(j);
                   int suma = 0;
                    for (int k = 0; k < get.getNotas().size(); k++) {
                         
                        suma +=get.getNotas().get(k);
                    }
                    System.out.println("la suma de las notas es: "+suma);
                    System.out.println("el promedio final es: "+suma/3);
                //}
                
            }
        }
        
    }
}
