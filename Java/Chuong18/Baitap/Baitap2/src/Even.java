public class Even extends Thread{
    @Override
    public void run() {
        try {
            for (int i=0; i<10; i++) {
                if (i%2 !=0) {
                    System.out.println(this.hashCode() + "  " +i);
                    Thread.sleep(15);
                }
            }
        } catch (Exception e) {
            System.out.println(this.hashCode() + " Exception");
        }

        System.out.println(this.hashCode() + " End");
    }
}
