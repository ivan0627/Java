package CM;
import  CM.Moneda;
import javax.swing.*;
import java.util.Locale;

public class SegundaVersion21 {

    ////Dolar
    public static double convertFromUSD ( double cantidad, String divisa){
        switch (divisa) {
            case "MXN":
                cantidad = cantidad * 20.66;
                break;
            case "COP":
                cantidad = cantidad * 3956;
                break;
            case "CLP":
                cantidad= cantidad * 801.24;
                break;
            case "ARS":
                cantidad = cantidad * 107.08;
                break;
            case "CNY" :
                cantidad = cantidad * 6.34;
                break;

        }
        return cantidad;
    }
    ////COP
    public static double convertFromCOP ( double cantidad, String divisa) {
        switch (divisa) {
            case "MXN":
                cantidad = cantidad * 0.0052;
                break;

            case "USD":
                cantidad = cantidad * 0.00025;
                break;
            case "CLP":
                cantidad= cantidad * 0.20;
                break;
            case "ARS":
                cantidad = cantidad * 0.027;
                break;
            case "CNY" :
                cantidad = cantidad * 0.0016;
                break;

        }
        return cantidad;

    }
    //// MXN
    public static double convertFromMXN ( double cantidad, String divisa) {
        switch (divisa) {
            case "USD":
                cantidad = cantidad * 0.048;
                break;

            case "COP":
                cantidad = cantidad * 191.49;
                break;
            case "CLP":
                cantidad= cantidad * 39.44;
                break;
            case "ARS":
                cantidad = cantidad * 5.28;
                break;
            case "CNY" :
                cantidad = cantidad * 0.31;
                break;
        }
        return cantidad;
    }
    //// CLP
    public static double convertFromCLP ( double cantidad, String divisa) {
        switch (divisa) {
            case "USD":
                cantidad = cantidad * 0.0013;
                break;
            case "MXN":
                cantidad = cantidad * 0.025;
                break;

            case "COP":
                cantidad = cantidad * 4.92;
                break;
            case "ARS":
                cantidad = cantidad * 0.13;
                break;
            case "CNY" :
                cantidad = cantidad * 0.0079;
                break;

        }
        return cantidad;
    }
    //// ARS
    public static double convertFromARS ( double cantidad, String divisa) {
        switch (divisa) {
            case "USD":
                cantidad = cantidad * 0.0093;
                break;
            case "MXN":
                cantidad = cantidad * 0.19;
                break;

            case "COP":
                cantidad = cantidad * 36.74;
                break;
            case "CLP":
                cantidad = cantidad * 7.45;
                break;
            case "CNY" :
                cantidad = cantidad * 0.059;
                break;

        }
        return cantidad;
    }
    //// CNY
    public static double convertFromCNY ( double cantidad, String divisa) {
        switch (divisa) {
            case "USD":
                cantidad = cantidad * 0.16;
                break;
            case "MXN":
                cantidad = cantidad * 3.20;
                break;

            case "COP":
                cantidad = cantidad * 620.96;
                break;
            case "CLP":
                cantidad = cantidad * 125.97;
                break;
            case "ARS" :
                cantidad = cantidad * 16.90;
                break;

        }
        return cantidad;
    }


    public static void main(String[] args) {

        String UnidadAConvertir = JOptionPane.showInputDialog("Ingrese la divisa que posee - USD - COP - MXN - CLP - ARS - CNY");
        UnidadAConvertir = UnidadAConvertir.toUpperCase();


    double entradaDivisa = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad"));

        String UnidadReferencia = JOptionPane.showInputDialog("Ingrese la divisa referencia - USD - COP - MXN - CLP - ARS - CNY");
        UnidadReferencia = UnidadReferencia.toUpperCase();

        String imprimir = (entradaDivisa + " " + UnidadAConvertir  + " Equivalen a " );


        if (UnidadAConvertir.equals("USD")&& (UnidadReferencia.equals("MXN")|| UnidadReferencia.equals("COP")|| UnidadReferencia.equals("ARS")
                ||UnidadReferencia.equals("CNY")||UnidadReferencia.equals("CLP"))) {
            double conversion = convertFromUSD(entradaDivisa, UnidadReferencia);
            JOptionPane.showMessageDialog(null, imprimir + Math.round( conversion) + UnidadReferencia);}
        else if (UnidadAConvertir.equals ("COP") && (UnidadReferencia.equals("MXN")|| UnidadReferencia.equals("USD")|| UnidadReferencia.equals("ARS")
                ||UnidadReferencia.equals("CNY")||UnidadReferencia.equals("CLP"))) {
            double conversion =  convertFromCOP(entradaDivisa, UnidadReferencia);
            JOptionPane.showMessageDialog(null, imprimir + Math.round( conversion) + UnidadReferencia);
        } else if (UnidadAConvertir.equals("MXN") && (UnidadReferencia.equals("USD")|| UnidadReferencia.equals("COP")|| UnidadReferencia.equals("ARS")
                ||UnidadReferencia.equals("CNY")||UnidadReferencia.equals("CLP"))) {
            double conversion =  convertFromMXN(entradaDivisa, UnidadReferencia);
            JOptionPane.showMessageDialog(null, imprimir + Math.round( conversion) + UnidadReferencia);}
        else if (UnidadAConvertir.equals("CLP") && (UnidadReferencia.equals("USD")|| UnidadReferencia.equals("COP")|| UnidadReferencia.equals("ARS")
                    ||UnidadReferencia.equals("CNY")||UnidadReferencia.equals("MXN"))) {
                double conversion =  convertFromCLP(entradaDivisa, UnidadReferencia);
                JOptionPane.showMessageDialog(null, imprimir + Math.round( conversion)+ UnidadReferencia);
        }
        else if (UnidadAConvertir.equals("ARS") && (UnidadReferencia.equals("USD")|| UnidadReferencia.equals("COP")|| UnidadReferencia.equals("CLP")
                ||UnidadReferencia.equals("CNY")||UnidadReferencia.equals("MXN"))) {
            double conversion =  convertFromARS(entradaDivisa, UnidadReferencia);
            JOptionPane.showMessageDialog(null, imprimir + Math.round( conversion) + UnidadReferencia);}
        else if (UnidadAConvertir.equals("CNY") && (UnidadReferencia.equals("USD")|| UnidadReferencia.equals("COP")|| UnidadReferencia.equals("CLP")
                ||UnidadReferencia.equals("ARS")||UnidadReferencia.equals("MXN"))) {
            double conversion =  convertFromCNY(entradaDivisa, UnidadReferencia);
            JOptionPane.showMessageDialog(null, imprimir + Math.round( conversion) + UnidadReferencia);}
            else {
            System.out.println("Divisa no valida");}


    }


}

