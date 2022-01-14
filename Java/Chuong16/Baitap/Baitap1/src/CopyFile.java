import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class CopyFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // File duoc luu trong thu muc file
        System.out.println("Nhap ten file input: ");
        String source = scanner.nextLine();
        System.out.println("Nhap ten file output: ");
        String target = scanner.nextLine();
        readFileText(source, target);
    }
    public static void readFileText(String sourcePath, String targetpath) {
        try {
            // Đọc file theo đường dẫn
            File file = new File("file/" + sourcePath);

            // Kiểm tra nếu file không tồn tại thì ném ra ngoại lệ.
            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            // Đọc từng dòng của file và tiến hành cộng tổng lại
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
               writeToTarget(targetpath,line);
            }
            br.close();

            // Hiển thị ra màn hình tổng các số nguyên trong file
        } catch (Exception e) {
            // TH file không tồn tại hoặc nội dung file có lỗi thì sẽ hiển thị thông báo lỗi.
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
    }

    public static void writeToTarget(String nameFile, String text) {
        File file = new File("file/"+nameFile);
        try {
            FileWriter fw = new FileWriter(file, true);
            fw.write(text + "\n");
            fw.close();
        } catch (Exception e) {
            writeToTarget(nameFile,e.getMessage()+ "\n");
        }
    }

}
