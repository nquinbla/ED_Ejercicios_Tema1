package L_CadCaracteres;

import java.util.Scanner;

public class CadCaracteres {
    public static void main(String[] args) {
        String input = readString();
        int vowelCount = countVowels(input);

        System.out.println("La cadena contiene " + vowelCount + " vocales.");
    }

    public static String readString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca una cadena de caracteres: ");
        return scanner.nextLine();
    }

    public static int countVowels(String str) {
        int count = 0;
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < str.length(); i++) {
            if (vowels.indexOf(str.charAt(i)) != -1) {
                count++;
            }
        }

        return count;
    }
}