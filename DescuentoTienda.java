import java.util.Scanner;

public class DescuentoTienda {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("***Sistema de descuento en tienda en linea");

        System.out.println("Por favor introduzca el monto de su compra");
        double monto = sc.nextDouble();

        System.out.println("Es usted cliente de la tienda?");
        boolean esClientee = sc.nextBoolean();

        if (esClientee && monto >= 1000.0) {

            System.out.println("Felicidades has tenido un descuento del 10%");
            monto = monto - (monto * .10);
            System.out.println("Su nuevo monto es de " + monto);

            
        }else if (esClientee) {

            System.out.println("Felicidades has tenido un descuento del 5%");
            monto = monto - (monto * .05);
            System.out.println("Su nuevo monto es de " + monto);
            
        }else{
            System.out.println("No has recibido un descuento, su monto se mantiene en: " + monto);
        }
    }
}
