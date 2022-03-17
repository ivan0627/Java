import javax.swing.*;
import java.awt.*;
import java.awt.Component;
import javax.swing.JOptionPane;


public class Convertidor {


    public Convertidor() {
    }

    public static double convertFromUSD(double cantidad, String divisa) {
        byte var4 = -1;
        switch (divisa.hashCode()) {
            case 65090:
                if (divisa.equals("ARS")) {
                    var4 = 3;
                }
                break;
            case 66823:
                if (divisa.equals("CLP")) {
                    var4 = 2;
                }
                break;
            case 66894:
                if (divisa.equals("CNY")) {
                    var4 = 4;
                }
                break;
            case 66916:
                if (divisa.equals("COP")) {
                    var4 = 1;
                }
                break;
            case 76803:
                if (divisa.equals("MXN")) {
                    var4 = 0;
                }
        }

        switch (var4) {
            case 0:
                cantidad *= 20.66D;
                break;
            case 1:
                cantidad *= 3956.0;
                break;
            case 2:
                cantidad *= 801.24D;
                break;
            case 3:
                cantidad *= 107.08D;
                break;
            case 4:
                cantidad *= 6.34D;
        }

        return cantidad;
    }

    public static double convertFromCOP(double cantidad, String divisa) {
        byte var4 = -1;
        switch (divisa.hashCode()) {
            case 65090:
                if (divisa.equals("ARS")) {
                    var4 = 3;
                }
                break;
            case 66823:
                if (divisa.equals("CLP")) {
                    var4 = 2;
                }
                break;
            case 66894:
                if (divisa.equals("CNY")) {
                    var4 = 4;
                }
                break;
            case 76803:
                if (divisa.equals("MXN")) {
                    var4 = 0;
                }
                break;
            case 84326:
                if (divisa.equals("USD")) {
                    var4 = 1;
                }
        }

        switch (var4) {
            case 0:
                cantidad *= 0.0052D;
                break;
            case 1:
                cantidad *= 2.5E-4D;
                break;
            case 2:
                cantidad *= 0.2D;
                break;
            case 3:
                cantidad *= 0.027D;
                break;
            case 4:
                cantidad *= 0.0016D;
        }

        return cantidad;
    }

    public static double convertFromMXN(double cantidad, String divisa) {
        byte var4 = -1;
        switch (divisa.hashCode()) {
            case 65090:
                if (divisa.equals("ARS")) {
                    var4 = 3;
                }
                break;
            case 66823:
                if (divisa.equals("CLP")) {
                    var4 = 2;
                }
                break;
            case 66894:
                if (divisa.equals("CNY")) {
                    var4 = 4;
                }
                break;
            case 66916:
                if (divisa.equals("COP")) {
                    var4 = 1;
                }
                break;
            case 84326:
                if (divisa.equals("USD")) {
                    var4 = 0;
                }
        }

        switch (var4) {
            case 0:
                cantidad *= 0.048D;
                break;
            case 1:
                cantidad *= 191.49D;
                break;
            case 2:
                cantidad *= 39.44D;
                break;
            case 3:
                cantidad *= 5.28D;
                break;
            case 4:
                cantidad *= 0.31D;
        }

        return cantidad;
    }

    public static double convertFromCLP(double cantidad, String divisa) {
        byte var4 = -1;
        switch (divisa.hashCode()) {
            case 65090:
                if (divisa.equals("ARS")) {
                    var4 = 3;
                }
                break;
            case 66894:
                if (divisa.equals("CNY")) {
                    var4 = 4;
                }
                break;
            case 66916:
                if (divisa.equals("COP")) {
                    var4 = 2;
                }
                break;
            case 76803:
                if (divisa.equals("MXN")) {
                    var4 = 1;
                }
                break;
            case 84326:
                if (divisa.equals("USD")) {
                    var4 = 0;
                }
        }

        switch (var4) {
            case 0:
                cantidad *= 0.0013D;
                break;
            case 1:
                cantidad *= 0.025D;
                break;
            case 2:
                cantidad *= 4.92D;
                break;
            case 3:
                cantidad *= 0.13D;
                break;
            case 4:
                cantidad *= 0.0079D;
        }

        return cantidad;
    }

