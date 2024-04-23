package N_Palindroma;

import java.util.Scanner;

public class Palindroma {
    public static void main(String[] args) {
        String input = readString();
        boolean isPalindrome = isPalindrome(input);

        if (isPalindrome) {
            System.out.println("La cadena es un palíndromo.");
        } else {
            System.out.println("La cadena no es un palíndromo.");
        }
    }

    public static String readString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca una cadena de caracteres: ");
        return scanner.nextLine();
    }

    public static boolean isPalindrome(String str) {
        String cleaned = str.replaceAll("\\s", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }
}