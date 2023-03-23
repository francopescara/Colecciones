/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejcolecciones.pkg3.newpackage;

import java.util.ArrayList;

/**
 *
 * @author franco
 */
public class Alumnos {
    private String nombres;
    private ArrayList<Integer> notas;
    
    public Alumnos() {
        this.notas=new ArrayList<>();
    }

    public Alumnos(String nombres, ArrayList<Integer> notas) {
        this.nombres = nombres;
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Alumnos{" + "nombres=" + nombres + ", notas=" + notas + '}';
    }

    

    

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }
    
}
