import java.util.ArrayList;

public class BST {

    // Insert
    public int[] tree ;
    private int root;

    public BST() {
        this.tree = new int[100];
        this.root = 0;
    }

    public BST(int n) {
        this.tree = new int[n];
        this.root = 0;
    }

    public int getRoot() {
        return root;
    }

    public void setRoot(int root) {
        this.root = root;
    }
    //Insert
    public void insert(Integer a) {
        insertRec(a, root);
    }
    public int insertRec(Integer a, int indexParent) {
        int left = indexParent * 2 + 1;
        int right = indexParent * 2 + 2;

        if (this.tree[indexParent] == a || indexParent > this.tree.length-1) {
            return -1;
        }

        if (this.tree[indexParent] == 0) {
            this.tree[indexParent] = a;
            return a;
        }
        if (a < this.tree[indexParent]) {
            insertRec(a, left);
        }
        if (a > this.tree[indexParent]) {
            insertRec(a, right);
        }
        return a;
    }
    //Search
    public int search(Integer a) {
        return searchRec(a, this.root);
    }
    public int searchRec(Integer a, int indexParent) {
        int left = indexParent * 2 + 1;
        int right = indexParent * 2 + 2;
        if (this.tree[indexParent] == 0) {
            return -1;
        }
        if (this.tree[indexParent] == a) {
            return indexParent;
        } else if (this.tree[indexParent] > a) {
            return searchRec(a, left);
        } else {
            return searchRec(a, right);
        }
    }
    //Traverser
//    public void showNode(Integer index) {
//        System.out.print(" "+this.tree[index]+" ");
//    }

    public void inOrder (int index, ArrayList<Integer> arraylist) {

        if (this.tree[index] == 0) {
            return;
        }
        int left = index * 2 +1 ;
        int right = index *2 +2 ;
        inOrder(left,arraylist);
        arraylist.add(this.tree[index]);
        inOrder(right,arraylist);
    }

    public void preOrder (int index, ArrayList<Integer> arraylist) {
        if (this.tree[index] == 0) {
            return;
        }
        int left = index * 2 +1 ;
        int right = index *2 +2 ;
        arraylist.add(this.tree[index]);
        preOrder(left,arraylist);
        preOrder(right,arraylist);
    }

    public void postOrder (int index, ArrayList<Integer> arraylist) {
        if (this.tree[index] == 0) {
            return;
        }
        int left = index * 2 +1 ;
        int right = index *2 +2 ;

        postOrder(left,arraylist);
        postOrder(right,arraylist);
        arraylist.add(this.tree[index]);
    }

}
