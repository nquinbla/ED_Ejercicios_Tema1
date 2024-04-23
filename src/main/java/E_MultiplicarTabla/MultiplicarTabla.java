package E_MultiplicarTabla;

import java.util.ArrayList;

public class MultiplicarTabla {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> tables = generateMultiplicationTables(10);

        for (int i = 0; i < tables.size(); i++) {
            System.out.println("Tabla de multiplicar del número " + i + ":");
            for (int j = 0; j < tables.get(i).size(); j++) {
                System.out.println(i + " x " + j + " = " + tables.get(i).get(j));
            }
            System.out.println();
        }
    }

    public static ArrayList<ArrayList<Integer>> generateMultiplicationTables(int N) {
        ArrayList<ArrayList<Integer>> tables = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            ArrayList<Integer> table = new ArrayList<>();
            for (int j = 0; j < 10; j++) {
                table.add(i * j);
            }
            tables.add(table);
        }
        return tables;
    }
}