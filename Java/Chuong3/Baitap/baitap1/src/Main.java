import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,1,2,3,4};
        int length = array.length;
        System.out.println("Nhap phan tu muon xoa");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        int index = 0;
        boolean check = true;
        while (check) {
            check = false;
            for (int i =0; i<array.length;i++) {
                if (array[i] == value) {
                    index = i;
                    check = true;
                    break;
                }
            }
            if (check) {
                for (int j = index; j<length-1;j++) {
                    array[j] = array[j+1];
                }
                array[length-1] = 0;
                length--;
            }
        }

        for (int i =0; i<length; i++) {
            System.out.print(" "+array[i]);
        }
    }
}