    public static double convertFromARS(double cantidad, String divisa) {
        byte var4 = -1;
        switch (divisa.hashCode()) {
            case 66823:
                if (divisa.equals("CLP")) {
                    var4 = 3;
                }
                break;
            case 66894:
                if (divisa.equals("CNY")) {
                    var4 = 4;
                }
                break;
            case 66916:
                if (divisa.equals("COP")) {
                    var4 = 2;
                }
                break;
            case 76803:
                if (divisa.equals("MXN")) {
                    var4 = 1;
                }
                break;
            case 84326:
                if (divisa.equals("USD")) {
                    var4 = 0;
                }
        }

        switch (var4) {
            case 0:
                cantidad *= 0.0093D;
                break;
            case 1:
                cantidad *= 0.19D;
                break;
            case 2:
                cantidad *= 36.74D;
                break;
            case 3:
                cantidad *= 7.45D;
                break;
            case 4:
                cantidad *= 0.059D;
        }

        return cantidad;
    }

    public static double convertFromCNY(double cantidad, String divisa) {
        byte var4 = -1;
        switch (divisa.hashCode()) {
            case 65090:
                if (divisa.equals("ARS")) {
                    var4 = 4;
                }
                break;
            case 66823:
                if (divisa.equals("CLP")) {
                    var4 = 3;
                }
                break;
            case 66916:
                if (divisa.equals("COP")) {
                    var4 = 2;
                }
                break;
            case 76803:
                if (divisa.equals("MXN")) {
                    var4 = 1;
                }
                break;
            case 84326:
                if (divisa.equals("USD")) {
                    var4 = 0;
                }
        }

        switch (var4) {
            case 0:
                cantidad *= 0.16D;
                break;
            case 1:
                cantidad *= 3.2D;
                break;
            case 2:
                cantidad *= 620.96D;
                break;
            case 3:
                cantidad *= 125.97D;
                break;
            case 4:
                cantidad *= 16.9D;
        }

        return cantidad;
    }

