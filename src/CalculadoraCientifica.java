import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraCientifica {
    private static final int MAX_HISTORIAL = 10;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String [] historial = new String[MAX_HISTORIAL];
        int contadorHistorial = 0;
        boolean continuar = true;

        System.out.println("=== Calculadora Cientifica===");

        while (continuar) {
            System.out.println("\nSelecciona una nueva operacion: ");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Division");
            System.out.println("5. Potencia");
            System.out.println("6. Raiz Cuadrada");
            System.out.println("7. Ver Historial");
            System.out.println("8. Salir");
            System.out.print("Opcion: ");
            int opcion = 0;
            try {
                opcion = entrada.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("ERR:Opcion Invalida. Intente de nuevo.");
                entrada.next();
                continue;
            }


        }
    }
}
}
