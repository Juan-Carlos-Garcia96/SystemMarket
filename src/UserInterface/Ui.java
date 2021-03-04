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

    public  static int  action(){
        Scanner elec = new Scanner(System.in);
        System.out.println("Ingresa que deseas hacer  ");
        System.out.println();
        System.out.println("1 Ingresar mercancia  ");
        System.out.println("2 Descontar mercancia");
        System.out.println("3 Ingresar como administrador ");
        int election = elec.nextInt();
        return election;

    }


    public static int  adminMain() {
        Scanner pass = new Scanner(System.in);
        System.out.println("Bienvenido al administrador");
        System.out.println("Ingresa tu contraseña ");
        int Pass = pass.nextInt();
        return Pass;
    }

    public static int  modifyArt() {
        Scanner modif = new Scanner(System.in);
        System.out.println("1  Deseas modificar la canridad");
        System.out.println("2 Deseas modificar el precio");
        int modify = modif.nextInt();
        return  modify;



    }

    }



