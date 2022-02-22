package CM;

public class Moneda {

    String nacionalidad;
    double valorEnDolar;
    String nombre ;


    public static void main(String[] args) {
        Moneda COP = new Moneda ();
        COP.nacionalidad = "Colombia";
        COP.valorEnDolar =  0.00025 ;
        COP.nombre = "Pesos Colombianos";

        Moneda MXN = new Moneda ();
        MXN.nacionalidad = "Mexico";
        MXN.nombre = "Pesos Mexicanos";
        MXN.valorEnDolar = 0.048;

        Moneda USD = new Moneda();
        USD.nacionalidad = "Estados Unidos";
        USD.valorEnDolar = 1;
        USD.nombre = "Dolar Americano";
    }

}