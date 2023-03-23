/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejcolecciones.pkg1.newpackage1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author franco
 */
public class servicioRaza {

    Scanner leer = new Scanner(System.in);
    private final ArrayList<String> raza;

    public servicioRaza() {
        this.raza = new ArrayList();
    }

    public void creaRazas(int cantidad) {

        for (int i = 0; i < cantidad; i++) {
            System.out.println("ingrese la raza de perro");
            String razas = leer.next();
            raza.add(razas);
            System.out.println("quiere crear otro perro, si o no");
            String resp = leer.next();

            if (resp.equals("si")) {
                
            } else {
                break;
            }

        }

    }

    public void mostarRazas() {
        for (String aux : raza) {
            System.out.println(aux);
        }
    }

    public void buscarPerro() {
        System.out.println("ingrese nombre de perro a buscar");
        String perro =leer.next();
        Iterator<String> it=raza.iterator();
        while (it.hasNext()) {
            String aux = it.next();
            if(aux.equals(perro)){
                it.remove();
            }
        }
    }
}
