import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int dia;

        System.out.println("***Dia de la semana***");

        System.out.println("Ingresa el dia en el que te encuentras");
        dia = sc.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Es lunes");
                break;

            case 2:
                System.out.println("Es martes");
                break;
            case 3:
                System.out.println("Es miercoles");
                break;
            case 4:
                System.out.println("Es jueves");
                break;
            case 5:
                System.out.println("Es viernes");
                break;
            case 6:
                System.out.println("Es sabado");
                break;
            case 7:
                System.out.println("Es domingo");
                break;

            default:
                System.out.println("Ingresa un dia valido");
                break;
        }

     

    }
}
