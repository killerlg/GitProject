public class Main {
    public static void main(String[] args) {
        NumberGenerator n1 = new NumberGenerator();
        NumberGenerator n2 = new NumberGenerator();

        Thread t1 = new Thread(n1);
        Thread t2 = new Thread(n2);
        t1.start();
        t2.start();
    }
}
