package calculadora;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        var consola = new Scanner(System.in);
        double valor1 = 0;
        double valor2 = 0;
        double resultado;
        var salir = false;

        // Menu interactivo
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
            var opcion = leerEntero(consola);

            if (opcion >= 1 && opcion <= 4) {
                valor1 = leerDecimal(consola, "Ingresa el valor 1: ");
                valor2 = leerDecimal(consola, "Ingresa el valor 2: ");
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
                case 3 -> {
                    resultado = valor1 * valor2;
                    System.out.printf("Resultado de la multiplicacion: %.2f%n%n", resultado);
                }
                case 4 -> {
                    if (valor2 != 0) {
                        resultado = valor1 / valor2;
                        System.out.printf("Resultado de la division: %.2f%n%n", resultado);
                    } else {
                        System.out.println("Error: Division por cero.\n");
                    }
                }
                case 5 -> {
                    System.out.println("Saliendo del programa de Calculadora!");
                    salir = true;
                }
                default -> System.out.println("Opcion invalida, selecciona otra opcion...\n");
            }
        }
    }
    private static int leerEntero (Scanner consola) {
        while (true) {
            try {
                return Integer.parseInt(consola.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.print("Entrada invalida, ingresa un numero entero: ");
            }
        }
    }

    private static double leerDecimal (Scanner consola, String mensaje) {
        System.out.print(mensaje);
        while (true) {
            try {
                return Double.parseDouble(consola.nextLine().trim().replace(',', '.'));
            } catch (NumberFormatException e) {
                System.out.print("Numero invalido, intenta de nuevo");
            }
        }
    }
}

