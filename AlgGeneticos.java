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
public class AlgGeneticos {

    public AlgGeneticos() {

    }

    public ArrayList<Integer> generarVecino(ArrayList<ArrayList<Integer>> matrizDOM, ArrayList<Integer> vectorVAR, ArrayList<Integer> solucion, Integer tr_elegido) {
        int frec = solucion.get(tr_elegido);
        int rango_frec = vectorVAR.get(tr_elegido);
        //      System.out.println("tr_elegido:  "+tr_elegido);
//         System.out.println("pos matrizDOM -> rango_frec:  "+rango_frec);
        for (int i = 0; i < matrizDOM.get(rango_frec).size(); ++i) {
            if (matrizDOM.get(rango_frec).get(i) == frec) {
                if (i == 0) {//Si la posicion es = 0 solo podra coger la frecuencia de la der
                    solucion.set(tr_elegido, matrizDOM.get(rango_frec).get(i + 1));
                } else if (i == matrizDOM.get(rango_frec).size() - 1) {//Si es la ultima posicion solo podra coger la frecuencia de la izq
                    solucion.set(tr_elegido, matrizDOM.get(rango_frec).get(i - 1));
                } else {
                    if ((int) (Math.random() * 2) == 0) {
                        solucion.set(tr_elegido, matrizDOM.get(rango_frec).get(i - 1));
                    } else {
                        solucion.set(tr_elegido, matrizDOM.get(rango_frec).get(i + 1));
                    }
                }
            }
        }
        return solucion;
    }

    public int controladorEntorno(Integer entero, ArrayList<Integer> solucion/*meter rangofrec para el tamaño*/) {
        if (entero == Integer.MAX_VALUE) {
            //System.out.println("random");
            entero = (int) (Math.random() * solucion.size()/*tamaño rangfrec*/);
            // System.out.println("tam "+solucion.size());
            // System.out.println(entero);
        } else {
            entero = entero + 1;
            if (entero >= solucion.size()/*tamaño rangfrec*/) {
                entero = 0;
            }
            // System.out.println(entero);
        }
        return entero;
    }

}
