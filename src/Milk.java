public class Milk extends Inventory{

    Milk(String description, double price, boolean exit, int cant) {

        super(description, price, exit, cant);
    }

    @Override
    public int ingresoMerc(int ingreso) {
        return super.ingresoMerc(ingreso);
    }

    @Override
    public int desconMerca(int salida) {
        return super.desconMerca(salida);
    }

    @Override
    public void setCant(int cant) {
        super.setCant(cant);
    }
}
