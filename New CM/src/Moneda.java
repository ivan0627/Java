

public class Moneda {

        private String nacionalidad;
        private String nombre;
        private double   valorEnDolares;

    public Moneda(String entradaNacionalidad, String entradaNombre, double entradaValorEnDolares) {
        this.nacionalidad=entradaNacionalidad;
        this.nombre=entradaNombre;
        this.valorEnDolares=entradaValorEnDolares;
    }


    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getValorEnDolares() {
        return valorEnDolares;
    }



    public void setValorEnDolares(double valorEnDolares) {
        this.valorEnDolares = valorEnDolares;
    }


    public static void negocioAbierto(boolean estado) {
        if (estado = true){
            System.out.println("El negocio esta abierto");
        } else {
            System.out.println(" El negocio esta cerrado");
        }
    }

    }

