import java.util.InputMismatchException;
import java.util.Scanner;

public class Tiempo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = 0;
        int months = 0;
        int days = 0;

        try {
            System.out.println("Ingrese el año (0-2025): ");
            year = scanner.nextInt();

            System.out.println("Ingrese el número de meses: ");
            months = scanner.nextInt();

            System.out.println("Ingrese el número de días: ");
            days = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Por favor, ingrese un número válido.");
            return;
        }

        short daysInYear = isLeapYear(year) ? (short) 366 : (short) 365;
        short hoursInDay = 24;
        short minutesInHour = 60;
        short secondsInMinute = 60;

        long totalSeconds = calculateSeconds(year, months, days, daysInYear, hoursInDay, minutesInHour, secondsInMinute);
        System.out.println("Total de segundos: " + totalSeconds);
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static long calculateSeconds(int years, int months, int days, short daysInYear, short hoursInDay, short minutesInHour, short secondsInMinute) {
        int totalDays = years * daysInYear + getDaysInMonth(months, isLeapYear(years)) + days;
        long totalHours = totalDays * hoursInDay;
        long totalMinutes = totalHours * minutesInHour;
        return totalMinutes * secondsInMinute;
    }

    public static int getDaysInMonth(int month, boolean isLeapYear) {
        switch (month) {
            case 2:
                return isLeapYear ? 29 : 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }
}