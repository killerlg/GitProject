import java.util.ArrayList;
import java.util.List;

public class BST <T extends Comparable<T>> {

    public static final int DEFAULT_SIZE = 100;
    // Insert
    private ArrayList<T> tree ;
    public final int ROOT = 0;

    public BST() {
        tree = new ArrayList<>();
        for (int i = 0; i< DEFAULT_SIZE; i++) {
            this.tree.add(null);
        }
    }

    public BST(int n) {
        tree = new ArrayList<>();
        for (int i=0; i<n;i++) {
            this.tree.add(null);
        }
    }

//    public int getROOT() {
//        return ROOT;
//    }


    public List<T> getTree() {
        return tree;
    }


    //Insert
    public void insert(T a) {
        insertRec(a, ROOT);
    }
    public T insertRec(T a, int parentIndex) {
        int leftChildIndex = parentIndex * 2 + 1;
        int rightChildIndex = parentIndex * 2 + 2;
        //Extend array if index > current size
        extendTreeSize(parentIndex);

        if (this.tree.get(parentIndex) == null) {
            this.tree.set(parentIndex, a);
        } else if (this.tree.get(parentIndex).equals(a) ) {
            return null;
        } else if (this.tree.get(parentIndex).compareTo(a) > 0) {
            insertRec(a, leftChildIndex);
        } else if (this.tree.get(parentIndex).compareTo(a) < 0) {
            insertRec(a, rightChildIndex);
        }
        return a;
    }

    private void extendTreeSize(int parentIndex) {
        if (parentIndex > this.tree.size()-1) {
            for (int i=0; i<this.tree.size();i++) {
                this.tree.add(null);
            }
        }
    }

    //Search
    public int search(T a) {
        return searchRec(a, this.ROOT);
    }
    public int searchRec(T a, int parentIndex) {
        int leftChildIndex = parentIndex * 2 + 1;
        int rightChildIndex = parentIndex * 2 + 2;
        if (this.tree.get(parentIndex)==null) {
            return -1;
        }
        if (this.tree.get(parentIndex).equals(a)) {
            return parentIndex;
        } else if (this.tree.get(parentIndex).compareTo(a) > 0) {
            return searchRec(a, leftChildIndex);
        } else {
            return searchRec(a, rightChildIndex);
        }
    }

    //Traversal
    public void inOrder (int index, List<T> arraylist) {

        if (index > this.tree.size()-1  || this.tree.get(index) == null ) {
            return;
        }
        int leftChildIndex = index * 2 +1 ;
        int rightChildIndex = index *2 +2 ;
        inOrder(leftChildIndex,arraylist);
        arraylist.add(this.tree.get(index));
        inOrder(rightChildIndex,arraylist);
    }

    public void preOrder (int index, List<T> arraylist) {
        if (index > this.tree.size()-1 || this.tree.get(index) == null  ) {
            return;
        }
        int leftChildIndex = index * 2 +1 ;
        int rightChildIndex = index *2 +2 ;
        arraylist.add(this.tree.get(index));
        preOrder(leftChildIndex,arraylist);
        preOrder(rightChildIndex,arraylist);
    }

    public void postOrder (int index, List<T> arraylist) {
        if (index > this.tree.size()-1 || this.tree.get(index) == null  ) {
            return;
        }
        int leftChildIndex = index * 2 +1 ;
        int rightChildIndex = index *2 +2 ;

        postOrder(leftChildIndex,arraylist);
        postOrder(rightChildIndex,arraylist);
        arraylist.add(this.tree.get(index));
    }

    //Delete
    public void delete(T a) {
        int indexOfElement = search(a);
        int indexOfLeftChild = indexOfElement *2 +1;
        int indexOfRightChild = indexOfElement *2 +2;
        if (indexOfElement == -1) {
            return;
        }

        if (!hasLeftElement(indexOfElement) && !hasRightElement(indexOfElement)) {
            this.tree.set(indexOfElement,null);
        } else if (hasLeftElement(indexOfElement)) {
            int indexOfMaxLeft = search(findMaxLeftElement(indexOfLeftChild));
            if (indexOfMaxLeft == indexOfLeftChild) {
                int i = indexOfElement;
                while ( i*2 + 1 < this.tree.size()) {
                    T nextLeftElement = this.tree.get(i*2 +1 );
                    this.tree.set(i,nextLeftElement);
                    i = i*2 +1;
                    this.tree.set(i,null);
                }
                return;
            }
            this.tree.set(indexOfElement, findMaxLeftElement(indexOfLeftChild));
            this.tree.set(indexOfMaxLeft,null);
        } else {
            int indexOfMinRight = search(findMinRightElement(indexOfRightChild));
            if (indexOfMinRight == indexOfRightChild) {
                int currentIndexOfElement = indexOfElement;
                while ( currentIndexOfElement*2 + 2 < this.tree.size()) {
                    T nextRightElement = this.tree.get(currentIndexOfElement*2 +2);
                    this.tree.set(currentIndexOfElement,nextRightElement);
                    currentIndexOfElement = currentIndexOfElement*2 +2;
                    this.tree.set(currentIndexOfElement,null);
                }
                return;
            }
            this.tree.set(indexOfElement, findMinRightElement(indexOfRightChild));
            this.tree.set(indexOfMinRight,null);
        }

    }
    public boolean hasLeftElement(int index) {
        return index * 2 + 1 < this.tree.size() && this.tree.get(index * 2 + 1) != null;
    }

    public boolean hasRightElement(int index) {
        return index * 2 + 2 < this.tree.size() && this.tree.get(index * 2 + 2) != null;
    }

    public T findMaxLeftElement(int leftChildIndex) {
        if (leftChildIndex *2 +2 > this.tree.size() || this.tree.get(leftChildIndex *2 +2 ) == null) {
            return this.tree.get(leftChildIndex);
        } else {
            return findMaxLeftElement(leftChildIndex *2 +2);
        }
    }

    public T findMinRightElement(int rightChildIndex) {
        if (rightChildIndex *2 +1 > this.tree.size() || this.tree.get(rightChildIndex *2 +1) == null) {
            return this.tree.get(rightChildIndex);
        } else {
            return findMinRightElement(rightChildIndex *2 +1);
        }
    }
}
