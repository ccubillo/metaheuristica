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
public class Utils {

    public Utils() {

    }

    public int calcularCoste(ArrayList<Integer> solucion, ArrayList<ArrayList<Integer>> matrizCTR) {
        int coste = 0;
        int valor_coste = 0;
        int tri = 0, trj = 0;
        int diferencia_frec = 0;
        for (int i = 0; i < matrizCTR.size(); ++i) {
            tri = solucion.get(matrizCTR.get(i).get(0) - 1);
            trj = solucion.get(matrizCTR.get(i).get(1) - 1);
            diferencia_frec = matrizCTR.get(i).get(2);
            valor_coste = matrizCTR.get(i).get(3);
            if (Math.abs(tri - trj) > diferencia_frec) {
                coste += valor_coste;
                // System.out.println("El coste se incrementa "+valor_coste+" total es "+coste);
//                }
            }
            // System.out.println( tri+ " - "+trj+ " > "+diferencia_frec +" suma al coste "+valor_coste);
//            if(Math.abs(tri-trj)>diferencia_frec){
//                    coste +=valor_coste;
//                   // System.out.println("El coste se incrementa "+valor_coste+" total es "+coste);
//                }
        }
        return coste;
    }
}
