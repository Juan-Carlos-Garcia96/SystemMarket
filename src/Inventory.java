public class Inventory {

    private static int id;
    String description;
    double price;
    boolean exit;
    private int cant;

    Inventory(String description, double price, boolean exit, int cant){
        this.description = description;
        this.price = price;
        this.exit = exit;
        this.cant = cant;
    }

    public int  ingresoMerc(int  ingreso){
        int cantIn = cant + ingreso;
        System.out.println("La cantidad acttual es: " + cantIn);
        return cantIn;
    }

    public int desconMerca(int salida){
       int  cantSa = salida - cant;
        System.out.println("La cantidad actual es; " +  cantSa);
        return cantSa;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }
}
