import java.util.*;

class matadd {
    public static void main(String[] args) {
        int a[][] = new int[2][2];
        int b[][] = new int[2][2];
        int c[][] = new int[2][2];
        int i, j;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter A matrix values :");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter B matrix values :");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("Addition matrix is :");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}