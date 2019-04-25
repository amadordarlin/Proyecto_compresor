package com.company;

import java.util.Scanner;
public class Menu {
        LectorTeclado lt = new LectorTeclado(System.in);              
    public int menu() {

        System.out.println("");
        System.out.println("Bienvenido al compresor/descompresor de archivos");
        System.out.println("========================MENU==========================");
        System.out.println("1. comprimir un texto ");
        System.out.println("2. Descomprimir un texto de un archivo ");
        System.out.println("3. Salir");
System.out.println("=======================================================");
  int op=lt.leerEnteroValidado("Ingrese una opción válida","La opción ingresada no es válida, intente de nuevo",1,4);
        return op;

    }

}
