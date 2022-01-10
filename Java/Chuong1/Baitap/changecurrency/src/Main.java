import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int rate = 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("USD Input: ");
        float usd = scanner.nextFloat();
        System.out.println(usd*rate + " VND");
    }
}
