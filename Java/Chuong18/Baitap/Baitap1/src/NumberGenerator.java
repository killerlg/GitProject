public class NumberGenerator implements  Runnable{

    @Override
    public void run() {

        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(this.hashCode() + "Printing the count " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(this.hashCode() + "interrupted");
        }
        System.out.println(this.hashCode() + "is over");
    }
}
