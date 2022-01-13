import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        int [] a = {1,2,3,4,5};
        for (int i:a) {
            stack1.push(i);
        }

        for (int i=0;i<a.length;i++) {
            a[i] = stack1.pop();
        }

        for (int i:a) {
            System.out.println(i);
        }
    }
}
