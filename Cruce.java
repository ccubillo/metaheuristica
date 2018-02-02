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
public class Cruce {

    public Cruce() {

    }

    //funcion cruce en 2 puntos
    public ArrayList<ArrayList<Integer>> Cruce2Puntos(ArrayList<ArrayList<Integer>> padres) {
        ArrayList<ArrayList<Integer>> hijos = new ArrayList<>();
        ArrayList<Integer> hijo1 = new ArrayList<>(), hijo2 = new ArrayList<>(), padre1 = new ArrayList<>(), padre2 = new ArrayList<>();
        int punto1 = (int) (Math.random() * (padres.get(0).size() - 1)) + 1;
        int punto2 = (int) (Math.random() * ((padres.get(0).size() - 1) - punto1 + 1) + punto1 + 1);

        int cont = 0;
        while (cont < 25) {
            padre1 = padres.get(cont);
            padre2 = padres.get(padres.get(0).size() - cont);
            for (int i = 0; i < punto1; ++i) {
                hijo1.add(padre1.get(i));
                hijo2.add(padre2.get(i));
            }
            for (int i = punto1; i < punto2; ++i) {
                hijo1.add(padre2.get(i));
                hijo2.add(padre1.get(i));
            }
            for (int i = punto2; i < padres.get(0).size(); ++i) {
                hijo1.add(padre1.get(i));
                hijo2.add(padre2.get(i));
            }
            ++cont;
            hijos.add(hijo1);
            hijos.add(hijo2);
        }

        return hijos;
    }

    //funcion cruce en 2 puntos
    public ArrayList<ArrayList<Integer>> CruceBLX(ArrayList<ArrayList<Integer>> padres) {
        ArrayList<ArrayList<Integer>> hijos = new ArrayList<>();
        ArrayList<Integer> hijo1 = new ArrayList<>(), hijo2 = new ArrayList<>(), padre1 = new ArrayList<>(), padre2 = new ArrayList<>();
        int punto1 = (int) (Math.random() * (padres.get(0).size() - 1)) + 1;
        int punto2 = (int) (Math.random() * ((padres.get(0).size() - 1) - punto1 + 1) + punto1 + 1);

        int cont = 0;

        while (cont < 25) {
            padre1 = padres.get(cont);
            padre2 = padres.get(padres.get(0).size() - cont);
            for (int i = 0; i < punto1; ++i) {
                hijo1.add(padre1.get(i));
                hijo2.add(padre2.get(i));
            }
            for (int i = punto1; i < punto2; ++i) {
                hijo1.add(padre2.get(i));
                hijo2.add(padre1.get(i));
            }
            for (int i = punto2; i < padres.get(0).size(); ++i) {
                hijo1.add(padre1.get(i));
                hijo2.add(padre2.get(i));
            }
            ++cont;
            hijos.add(hijo1);
            hijos.add(hijo2);
        }

        return hijos;
    }
}
