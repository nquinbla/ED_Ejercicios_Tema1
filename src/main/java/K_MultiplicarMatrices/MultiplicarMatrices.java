package K_MultiplicarMatrices;

import java.util.Scanner;

public class MultiplicarMatrices {
    public static void main(String[] args) {
        int[][] matrix1 = receiveMatrix();
        int[][] matrix2 = receiveMatrix();

        int[][] result = multiplyMatrices(matrix1, matrix2);

        if (result != null) {
            System.out.println("Matriz 1:");
            printMatrix(matrix1);
            System.out.println("Matriz 2:");
            printMatrix(matrix2);
            System.out.println("Resultado de la multiplicación:");
            printMatrix(result);
        }
    }

    public static int[][] receiveMatrix() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca las dimensiones de la matriz: ");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Introduzca el elemento [" + (i + 1) + "][" + (j + 1) + "] de la matriz: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        return matrix;
    }

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        if (matrix1[0].length != matrix2.length) {
            System.out.println("Error: las dimensiones de las matrices no son compatibles para la multiplicación.");
            return null;
        }

        int[][] result = new int[matrix1.length][matrix2[0].length];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                for (int k = 0; k < matrix1[0].length; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}