import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class SaludFitness {
    public static void main(String[] args) {

        System.out.println("*** Aplicacion Salud y Fitness ***");

        Scanner sc = new Scanner(System.in);
        final int META_PASOS_DIARIOS = 10000;
        final double CALORIAS_POR_PASO = 0.04;
        String nombre;
        int pasosDados;
        double caloriasQuemadas;

        System.out.println("Bienvenido a la aplicacion de salud y fitness");

        System.out.println("Por favor ingrese su nombre");
        nombre = sc.nextLine();

        System.out.println("Por favor ingrese un aproximado de los pasos caminados por dia");
        pasosDados = sc.nextInt();

        caloriasQuemadas = pasosDados * CALORIAS_POR_PASO;

        

        if (pasosDados >= META_PASOS_DIARIOS) {

            System.out.println("Su meta ha sido alcanzada");
            System.out.println("Has quemado un total de: " + caloriasQuemadas + "Calorias");
            
        }else{
            System.out.println("Aun te faltan algunos pasos por hacer en el dia, esfuerzate");
            System.out.println("Has quemado un total de: " + caloriasQuemadas + "Calorias");

        }
    }
}
