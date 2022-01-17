import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String regex = "\\([0-9]{2}\\)\\-\\([0-9]{10}\\)";
        String test = "(a8)-(22222222)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(test);
        System.out.println(matcher.matches());
    }
}
