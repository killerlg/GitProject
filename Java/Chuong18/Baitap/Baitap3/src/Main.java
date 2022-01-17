public class Main {
    public static void main(String[] args) {
        LazyPrimeFactorization obj1 = new LazyPrimeFactorization();
        OptimizedPrimeFactorization obj2 = new OptimizedPrimeFactorization();
        Thread t1= new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    }
}
