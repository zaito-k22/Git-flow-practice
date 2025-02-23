import java.util.Scanner;

public class RevisarNumero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("***Sistema para ver si un numero es positivo***");

        int numero;

        System.out.println("Por favor ingresa el numero a evaluar");
        numero = sc.nextInt();

        if (numero > 0) {

            System.out.println(numero + "  es positivo");

        } else if (numero == 0) {

            System.out.println("El numero es 0");

        } else {

            System.out.println("El numero es negativo");
        }

    }
}
