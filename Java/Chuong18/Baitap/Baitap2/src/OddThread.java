public class OddThread extends Thread{

    @Override
    public void run() {
        try {
            for (int i=0; i<10; i++) {
                if (i%2 ==0) {
                    System.out.println(this.hashCode() + "  " +i);
                    Thread.sleep(10);
                }
            }
        } catch (Exception e) {
            System.out.println(this.hashCode() + " Exception");
        }

        System.out.println(this.hashCode() + " End");
    }
}
