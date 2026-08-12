import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        metodos m = new metodos();

        boolean continuar = true;
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.println("Tamaño matriz");
        n = sc.nextInt();

        int[][] ME = new int[n][n];
        ObjMatriz[][] MO = new ObjMatriz[n][n];

        while (continuar) {
            System.out.println(
                    "1. Llenar matriz enteros, 2. mostrar matriz enteros, 3. llenar matriz obj, 4. mostar matriz eobj, 5. Salir");
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
                    System.out.println("Hasta luego");
                    continuar = false;
                    break;
            }
        }
    }

}
