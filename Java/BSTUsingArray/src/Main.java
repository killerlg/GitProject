import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BST bst = new BST();
        bst.insert(25);
        bst.insert(20);
        bst.insert(36);
        bst.insert(10);
        bst.insert(22);
        bst.insert(30);
        bst.insert(40);
        bst.insert(5);
        bst.insert(12);
        bst.insert(28);
        bst.insert(38);
        bst.insert(48);
        for (int i = 0; i < bst.tree.length; i++) {
            System.out.println(i + ": " + bst.tree[i]);
        }

        bst.de
        // Inorder
//        ArrayList<Integer> inorder = new ArrayList<>();
//        System.out.println("Inorder: ");
//        bst.inOrder(bst.getRoot(),inorder);
//        for (int a:inorder ) {
//            System.out.print(" "+ a +" ");
//        }
//        System.out.println();
        // Preorder
//        ArrayList<Integer> preorder = new ArrayList<>();
//        System.out.println("Preorder: ");
//        bst.preOrder(bst.getRoot(),preorder);
//        for (int a:preorder ) {
//            System.out.print(" "+ a +" ");
//        }
//        System.out.println();

        // Preorder
//        ArrayList<Integer> postorder = new ArrayList<>();
//        System.out.println("Postorder: ");
//        bst.postOrder(bst.getRoot(),postorder);
//        for (int a:postorder ) {
//            System.out.print(" "+ a +" ");
//        }
//        System.out.println();
//        //Search
//        System.out.println(bst.search(10));
    }
}
