package B_MayorEntero;

public class MayorEntero {
    public static void main(String[] args) {
        int maxInt = Integer.MAX_VALUE;
        short maxShort = Short.MAX_VALUE;
        char maxChar = Character.MAX_VALUE;

        System.out.println("El mayor número entero que se puede representar con un int es: " + maxInt);
        System.out.println("El mayor número entero que se puede representar con un short es: " + maxShort);
        System.out.println("El mayor número entero que se puede representar con un char es: " + (int) maxChar);
    }
}