    public static void main(String[] args) {
        Moneda.negocioAbierto(true);

        String NombreUsuario = JOptionPane.showInputDialog("Ingrese su nombre");
        NombreUsuario = NombreUsuario.toUpperCase();
        String UnidadAConvertir = JOptionPane.showInputDialog("Ingrese la divisa que posee - USD - COP - MXN - CLP - ARS - CNY");
        UnidadAConvertir = UnidadAConvertir.toUpperCase();
        double entradaDivisa = (double) Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad"));
        String UnidadReferencia = JOptionPane.showInputDialog("Ingrese la divisa referencia - USD - COP - MXN - CLP - ARS - CNY");
        UnidadReferencia = UnidadReferencia.toUpperCase();
        String imprimir = entradaDivisa + " " + UnidadAConvertir + " Equivalen a ";
        double conversion;


        Moneda objetoMonedaCOP = new Moneda("Colombia", "Pesos colombianos",3700);


        if (UnidadAConvertir.equals("COP")){
            System.out.println("La moneda tiene como nacionalidad: "+objetoMonedaCOP.getNacionalidad());
            System.out.println("La moneda tiene como nombre: "+ objetoMonedaCOP.getNombre());
            System.out.println("Un dolar equivale a "+objetoMonedaCOP.getValorEnDolares()+ " " + objetoMonedaCOP.getNombre());
        }

        Moneda objetoMonedaUSD = new Moneda("Estadounidense", "Dolar Americano",1);


        if (UnidadAConvertir.equals("USD")){
            System.out.println("La moneda tiene como nacionalidad: "+objetoMonedaUSD.getNacionalidad());
            System.out.println("La moneda tiene como nombre: "+ objetoMonedaUSD.getNombre());
            System.out.println("Un dolar equivale a "+objetoMonedaUSD.getValorEnDolares()+  " " + objetoMonedaUSD.getNombre());
        }
        Moneda objetoMonedaMXN = new Moneda("Mexicana","Pesos Mexicanos", 20.78);


        if (UnidadAConvertir.equals("MXN")){
            System.out.println("La moneda tiene como nacionalidad: "+objetoMonedaMXN.getNacionalidad());
            System.out.println("La moneda tiene como nombre: "+ objetoMonedaMXN.getNombre());
            System.out.println("Un dolar equivale a "+objetoMonedaMXN.getValorEnDolares()+ " " + objetoMonedaMXN.getNombre());
        }

        Moneda objetoMonedaCLP = new Moneda("Chile","Pesos Chilenos",806.45);


        if (UnidadAConvertir.equals("CLP")){
            System.out.println("La moneda tiene como nacionalidad: "+objetoMonedaCLP.getNacionalidad());
            System.out.println("La moneda tiene como nombre: "+ objetoMonedaCLP.getNombre());
            System.out.println("Un dolar equivale a "+objetoMonedaCLP.getValorEnDolares()+ " " + objetoMonedaCLP.getNombre());
        }

        Moneda objetoMonedaARS = new Moneda("Argentina","Pesos argentinos",109.29);


        if (UnidadAConvertir.equals("ARS")){
            System.out.println("La moneda tiene como nacionalidad: "+objetoMonedaARS.getNacionalidad());
            System.out.println("La moneda tiene como nombre: "+ objetoMonedaARS.getNombre());
            System.out.println("Un dolar equivale a "+objetoMonedaARS.getValorEnDolares()+ " " + objetoMonedaARS.getNombre());
        }

        Moneda objetoMonedaCNY = new Moneda("China", "Yuan",6.37);


        if (UnidadAConvertir.equals("CNY")){
            System.out.println("La moneda tiene como nacionalidad: "+objetoMonedaCNY.getNacionalidad());
            System.out.println("La moneda tiene como nombre: "+ objetoMonedaCNY.getNombre());
            System.out.println("Un dolar equivale a "+objetoMonedaCNY.getValorEnDolares()+ " " + objetoMonedaCNY.getNombre());
        }

        Bitcoin btc = new Bitcoin("Sin nacionalidad","Bitcoin",40.407);


        System.out.println("El nombre del cliente es: "+NombreUsuario);



        if (!UnidadAConvertir.equals("USD") || !UnidadReferencia.equals("MXN") && !UnidadReferencia.equals("COP") && !UnidadReferencia.equals("ARS") && !UnidadReferencia.equals("CNY") && !UnidadReferencia.equals("CLP")) {
            if (UnidadAConvertir.equals("COP") && (UnidadReferencia.equals("MXN") || UnidadReferencia.equals("USD") || UnidadReferencia.equals("ARS") || UnidadReferencia.equals("CNY") || UnidadReferencia.equals("CLP"))) {
                conversion = convertFromCOP(entradaDivisa, UnidadReferencia);
                JOptionPane.showMessageDialog((Component) null, imprimir + Math.round(conversion) + UnidadReferencia);
            } else if (!UnidadAConvertir.equals("MXN") || !UnidadReferencia.equals("USD") && !UnidadReferencia.equals("COP") && !UnidadReferencia.equals("ARS") && !UnidadReferencia.equals("CNY") && !UnidadReferencia.equals("CLP")) {
                if (UnidadAConvertir.equals("CLP") && (UnidadReferencia.equals("USD") || UnidadReferencia.equals("COP") || UnidadReferencia.equals("ARS") || UnidadReferencia.equals("CNY") || UnidadReferencia.equals("MXN"))) {
                    conversion = convertFromCLP(entradaDivisa, UnidadReferencia);
                    JOptionPane.showMessageDialog((Component) null, imprimir + Math.round(conversion) + UnidadReferencia);
                } else if (!UnidadAConvertir.equals("ARS") || !UnidadReferencia.equals("USD") && !UnidadReferencia.equals("COP") && !UnidadReferencia.equals("CLP") && !UnidadReferencia.equals("CNY") && !UnidadReferencia.equals("MXN")) {
                    if (!UnidadAConvertir.equals("CNY") || !UnidadReferencia.equals("USD") && !UnidadReferencia.equals("COP") && !UnidadReferencia.equals("CLP") && !UnidadReferencia.equals("ARS") && !UnidadReferencia.equals("MXN")) {
                        System.out.println("Divisa no valida");
                    } else {
                        conversion = convertFromCNY(entradaDivisa, UnidadReferencia);
                        JOptionPane.showMessageDialog((Component) null, imprimir + Math.round(conversion) + UnidadReferencia);
                    }
                } else {
                    conversion = convertFromARS(entradaDivisa, UnidadReferencia);
                    JOptionPane.showMessageDialog((Component) null, imprimir + Math.round(conversion) + UnidadReferencia);
                }
            } else {
                conversion = convertFromMXN(entradaDivisa, UnidadReferencia);
                JOptionPane.showMessageDialog((Component) null, imprimir + Math.round(conversion) + UnidadReferencia);
            }
        } else {
            conversion = convertFromUSD(entradaDivisa, UnidadReferencia);
            JOptionPane.showMessageDialog((Component) null, imprimir + Math.round(conversion) + UnidadReferencia);
        }


        }
    }
