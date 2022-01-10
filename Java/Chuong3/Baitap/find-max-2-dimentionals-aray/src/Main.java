import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap m: ");
        int m = scanner.nextInt();
        System.out.print("Nhap n: ");
        int n = scanner.nextInt();
        int [][] a = new int[m][n];
        for (int i = 0; i< m; i++) {
            for (int j = 0 ; j< n; j++) {
                System.out.println("Nhap a["+i+"]"+ "["+ j + "]:");
                a[i][j] = scanner.nextInt();
            }
        }
        int max = a[0][0];
        int x = 0;
        int y = 0;

        for (int i = 0; i< m; i++) {
            for (int j = 0 ; j< n; j++) {
                if (a[i][j] > max) {
                    x=i;
                    y=j;
                }
            }
        }

        System.out.println("Max:  x: "+x +", y: "+ y);
    }
}
