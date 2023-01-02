package poo;

public class Coche {

    //variables
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso_plataforma;
    String color;
    int peso_total;
    boolean asientos_cuero, climatizador;


    //metodo contructor
    public Coche() {

        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        peso_plataforma = 500;

    }

    public String getDime_largo() { //GETTER
        return "El largo del coche es " + largo;
    }

    public void setEstablece_color() { //SETTER
        color = "azul";
    }

    public String getDime_color() {
        return "El color del coche es " + color;
    }


}
