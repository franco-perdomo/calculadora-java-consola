package calculadora;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        try (var consola = new Scanner(System.in)) {
            var salir = false;

            while (!salir) {
                mostrarMenu();
                int opcion = leerEntero(consola);

                if (opcion == 5) {
                    System.out.println("Saliendo del programa de Calculadora!");
                    salir = true;
                } else if (opcion >= 1 && opcion <= 4) {
                    double valor1 = leerDecimal(consola, "Ingresa el valor 1: ");
                    double valor2 = leerDecimal(consola, "Ingresa el valor 2: ");
                    ejecutarOperacion(opcion, valor1, valor2);
                } else {
                    System.out.println("Opcion invalida, selecciona otra opcion...\n");
                }
            }
        }
    }

    private static void mostrarMenu() {
        System.out.print("""
                *** Calculadora en Java ***
                Operaciones que puedes realizar:
                1. Suma
                2. Resta
                3. Multiplicacion
                4. Division
                5. Salir
                Escoge una opcion:\s""");
    }

    private static void ejecutarOperacion(int opcion, double a, double b) {
        switch (opcion) {
            case 1 -> imprimirResultado("suma", a + b);
            case 2 -> imprimirResultado("resta", a - b);
            case 3 -> imprimirResultado("multiplicacion", a * b);
            case 4 -> {
                if (b != 0) {
                    imprimirResultado("division", a / b);
                } else {
                    System.out.println("Error: Division por cero.\n");
                }
            }
        }
    }

    private static void imprimirResultado(String operacion, double resultado) {
        System.out.printf("Resultado de la %s: %.2f%n%n", operacion, resultado);
    }

    private static int leerEntero(Scanner consola) {
        while (true) {
            try {
                return Integer.parseInt(consola.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.print("Entrada invalida, ingresa un numero entero: ");
            }
        }
    }

    private static double leerDecimal(Scanner consola, String mensaje) {
        System.out.print(mensaje);
        while (true) {
            try {
                return Double.parseDouble(consola.nextLine().trim().replace(',', '.'));
            } catch (NumberFormatException e) {
                System.out.print("Numero invalido, intenta de nuevo: ");
            }
        }
    }
}
