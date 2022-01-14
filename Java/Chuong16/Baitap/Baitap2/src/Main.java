import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        readFileText("test.csv");
    }

    public static void readFileText(String sourcePath) {
        try {
            // Đọc file theo đường dẫn
            File file = new File("file/" + sourcePath);

            // Kiểm tra nếu file không tồn tại thì ném ra ngoại lệ.
            if (!file.exists()) {
                System.out.println("File source khong ton tai");
                throw new FileNotFoundException();
            }

            // Đọc từng dòng của file và tiến hành cộng tổng lại
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            String[] resultArr;
            while ((line = br.readLine()) != null) {
                System.out.println();
                resultArr = line.split(",");
                System.out.println(resultArr[2]);
            }
            br.close();

            // Hiển thị ra màn hình tổng các số nguyên trong file
        } catch (Exception e) {
            // TH file không tồn tại hoặc nội dung file có lỗi thì sẽ hiển thị thông báo lỗi.
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
    }
}
