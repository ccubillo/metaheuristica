/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr1meta;

import java.util.ArrayList;

/**
 *
 * @author carol
 */
public class MostrarDatos {

    public MostrarDatos(){
        
    }
    
    public void mostrarV(ArrayList<Integer> vector) {
        System.out.println("Imprimo vector");
        for (int i = 0; i < vector.size(); ++i) {
            System.out.println("pos " + i + " " + vector.get(i));
        }
    }

    public void mostrarM(ArrayList<ArrayList<Integer>> ctrMatriz) {
        System.out.println("Imprimo matriz");
        for (int i = 0; i < ctrMatriz.size(); ++i) {
            for (int j = 0; j < ctrMatriz.get(i).size(); ++j) {
                System.out.print(ctrMatriz.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
    
    public void MostrarSolucion(ArrayList<Integer> solucion) {
        System.out.println("leyendo solucion");
        for (int i = 0; i < solucion.size(); ++i) {
            System.out.print(" " + solucion.get(i));
        }
        System.out.println();
    }
    
}
