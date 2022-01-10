import java.util.Scanner;

public class Main {
    private static final String[] tensNames = {
            "",
            " ten",
            " twenty",
            " thirty",
            " forty",
            " fifty",
            " sixty",
            " seventy",
            " eighty",
            " ninety"
    };
    private static final String[] numNames = {
            "",
            " one",
            " two",
            " three",
            " four",
            " five",
            " six",
            " seven",
            " eight",
            " nine",
            " ten",
            " eleven",
            " twelve",
            " thirteen",
            " fourteen",
            " fifteen",
            " sixteen",
            " seventeen",
            " eighteen",
            " nineteen"
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();
        String readingWord = "";
        if (number == 0) {
            readingWord = "zero";
        } else if (number < 20) {
            readingWord = numNames[number];
        } else if (number < 99) {
            readingWord += numNames[number%10];
            number = number/10;
            readingWord = tensNames[number] + readingWord;
        } else if (number < 999) {
            readingWord += numNames[number%10];
            number = number/10;
            readingWord = tensNames[number%10] + readingWord;
            number = number/10;
            readingWord = numNames[number] + " hundred" + readingWord;
        }

        System.out.println("Read: "+ readingWord);
    }
}
