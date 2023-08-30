import java.util.*;

public class matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num of rows: ");
        int r = sc.nextInt();
        System.out.println("Enter num of cols: ");
        int c = sc.nextInt();
        int i, j;
        int a[][] = new int[r][c];
        int b[][] = new int[r][c];
        int d[][] = new int[r][c];
        System.out.println("Enter elements of the first matrix: ");
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter elements of the second matrix: ");
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                d[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("Resultant matrix: ");
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                System.out.println(d[i][j] + "");
            }
        }
    }
}
