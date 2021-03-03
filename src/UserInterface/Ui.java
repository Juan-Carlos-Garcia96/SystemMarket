package UserInterface;

import java.util.Scanner;

public class Ui {
    static int op;

    /**
     * Menu principal donde
     * donde op se es evaludao para continuar o terminar el progra
     * */

    public static int  welcome(){

        Scanner Welcome = new Scanner(System.in);
        System.out.println("Bienvenido a Iventory System ");
        System.out.println();
        System.out.println("Te recomendamos seguir las indicaciones ingresando los numeros en las opciones ");
        System.out.println("Presiona 1 para continuar o 2 para salir ");
        op = Welcome.nextInt();

        return op;
    }

    public  static void action(){
        Scanner elec = new Scanner(System.in);
        System.out.println("Ingresa que deseas hacer  ");
        System.out.println();
        System.out.println("1 Ingresar mercancia  ");
        System.out.println("2 Descontar mercancia");
        op = elec.nextInt();
    }

    }



