package D_ListaEnterosPositivos;

import java.util.Scanner;

public class EnterosPositivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (true) {
            System.out.println("Introduzca un número entero positivo (un número negativo para terminar): ");
            number = scanner.nextInt();

            if (number < 0) {
                break;
            }

            if (number < min) {
                min = number;
            }

            if (number > max) {
                max = number;
            }
        }

        if (min != Integer.MAX_VALUE && max != Integer.MIN_VALUE) {
            System.out.println("El número mínimo es: " + min);
            System.out.println("El número máximo es: " + max);
        } else {
            System.out.println("No se introdujo ningún número válido.");
        }
    }
}
