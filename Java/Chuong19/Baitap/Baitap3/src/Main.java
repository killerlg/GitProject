import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://dantri.com.vn/the-gioi.htm");
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
            scanner.useDelimiter("\\Z");
            String content = scanner.next();
            // remove all new line
            content = content.replaceAll("\\n+", "");
            // regex
            String regex = "<img\\s*alt=\"(.*?)\"\\s*(data-src|src)";
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(content);
            while (m.find()) {
                System.out.println(m.group(1));
            }
// close scanner
            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
