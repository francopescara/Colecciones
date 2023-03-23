/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import newpackage.tienda;

/**
 *
 * @author franco
 */
public class servicioTienda {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashMap<String, tienda> tienda = new HashMap();

    public tienda menuTienda() {
        tienda r = new tienda();
        Boolean salir = false;
        while (!salir) {
            System.out.println("-----------MENU------------");
            System.out.println("1: ingresar un producto");
            System.out.println("2: Modificar un precio");
            System.out.println("3: Eliminar un producto");
            System.out.println("4: Mostrar producto con su precio");
            System.out.println("5; Salir");
            System.out.println("-----------------------------------");
            System.out.println("ingrese una opcion");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    ingresarProducto(r);
                    System.out.println("Su producto fue ingresado");
                    break;
                case 2:
                    modificarPrecio(r);
                    System.out.println("su producto fue actualizado");
                    break;
                case 3:
                    eliminarProducto(r);
                    System.out.println("su producto fue eliminado");
                    break;
                case 4:

                    MostrarPrecios(r);
                    break;
                case 5:
                    salir = true;
                    break;
            }
        }
        return r;
    }

    public void ingresarProducto(tienda r) {
        System.out.println("ingrese numero de llave");
        String llave=leer.next();
        System.out.println("ingrese el nombre del producto a ingresar");
        String nombre = leer.next();
        r.setProducto(nombre);
        System.out.println("ingrese el precio del producto");
        int precio = leer.nextInt();
        r.setPrecio(precio);

        //tienda.put("1", new tienda(r.getProducto(), r.getPrecio()));
        tienda.put(llave, r);
    }

    public void modificarPrecio(tienda r) {
        System.out.println("ingrese la llave del producto");
        String nombre = leer.next();
        if (tienda.containsKey(nombre)) {
            System.out.println("ingrese el precio del producto a modificar");
            int precio = leer.nextInt();
            r.setPrecio(precio);
            tienda.put("1", new tienda(nombre, precio));
            System.out.println(tienda);

        }

    }

    public void MostrarPrecios(tienda r) {
        for (Map.Entry<String, tienda> aux : tienda.entrySet()) {
            String key = aux.getKey();
            tienda value = aux.getValue();
            System.out.println("el numero de la llave es: " + key + " $ " + " / " + "el nombre del producto es: " + value);
           // System.out.println(tienda);
        }

    }

    public void eliminarProducto(tienda r) {
        System.out.println("ingrese la llave del producto a eliminar");
        String llave = leer.next();
        if (tienda.containsKey(llave)) {
            tienda.remove(llave);
        }else{
            System.out.println("su llave no se encuentra");
        }
    }
}
