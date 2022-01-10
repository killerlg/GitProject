import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = scanner.nextInt();
        int [] a = new int[n];
        for (int i=0; i<n;i++) {
            System.out.println("Nhap a[" +i + "]");
            a[i] = scanner.nextInt();
        }
        int min = a[0];
        int index =0;
        for (int i=1; i<a.length;i++) {
            if (a[i]<min) {
                min = a[i];
                index = i;
            }
        }

        System.out.println("Min: "+min+ " has index: "+ index );
    }
}
