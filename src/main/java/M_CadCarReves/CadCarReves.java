package M_CadCarReves;

import java.util.Scanner;

public class CadCarReves {
    public static void main(String[] args) {
        String input = readString();
        String reversed = reverseString(input);

        System.out.println("La cadena invertida es: " + reversed);
    }

    public static String readString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca una cadena de caracteres: ");
        return scanner.nextLine();
    }

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
