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
public class AlgGreedy {

    public AlgGreedy() {

    }
    //CAMBIAR MATH.RANDOM por Random
    public ArrayList<Integer> greedy(ArrayList<ArrayList<Integer>> dom, ArrayList<Integer> var, ArrayList<ArrayList<Integer>> ctr) {
        ArrayList<Integer> solucion = new ArrayList<>();
        // la primera frecuencia se escoge al azar
        int pos = (int) (Math.random() * dom.get(var.get(0)).size());
        solucion.add(dom.get(var.get(0)).get(pos));
        int coste = 0, costeMin = 99, valor_coste = 0, tri = 0, trj = 0, diferencia_frec = 0, frec_elegida = 0, frec_insertar = 0;
        for (int i = 1; i < var.size(); ++i) { //bucle para recorrer solucion e ir añadiendo
            for (int k = 0; k < dom.get(var.get(i)).size(); ++k) { // bucle para recorrer frecuencias de cada transistor
                frec_elegida = dom.get(var.get(i)).get(k);
                frec_insertar = frec_elegida;
                for (int j = 0; j < ctr.size(); ++j) { // bucle para recorrer ctr y comprobar el coste
                    tri = solucion.get(i - 1);
                    trj = frec_elegida;
                    if (tri == i - 1 && trj == i) {
                        diferencia_frec = ctr.get(j).get(2);
                        valor_coste = ctr.get(j).get(3);
                        if (Math.abs(tri - trj) > diferencia_frec) {
                            coste = valor_coste;
                        }
                        if (coste <= costeMin) { //si el coste es menor que el mínimo, entonces se elige la frecuencia
                            costeMin = coste;
                            frec_insertar = frec_elegida;
                        }
                    }
                }
            }
            solucion.add(frec_insertar);
        }

        return solucion;
    }

}
