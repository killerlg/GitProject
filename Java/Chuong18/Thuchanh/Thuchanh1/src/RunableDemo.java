public class RunableDemo implements Runnable {
    private Thread t;
    private final String threadName;

    RunableDemo(String name) {
        threadName = name;
        System.out.println("Creating " + threadName);
    }

    @Override
    public void run () {
        System.out.println("Running " + threadName);
        try {

        } catch (Exception e) {
            System.out.println("Thread " +threadName+ " interupted");
        }
        System.out.println("Thread " + threadName +" exiting");
    }

    public void start() {
        System.out.println("Starting " + threadName);
        if (t==null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}
