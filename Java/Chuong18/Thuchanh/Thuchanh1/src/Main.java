public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread running ...");

        RunableDemo runableDemo1 = new RunableDemo("Thread-1-HR-Database");
        runableDemo1.start();

        RunableDemo runableDemo2 = new RunableDemo("Thread-2-Send-Email");
        runableDemo2.start();


        System.out.println("Main thread stop");
    }
}
