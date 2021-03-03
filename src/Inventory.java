public class Inventory {

    private static int id;
    String description;
    double price;
    boolean exit;

    Inventory(String description, double price, boolean exit){
        this.description = description;
        this.price = price;
        this.exit = exit;
    }
}
