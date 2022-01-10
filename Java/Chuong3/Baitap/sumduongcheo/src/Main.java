import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = scanner.nextInt();
        int [][] a = new int[n][n];

        for (int i=0; i<n ; i++) {
            for (int j=0; j<n; j++) {
                a[i][j] =(int) (Math.random()*100);
                System.out.print(" "+a[i][j]+" ");
            }
            System.out.println();
        }

        int sum =0;
        for (int i=0; i<n; i++) {
            sum += a[i][i];
        }

        System.out.println("Sum: "+ sum);
    }
}
