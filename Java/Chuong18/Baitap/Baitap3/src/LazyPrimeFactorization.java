public class LazyPrimeFactorization implements Runnable{

    @Override
    public void run() {
        int n = 2;

        while (n < 500) {
            boolean check = true;
            for (int i = 2; i<n;i++) {
                if (n%i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println("Lazy " +n);
            }
            n++;

        }
    }
}
