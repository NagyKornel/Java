import java.util.Scanner;

public class Matrix {
    static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem az oszlopok számát!");
        int oszlop = sc.nextInt();
        System.out.println("Kérem az sorok számát!");
        int sor = sc.nextInt();
        int [][] matrix = new int [oszlop][sor];

        System.out.println("Kérem az első oszlop tartalmát!");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
