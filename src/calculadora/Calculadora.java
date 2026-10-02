package calculadora;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        var consola = new Scanner(System.in);
        var salir = false;

        // Menú interactivo
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

            // Opciones a alegir
            switch (opcion) {
                case 1, 2, 3, 4 -> System.out.println("Operacion aun no disponible\n");
                case 5 -> {
                    System.out.println("Saliendo del programa de Calculadora!");
                    salir = true;
                }
                default -> System.out.println("Opcion invalida, selecciona otra opcion...\n");
            }
        }
    }
}

