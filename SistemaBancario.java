import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean quiereSalir;

        System.out.println("***Sistema Bancario***");

        System.out.println("Te gustaria salir del sistema?");
        quiereSalir = sc.nextBoolean();

        if (!quiereSalir) {
            
            System.out.println("Por favor elija un tipo de transaccion");


            
        }else{
            System.out.println("Vuelva pronto gracias por utilizar nuestro banco");
        }
    }
}
