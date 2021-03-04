import UserInterface.*;

import java.util.Scanner;

import static UserInterface.Ui.*;

public class Main {

    public static void main(String[] args){

        // Objetos

        Admin admin = new Admin("Juan", "jan@.com");
        admin.setPassAdmin(26132);

        Milk milk  = new Milk("Leche de 1 Ltr", 12.50, true, 25);



    int op = welcome();


    switch (op){
        case 1:
           int elec = action();
            switch (elec){

                case 1:
                    System.out.println("Hola");
                break;
                case 2:
                    System.out.println("Hola2");
                break;
                case 3:
                  int pass =  adminMain();
                  if(pass == admin.getPassAdmin()){

                      int mod = modifyArt();
                      switch(mod){
                          case 1:
                              int ele = operations();
                            if(ele == 1){
                                Scanner date = new Scanner(System.in);
                                System.out.println("Acutualmente  exiten " + milk.getCant() + " piezzas");
                                System.out.println("Digita la cantidad a ingresar");
                                int dat = date.nextInt();
                                int total = milk.ingresoMerc(dat);
                                System.out.println("La cantidad actual es de " + total + " Piezas");
                            }
                              break;
                      }

                  }else{
                      System.out.println("Sin permisos");
                      welcome();
                  }
            }
        break;
        case 2:
            System.out.println("Bye");
        break;
        default:
            System.out.println("Ingresa un valor correcto");
        break;
    }

    }

    }

