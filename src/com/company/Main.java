package com.company;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FueraDeRango, ListaVacia, NombreNulo, IOException, ClassNotFoundException {
       
        Scanner sc=new Scanner(System.in);
        CompresorDeTexto compresor = new CompresorDeTexto();
        Menu menu = new Menu();
        int opcion = 0;
        while (opcion != 3) {
            opcion = menu.menu();
            switch (opcion) {
                 
                case 1:
                    System.out.println("Introduzca un texto a comprimir ");
                    String texto=sc.nextLine();
                    if(texto.length()==0){
                        System.out.println("Error. No hay datos que comprimir");
                        throw new NombreNulo();
                    }
                    String[]cadenass= compresor.Comprimir(texto);
                    break;
                case 2:
                                    String path = "C:\\Users\\Mauricio\\Documents\\NetBeansProjects\\Compresor_terminado";
                    String files;
                    File folder = new File(path);
                    File[] listOfFilesS = folder.listFiles();
                    System.out.println("");
                    System.out.println("______________________________Archivos disponibles__________________________");
                    for (int i = 0; i < (listOfFilesS != null ? listOfFilesS.length : 0); i++)
                    {
                        if (listOfFilesS[i].isFile())
                        {
                            files = listOfFilesS[i].getName();
                            if (files.endsWith(".txt") || files.endsWith(".TXT"))
                            {
                                System.out.println(files);
                            }
                        }
                    }
                    System.out.println("====================================================================");
                    System.out.println(compresor.Descomprimir());

                    break;

    
                case 3:
                default:
                    System.out.println("Saliendo... Gracias por usar el compresor");
                    break;
            }



            }

        }



    }

