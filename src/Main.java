import UserInterface.*;

import static UserInterface.Ui.*;

public class Main {

    public static void main(String[] args){

        // Objetos

        Admin admin = new Admin("Juan", "jan@.com");
        admin.setPassAdmin(26132);



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
                      System.out.println("eres admin");
                  }else{
                      System.out.println("Sin permisos");
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

