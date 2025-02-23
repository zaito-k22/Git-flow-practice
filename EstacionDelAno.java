import java.util.Scanner;

public class EstacionDelAno {
    public static void main(String[] args) {
        System.out.println("*** Sistema de identificacion de la estacion ***");

        Scanner sc = new Scanner(System.in);
        int mes;

        System.out.println("Por favor indica el mes en que te encuentras (1 al 12)");
        mes = sc.nextInt();

        if (mes == 1 || mes == 2 || mes == 12) {

            System.out.println("Estas en la estacion de invierno");
            
        }else if(mes == 3 || mes == 4 || mes == 5){

            System.out.println("Estas en la estacion de primavera");

        }else if(mes == 6 || mes == 7 || mes == 8){

            System.out.println("Estas en la estacion de verano");

        }else if (mes == 9 || mes == 10 || mes == 11) {

            System.out.println("Estas en la estacion de otoño");
            
        }else{
            System.out.println("No has ingresado un mes valido");
        }

        
    }
}
