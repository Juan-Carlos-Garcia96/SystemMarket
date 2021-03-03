import static UserInterface.Ui.action;
import static  UserInterface.Ui.welcome;
public class Main {

    public static void main(String[] args){
    int elec;

    int op = welcome();

    if (op == 1){
        action();

    }else if( op == 2){
            System.out.println("Bye");
        }else {
        System.out.println("Ingresa un valor correcto");
    }


    }
}
