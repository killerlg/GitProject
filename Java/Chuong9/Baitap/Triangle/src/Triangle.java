public class Triangle {
    public static int checkTriangle(int a, int b, int c) {
        if (a + b <= c || a + c <= b || b + c <=a) {
            return 0;
        } else if (a == b  && b == c) {
            return 1;
        } else if (a == b || a == c || b == c) {
            return 2;
        } else {
            return 3;
        }
    }
}
