public class Milk extends Inventory{



    Milk(String description, double price, boolean exit, int cant) {

        super(description, price, exit, cant);
    }


    public void dats(){
        System.out.println("El articulo es: "+ description + "Su precio es " + price + "Su existenciaes" + exit);

    }

    @Override
    public int ingresoMerc(int ingreso) {
        return  this.getCant() + ingreso;
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
