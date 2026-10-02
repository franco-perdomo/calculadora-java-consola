package calculadora;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        var consola = new Scanner(System.in);
        double valor1 = 0;
        double valor2 = 0;
        double resultado;
        var salir = false;

        while (!salir) {
            System.out.print("""
                    *** Calculadora en Java ***
                    Operaciones que puedes realizar:
                    1. Suma
                    2. Resta
                    3. Multiplicacion
                    4. Division
                    5. Salir
                    Escoge una opcion:\s""");
            var opcion = consola.nextInt();

            if (opcion == 1 || opcion == 2) {
                System.out.print("Ingresa el valor 1: ");
                valor1 = consola.nextDouble();
                System.out.print("Ingresa el valor 2: ");
                valor2 = consola.nextDouble();
            }

            switch (opcion) {
                case 1 -> {
                    resultado = valor1 + valor2;
                    System.out.printf("Resultado de la suma: %.2f%n%n", resultado);
                }
                case 2 -> {
                    resultado = valor1 - valor2;
                    System.out.printf("Resultado de la resta: %.2f%n%n", resultado);
                }
                case 3, 4 -> System.out.println("Operacion aun no disponible\n");
                case 5 -> {
                    System.out.println("Saliendo del programa de Calculadora!");
                    salir = true;
                }
                default -> System.out.println("Opcion invalida, selecciona otra opcion...\n");
            }
        }
    }
}

