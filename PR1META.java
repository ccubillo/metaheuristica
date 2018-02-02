/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr1meta;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import pr1meta.CargarDatos;

/**
 *
 * @author carol
 */
public class PR1META {

    public static void main(String[] args) throws FileNotFoundException {
        CargarDatos carga = new CargarDatos();
        MostrarDatos mostrar = new MostrarDatos();
        AlgGreedy greedy = new AlgGreedy();
        AlgBL bl= new AlgBL();
        Utils util = new Utils();
        ArrayList<ArrayList<Integer>> matrizCTR;
        ArrayList<ArrayList<Integer>> matrizDOM;
        ArrayList<Integer> vectorVAR;
        ArrayList<Integer> solucion;
        matrizCTR = carga.cargarCTR("src/archivos/graph05/ctr.txt");
        matrizDOM = carga.cargarDOM("src/archivos/graph05/dom.txt");
        vectorVAR = carga.cargarVAR("src/archivos/graph05/var.txt");

        solucion = greedy.greedy(matrizDOM, vectorVAR,matrizCTR);
        mostrar.MostrarSolucion(solucion);
        System.out.println(util.calcularCoste(solucion, matrizCTR));
        solucion = bl.busquedaLocal(matrizCTR, matrizDOM, vectorVAR, solucion);
        mostrar.MostrarSolucion(solucion);
        System.out.println(util.calcularCoste(solucion, matrizCTR));
        //leerArrayList(solucion);
        //leerArrayListMatriz(matrizCTR);
        //int coste=calcularCoste(solucion,matrizCTR);
        //leerArrayList(generarVecino(matrizDOM, vectorVAR, solucion));
        //leerSolucion(solucion);
        //leerSolucion(generarVecino(matrizDOM, vectorVAR, solucion));

    }
}
