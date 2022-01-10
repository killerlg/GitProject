import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String chuoi = "erjhksnvtrfgrgfuhkdghksdfksdfhsdlkf";
        System.out.println("Nhap ky tu: ");
        Scanner scanner = new Scanner(System.in);
        char a = scanner.next().charAt(0);
        int count =0;
        for (int i=0; i<chuoi.length();i++) {
            if (chuoi.charAt(i) == a) {
                count++;
            }
        }

        System.out.println("Count: "+ count);
    }
}
