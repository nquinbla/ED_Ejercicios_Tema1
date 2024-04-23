package H_MedMinMaxDatos;

import java.util.ArrayList;
import java.util.Scanner;

public class MedMinMaxDatos {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = receiveNumbers();
        double average = calculateAverage(numbers);
        int min = calculateMin(numbers);
        int max = calculateMax(numbers);

        System.out.println("La media es: " + average);
        System.out.println("El mínimo es: " + min);
        System.out.println("El máximo es: " + max);
    }

    public static ArrayList<Integer> receiveNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int number;

        while (true) {
            System.out.println("Introduzca un número entero (0 para terminar): ");
            number = scanner.nextInt();

            if (number == 0) {
                break;
            }

            numbers.add(number);
        }

        return numbers;
    }

    public static double calculateAverage(ArrayList<Integer> numbers) {
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum / numbers.size();
    }

    public static int calculateMin(ArrayList<Integer> numbers) {
        int min = Integer.MAX_VALUE;
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    public static int calculateMax(ArrayList<Integer> numbers) {
        int max = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }
}