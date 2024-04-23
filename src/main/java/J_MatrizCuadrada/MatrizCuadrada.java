package J_MatrizCuadrada;

import java.util.Random;
import java.util.Scanner;

public class MatrizCuadrada {
    public static void main(String[] args) {
        generateAndPrintSymmetricMatrix();
    }

    public static void generateAndPrintSymmetricMatrix() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca las dimensiones de la matriz: ");
        int N = scanner.nextInt();

        int[][] matrix = new int[N][N];
        Random random = new Random();

        // Generar la matriz simétrica
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                int randomNum = random.nextInt(100);  // Generar un número aleatorio entre 0 y 99
                matrix[i][j] = randomNum;
                matrix[j][i] = randomNum;
            }
        }

        // Imprimir la matriz
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
