import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number = 1;
        while (number < 100) {
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
                }
            }
            number++;
        }
    }
}

