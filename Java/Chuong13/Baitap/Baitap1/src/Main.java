import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input string: ");
        String chuoi = scanner.nextLine();
        String chuoiMax = "";
        for (int i=0; i<chuoi.length();i++) {
            String chuoiI = String.valueOf(chuoi.charAt(i));
            int j = i+1;
            while (j<chuoi.length()) {
                if (chuoi.charAt(j) > chuoi.charAt(j-1)) {
                    chuoiI += String.valueOf(chuoi.charAt(j));
                    j++;
                } else {
                    break;
                }

            }
            if (chuoiI.length() > chuoiMax.length()) {
                chuoiMax = chuoiI;
            }
        }
        System.out.println(chuoiMax);
    }
}
