package A_Tiempo;

public class Tiempo {
    public static void main(String[] args) {
        short daysInYear = 365;
        short hoursInDay = 24;
        short minutesInHour = 60;
        short secondsInMinute = 60;

        int years = 1;
        int months = 2;
        int days = 3;

        long totalSeconds = calculateSeconds(years, months, days, daysInYear, hoursInDay, minutesInHour, secondsInMinute);
        System.out.println("Total seconds: " + totalSeconds);
    }

    public static long calculateSeconds(int years, int months, int days, short daysInYear, short hoursInDay, short minutesInHour, short secondsInMinute) {
        int totalDays = years * daysInYear + months * 30 + days;
        long totalHours = totalDays * hoursInDay;
        long totalMinutes = totalHours * minutesInHour;
        return totalMinutes * secondsInMinute;
    }

}