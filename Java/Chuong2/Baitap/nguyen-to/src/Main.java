import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount to display");
        int amount = scanner.nextInt();
        int count = 0;
        int number = 1;
        while (count < amount) {
            if (number >  2){
                int i = 2;
                boolean check = true;
                while (i <= Math.sqrt(number)) {
                    if (number % i == 0) {
                        check = false;
                        break;
                    }
                    i++;
                }
                if (check) {
                    System.out.print(number + " | ");
                    count++;
                }
            }
            number++;
        }
    }
}

