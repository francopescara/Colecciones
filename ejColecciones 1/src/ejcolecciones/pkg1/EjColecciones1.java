/*
 *Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
 */
package ejcolecciones.pkg1;

import ejcolecciones.pkg1.newpackage1.servicioRaza;

/**
 *
 * @author franco
 */
public class EjColecciones1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       servicioRaza r=new servicioRaza();
       r.creaRazas();
       r.mostarRazas();
       r.buscarPerro();
       r.mostarRazas();
    }
    
}
