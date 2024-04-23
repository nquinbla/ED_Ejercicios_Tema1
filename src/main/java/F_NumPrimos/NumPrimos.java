package F_NumPrimos;

import java.util.ArrayList;

public class NumPrimos {
    public static void main(String[] args) {
        int N = 10; // Cambia este valor por el número de primos que quieras generar
        ArrayList<Integer> primes = generatePrimes(N);

        System.out.println("Los primeros " + N + " números primos son: " + primes);
    }

    public static ArrayList<Integer> generatePrimes(int N) {
        ArrayList<Integer> primes = new ArrayList<>();
        int num = 2;

        while (primes.size() < N) {
            if (isPrime(num)) {
                primes.add(num);
            }
            num++;
        }

        return primes;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
