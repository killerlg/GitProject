import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Nhap m: ");
        int m = scanner.nextInt();
        System.out.println("Nhap n: ");
        int n = scanner.nextInt();
        int [][] a = new int[m][n];
        for (int i =0; i<m; i++) {
           for (int j=0;j<n;j++) {
               System.out.println("Nhap a["+i+"]["+j+"]");
               a[i][j] = scanner.nextInt();
           }
        }

        System.out.print("Nhap cot muon tinh tong: ");
        int k = scanner.nextInt();
        int sum = 0;

        for (int i=0; i<m; i++) {
            sum += a[i][k];
        }

        System.out.println("Sum: "+ sum);
    }
}
