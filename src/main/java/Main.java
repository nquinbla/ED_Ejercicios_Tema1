import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione una opción:");
        System.out.println("1. A_Tiempo");
        System.out.println("2. B_MayorEntero");
        System.out.println("3. C_SumaMúltiplos5");
        System.out.println("4. D_ListaEnterosPositivos");
        System.out.println("5. E_MultiplicarTabla");
        System.out.println("6. F_NumPrimos");
        System.out.println("7. G_FactoresPrimos");
        System.out.println("8. H_MedMinMaxDatos");
        System.out.println("9. I_VectorProdEscalar");
        System.out.println("10. J_MatrizCuadrada");
        System.out.println("11. K_MultiplicarMatrices");
        System.out.println("12. L_CadCaracteres");
        System.out.println("13. M_CadCarReves");
        System.out.println("14. N_Palindroma");

        int option = scanner.nextInt();

        switch (option) {
            case 1:
                A_Tiempo.Tiempo.main(args);
                break;
            case 2:
                B_MayorEntero.MayorEntero.main(args);
                break;
            case 3:
                C_SumaMúltiplos5.SumaMúltiplos.main(args);
                break;
            case 4:
                D_ListaEnterosPositivos.EnterosPositivos.main(args);
                break;
            case 5:
                E_MultiplicarTabla.MultiplicarTabla.main(args);
                break;
            case 6:
                F_NumPrimos.NumPrimos.main(args);
                break;
            case 7:
                G_FactoresPrimos.FactoresPrimos.main(args);
                break;
            case 8:
                H_MedMinMaxDatos.MedMinMaxDatos.main(args);
                break;
            case 9:
                I_VectorProdEscalar.ProdEscalar.main(args);
                break;
            case 10:
                J_MatrizCuadrada.MatrizCuadrada.main(args);
                break;
            case 11:
                K_MultiplicarMatrices.MultiplicarMatrices.main(args);
                break;
            case 12:
                L_CadCaracteres.CadCaracteres.main(args);
                break;
            case 13:
                M_CadCarReves.CadCarReves.main(args);
                break;
            case 14:
                N_Palindroma.Palindroma.main(args);
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }
}