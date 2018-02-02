/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr1meta;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author carol
 */
public class Menu {

    public enum Algoritmo {
        GT, BL, BT, GRASP //Añadir los que faltan
    }

    String ctr, dom, var;
    Algoritmo algoritmo;
    
    public Menu() {

    }

    public void mainMenu() {
        while (true) {
            int option;
            System.out.println("MENU PRINCIPAL");
            System.out.print("\n");
            System.out.println("1.  Seleccion del archivo ");
            System.out.println("2.  Seleccion del algoritmo ");
            System.out.println("3.  Seleccion del numero de iteraciones ");
            System.out.println("4.  Resolver el problema");
            System.out.println("5.  Resetear el RNG");
            System.out.print("\n");
            System.out.print("Introduzca un numero (-1 para salir): ");
            option = getEntradaDatos();

            try {
                limpiarConsola();
            } catch (InterruptedException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }

            switch (option) {
                case 1:
                    seleccionarArchivo();
                    break;
                case 2:
                    seleccionAlgoritmo();
                    break;
                case 3:
                    resolucionProblema();
                    break;
                default:
                    System.exit(0);
            }
        }
    }

    public void seleccionarArchivo() {
        int opcion;
        System.out.println("SELECCION DE ARCHIVO");
        System.out.print("\n");
        System.out.println("1.  graph05");
        System.out.println("2.  graph06");
        System.out.println("3.  graph07");
        System.out.println("4.  graph11");
        System.out.println("5.  graph12");
        System.out.println("6.  graph13");
        System.out.println("7.  scen06");
        System.out.println("8.  scen07");
        System.out.println("9.  scen08");
        System.out.println("10. scen09");
        System.out.println("11. scen10");
        System.out.print("\n");
        System.out.print("Introduzca un numero (-1 para cancelar): ");
        opcion = getEntradaDatos();
        switch (opcion) {
            case 1:
                ctr = "archivos/graph05/ctr.txt";
                dom = "archivos/graph05/dom.txt";
                var = "archivos/graph05/var.txt";
                break;
            case 2:
                ctr = "archivos/graph06/ctr.txt";
                dom = "archivos/graph06/dom.txt";
                var = "archivos/graph06/var.txt";
                break;
            case 3:
                ctr = "archivos/graph07/ctr.txt";
                dom = "archivos/graph07/dom.txt";
                var = "archivos/graph07/var.txt";
                break;
            case 4:
                ctr = "archivos/graph11/ctr.txt";
                dom = "archivos/graph11/dom.txt";
                var = "archivos/graph11/var.txt";
                break;
            case 5:
                ctr = "archivos/graph12/ctr.txt";
                dom = "archivos/graph12/dom.txt";
                var = "archivos/graph12/var.txt";
                break;
            case 6:
                ctr = "archivos/graph13/ctr.txt";
                dom = "archivos/graph13/dom.txt";
                var = "archivos/graph13/var.txt";
                break;
            case 7:
                ctr = "archivos/scen06/ctr.txt";
                dom = "archivos/scen06/dom.txt";
                var = "archivos/scen06/var.txt";
                break;
            case 8:
                ctr = "archivos/scen07/ctr.txt";
                dom = "archivos/scen07/dom.txt";
                var = "archivos/scen07/var.txt";
                break;
            case 9:
                ctr = "archivos/scen08/ctr.txt";
                dom = "archivos/scen08/dom.txt";
                var = "archivos/scen08/var.txt";
                break;
            case 10:
                ctr = "archivos/scen09/ctr.txt";
                dom = "archivos/scen09/dom.txt";
                var = "archivos/scen09/var.txt";
                break;
            case 11:
                ctr = "archivos/scen10/ctr.txt";
                dom = "archivos/scen10/dom.txt";
                var = "archivos/scen10/var.txt";
                break;
            default:
                return;
        }
    }

    public void seleccionAlgoritmo() {
        int opcion;
        System.out.println("SELECCION DE ALGORITMO");
        System.out.print("\n");
        System.out.println("1.  GT");
        System.out.println("2.  BL");
        System.out.println("3.  BT");
        System.out.println("4.  GRASP");
        /*System.out.println("5.  AGG");
        System.out.println("5.  AGE");
        System.out.print("\n");*/
        System.out.print("Introduzca un numero (-1 para cancelar): ");
        opcion = getEntradaDatos();

        try {
            limpiarConsola();
        } catch (InterruptedException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }

        switch (opcion) {
            case 1:
                algoritmo = Algoritmo.GT;
                break;
            case 2:
                algoritmo = Algoritmo.BL;
                break;
            case 3:
                algoritmo = Algoritmo.BT;
                break;
            case 4:
                algoritmo = Algoritmo.GRASP;
                break;
            /*case 5:
                algorithm = Algorithm.AGG;
                break;
            case 6:
                algorithm = Algorithm.AGE;
                break;*/
            default:
                return;
        }
    }
    public static void limpiarConsola() throws InterruptedException {
        for (int i = 0; i < 80; i++) {
            System.out.print("\n");
        }
    }

    public static int getEntradaDatos() {
        Scanner reader = new Scanner(System.in);
        if (reader.hasNextInt()) {
            return reader.nextInt();
        }
        return -1;
    }

    
}
