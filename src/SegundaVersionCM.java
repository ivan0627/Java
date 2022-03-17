import jdk.swing.interop.SwingInterOpUtils;

import javax.swing.*;

public class SegundaVersion {


    ////Dolar
    public static double convertFromUSD ( double cantidad, String divisa){
        switch (divisa) {
            case "MXN":
                cantidad = cantidad * 20.66;
                break;

            case "COP":
                cantidad = cantidad * 3956;
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

        }
        return cantidad;

    }
    ///MXN
    public static double convertFromMXN ( double cantidad, String divisa) {
        switch (divisa) {
            case "USD":
                cantidad = cantidad * 0.048;
                break;

            case "COP":
                cantidad = cantidad * 191.49;
                break;

        }
        return cantidad;
    }

    public static void main(String[] args) {


        String UnidadAConvertir =
                JOptionPane.showInputDialog("Ingrese la divisa a convertir - USD - COP - MXN");
        double entradaDivisa = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad"));
        String UnidadReferencia =
                JOptionPane.showInputDialog("Ingrese la divisa referencia - USD - COP - MXN");

        System.out.println(UnidadAConvertir);
        if (UnidadAConvertir.equals("USD")&& (UnidadReferencia.equals("MEX")|| UnidadReferencia.equals("COP"))) {
            double conversion = convertFromUSD(entradaDivisa, UnidadReferencia);

            JOptionPane.showMessageDialog(null, UnidadAConvertir + " Equivalen a " + conversion + UnidadReferencia);}
        else if (UnidadAConvertir.equals ("COP") && (UnidadReferencia.equals ("MXN") || UnidadReferencia.equals ("USD"))) {
            double conversion =  convertFromCOP(entradaDivisa, UnidadReferencia);
            JOptionPane.showMessageDialog(null, UnidadAConvertir + " Equivalen a " + conversion + UnidadReferencia);
        } else if (UnidadAConvertir.equals("MXN") && (UnidadReferencia.equals ("USD") || UnidadReferencia.equals ("COP"))) {
            double conversion =  convertFromMXN(entradaDivisa, UnidadReferencia);
            JOptionPane.showMessageDialog(null, UnidadAConvertir + " Equivalen a " + conversion + UnidadReferencia);

        }else {
            System.out.println("Divisa no valida");}

    }

}


