package Function;

public class NotFoundProductException extends Throwable {
    public NotFoundProductException() {
        System.out.println("ID khong hop le!");
    }
}
