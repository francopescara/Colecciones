/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage1;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;
import newpackage.Paises;

/**
 *
 * @author franco
 */
public class servicioPaises {

    Scanner leer = new Scanner(System.in);
    TreeSet<Paises> pais = new TreeSet();

    public void crearPaises() {
        servicioPaises r = new servicioPaises();
        String resp;
        do {
            Paises p = new Paises();
            System.out.println("ingrese pais");
            p.setPais(leer.next());
            pais.add(p);

            System.out.println("quiere crear otro pais,SI o NO o quiere salir");
            resp = leer.next();

        } while (resp.equals("si"));
        for (Paises pai : pais) {
            System.out.println(pai);
        }
    }

    /*Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.*/
    public void buscarPais() {

        Iterator<Paises> it = pais.iterator();
        System.out.println("ingrese un pais a buscar");
        String buscar = leer.next();
        int cont=0;
        while (it.hasNext()) {
            Paises aux = it.next();
            
            if (aux.getPais().equals(buscar)) {
                it.remove();
               cont++;
            }
            if (cont==1) {
                System.out.println("su pais a sido eliminado");
            } else {
                System.out.println("no pais no se encuentra");
            }
        }

        for (Paises pai : pais) {
            System.out.println(pai);

        }
    }
}
