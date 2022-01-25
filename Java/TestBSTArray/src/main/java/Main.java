import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BST<Integer> bst = new BST<>();
        int[] array = new int[]{25, 20, 36, 10, 22, 40, 5, 12, 38, 48};
        for (int i = 0; i < array.length; i++) {
            bst.insert(array[i]);
        }
        bst.delete(36);

        for (Integer a:bst.getTree()) {
            System.out.print(" "+a);
        }
        System.out.println();

    }
}
