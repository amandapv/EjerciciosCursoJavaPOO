package poo;

public class Uso_Coche {

    public static void main (String[] args) {

        Coche Renault = new Coche();  //INSTANCIAR UNA CLASE. EJEMPLAR DE LA CLASE

        // System.out.println("Este coche tiene " + Renault.ruedas + " ruedas.");

        Renault.setEstablece_color();

        System.out.println(Renault.getDime_color()); //como hemos definido las variable de tipo privado, lo hacemos mediante este método

    }

}
