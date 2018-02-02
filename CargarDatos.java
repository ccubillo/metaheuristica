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

/**
 *
 * @author carol
 */
public class CargarDatos {
    ArrayList<Integer> var;
    ArrayList<ArrayList<Integer>> dom;
    ArrayList<ArrayList<Integer>> ctr;
    
    public CargarDatos(){
        
    }
    /**
     * Introduce los datos del fichero en el vectorVAR
     *
     * @param fichero
     * @exception FileNotFoundException
     * @return vector
     */
    public ArrayList<Integer> cargarVAR(String fichero) throws FileNotFoundException {
        Scanner leer = new Scanner(new FileReader(fichero));
        var = new ArrayList<>();
        int elem;
        do {
            leer.nextInt();
            elem = leer.nextInt();
            leer.nextLine();
            //System.out.println(elem);
            var.add(elem);
        } while (leer.hasNext());
        return var;
    }
    
    /**
     * Introduce los datos del fichero dom.txt en la matrizDOM
     *
     * @param fichero
     * @exception FileNotFoundException
     * @return matriz
     */
    public ArrayList<ArrayList<Integer>> cargarDOM(String fichero) throws FileNotFoundException {
        Scanner leer = new Scanner(new FileReader(fichero));
        dom = new ArrayList<>();
        ArrayList<Integer> listadoFrec;
        Integer num;
        String lineaActual;
        do {
            leer.nextInt();
            lineaActual = leer.nextLine();
            Scanner leerLinea = new Scanner(lineaActual);
            listadoFrec = new ArrayList<>();
            do {
                num = leerLinea.nextInt();
                listadoFrec.add(num);
            } while (leerLinea.hasNext());
            dom.add(listadoFrec);
        } while (leer.hasNext());
        return dom;
    }

    /**
     * Introduce los datos del fichero ctr.txt en la matrizCTR
     *
     * @param fichero
     * @exception FileNotFoundException
     * @return matriz
     */
    public ArrayList<ArrayList<Integer>> cargarCTR(String fichero) throws FileNotFoundException {
        //Conversion a string
        Scanner leer;
        leer = new Scanner(new FileReader(fichero));
        ArrayList<String> ctrString;
        ctrString = new ArrayList<>();
        do {
            String elem = leer.next();
            ctrString.add(elem);
        } while (leer.hasNext());
        
        //Carga de datos en ctr
        ArrayList<Integer> fila;
        ctr = new ArrayList<>();
        int num;
        for (int i = 0; i < ctrString.size(); i += 6) {
            fila = new ArrayList<>();
            if (!ctrString.get(i + 2).equals("D")) {
                num = Integer.parseInt(ctrString.get(i));
                fila.add(num);
                num = Integer.parseInt(ctrString.get(i + 1));
                fila.add(num);
                num = Integer.parseInt(ctrString.get(i + 4));
                fila.add(num);
                num = Integer.parseInt(ctrString.get(i + 5));
                fila.add(num);
                ctr.add(fila);
            }
        }

        return ctr;
    }
}
