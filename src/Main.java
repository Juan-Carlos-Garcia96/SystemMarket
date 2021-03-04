import static UserInterface.Ui.action;
import static  UserInterface.Ui.welcome;
public class Main {

    public static void main(String[] args){


    int op = welcome();

    if (op == 1){
        action();

    }else if( op == 2){
            System.out.println("Bye");
        }else if (op == 0){

    }



    }
}
