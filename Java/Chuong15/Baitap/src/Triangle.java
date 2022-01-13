import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) throws IllegalRightTriangleException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a: ");
        int a = scanner.nextInt();
        System.out.print("Input b: ");
        int b = scanner.nextInt();
        System.out.print("Input c: ");
        int c = scanner.nextInt();
        if ( a <= 0 || b<=0 || c<=0 || a+ b <= c) {
            throw new IllegalRightTriangleException("Not a triangle");
        }
    }
}
