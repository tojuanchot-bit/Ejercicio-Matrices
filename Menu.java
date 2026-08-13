import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        metodos m = new metodos();

        boolean continuar = true;
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.print("Ingrese el tamaño de la matriz: ");
        n = sc.nextInt();

        int[][] ME = new int[n][n];
        ObjMatriz[][] MO = new ObjMatriz[n][n];

        while (continuar) {

            System.out.println("\n========== MENÚ ==========");
            System.out.println("1. Llenar matriz entera");
            System.out.println("2. Mostrar matriz entera");
            System.out.println("3. Llenar matriz objetual");
            System.out.println("4. Mostrar matriz objetual");
            System.out.println("5. Mostrar diagonal principal de la matriz objetual");
            System.out.println("6. Salir");
            System.out.println("==========================");
            System.out.print("Seleccione una opción: ");

            int opt = sc.nextInt();

            switch (opt) {
                case 1:
                    ME = m.LLenarMatrizEntera(ME);
                    break;
                case 2:
                    m.MostrarMatrizEntera(ME);
                    break;
                case 3:
                    MO = m.LLenarMatrizObjetual(MO);

                    break;
                case 4:
                    m.MostrarMatrizObjetual(MO);
                    break;
                case 5:
                    m.MostrarDiagonalObjetual(MO);
                    break;

                case 6:
                    System.out.println("Hasta luego");
                    continuar = false;
                    break;

                default:
                    System.out.println("Ingrese una opción válida");
                    break;
            }
        }

        sc.close();
    }
}
