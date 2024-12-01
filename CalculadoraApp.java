import java.util.Scanner;
public class CalculadoraApp {
    public static void main(String[] args) {
        System.out.println("****Aplicacion Calculadora****");
        Scanner input = new Scanner(System.in);
        //Se muestra menu
        System.out.println("""
                1.Suma
                2.Resta
                3.Multiplicacion
                4.Division
                5.Salir""");
        System.out.println("¿Que operación desea realizar?");
        var operacion = Integer.parseInt(input.nextLine());
        if (operacion >= 1 && operacion <= 4){
            System.out.print("Proporciona valor operando1: ");
            var operando1 = Integer.parseInt(input.nextLine());
            System.out.print("Proporciona valor operando2: ");
            var operando2 = Integer.parseInt(input.nextLine());
            int resultado;
            switch (operacion) {
                case 1:
                    resultado = operando1 + operando2;
                    System.out.println("Suma = " + resultado);
                    break;

                case 2:
                    resultado = operando1 - operando2;
                    System.out.println("Resta = " + resultado);
                    break;

                case 3:
                    resultado = operando1 * operando2;
                    System.out.println("Multiplicacion = " + resultado);
                    break;

                case 4:
                    resultado = operando1 / operando2;
                    System.out.println("Division = " + resultado);
                    break;
                default: {}
                    System.out.println("Opcion Incorrecta : " + operacion);
            }

        }
        else if (operacion == 5){
            System.out.println("Adios...");

        }
        else {
            System.out.println("Opcion Incorrecta : " + operacion);
        }
    }
}
