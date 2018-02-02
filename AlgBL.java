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
public class AlgBL {

    public AlgBL() {

    }

    public ArrayList<Integer> busquedaLocal(ArrayList<ArrayList<Integer>> matrizCTR, ArrayList<ArrayList<Integer>> matrizDOM, ArrayList<Integer> vectorVAR, ArrayList<Integer> sol_actual) {
        ArrayList<Integer> solucion = new ArrayList<>(), /*sol_actual = new ArrayList<>(),*/ sol_anterior = new ArrayList<>();
        //sol_actual=greedy(matrizDOM, vectorVAR);
        Utils util = new Utils();
        AlgGeneticos genetico = new AlgGeneticos();
        Integer costeSolucion = 0, costeSol_actual = util.calcularCoste(sol_actual, matrizCTR), costeSol_anterior = 0;
        Integer tr_elegido = Integer.MAX_VALUE;
        Integer cont, cont2 = 0;
        
        do {

            cont = 0;
            do {
                tr_elegido = genetico.controladorEntorno(tr_elegido, sol_actual);
                solucion = genetico.generarVecino(matrizDOM, vectorVAR, sol_actual, tr_elegido);
                cont++;
                costeSolucion = util.calcularCoste(solucion, matrizCTR);
            } while (costeSolucion > costeSol_actual && cont < solucion.size());

            sol_anterior = sol_actual;
            costeSol_anterior = costeSol_actual;
            if (costeSolucion < costeSol_actual) {
                sol_actual = solucion;
                costeSol_actual = costeSolucion;
            }
            cont2++;
        } while (costeSolucion >= costeSol_anterior && cont2 < 200);
        return sol_actual;
    }
}
