import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] array = new int[10];
        for (int i= 0; i<5; i++) {
            array[i]=i;
        }

        System.out.println("Nhap x: ");
        int x = scanner.nextInt();
        int index = -1;
        do {
            System.out.println("Nhap index: ");
            index = scanner.nextInt();
        } while (index<0 || index>=10);

        for (int i = index+1; i< array.length;i++) {
            array[i] = array[i-1];
        }

        array[index] = x;

        for (int m:array) {
            System.out.print(" "+m);
        }
    }
}
