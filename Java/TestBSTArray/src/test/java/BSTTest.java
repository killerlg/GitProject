import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BSTTest {
    @Test
    public void testBSTInorder() {
        BST<Integer> bst = new BST<Integer>();
        int[] array = new int[]{25, 20, 10, 5, 12, 22, 36, 30, 28, 38, 40, 48};
        for (int i = 0; i < array.length; i++) {
            bst.insert(array[i]);
        }
        ArrayList<Integer> inorderExpect = new ArrayList<Integer>(Arrays.asList(5, 10, 12, 20, 22, 25, 28, 30, 36, 38, 40, 48));
        ArrayList<Integer> inorder = new ArrayList<>();
        bst.inOrder(bst.ROOT, inorder);
        for (int i = 0; i < inorderExpect.size(); i++) {
            assertEquals(inorderExpect.get(i), inorder.get(i));
        }
    }

    @Test
    public void testBSTPreorder() {
        BST<Integer> bst = new BST<Integer>();
        int[] array = new int[]{25, 20, 10, 5, 12, 22, 36, 30, 28, 40, 38, 48};
        for (int i = 0; i < array.length; i++) {
            bst.insert(array[i]);
        }
        ArrayList<Integer> preorderExpected = new ArrayList<Integer>(Arrays.asList(25,20,10,5,12,22,36,30,28,40,38,48));
        ArrayList<Integer> preorderActual = new ArrayList<>();
        bst.preOrder(bst.ROOT, preorderActual);

        for (int i = 0; i < preorderExpected.size(); i++) {
            assertEquals(preorderExpected.get(i), preorderActual.get(i));
        }
    }

    @Test
    public void testBSTPostorder() {
        BST<Integer> bst = new BST<Integer>();
        int[] array = new int[]{25, 20, 10, 5, 12, 22, 36, 30, 28, 40, 38, 48};
        for (int i = 0; i < array.length; i++) {
            bst.insert(array[i]);
        }
        ArrayList<Integer> postorderExpected = new ArrayList<Integer>(Arrays.asList(5,12,10,22,20,28,30,38,48,40,36,25));
        ArrayList<Integer> postorderActual = new ArrayList<>();
        bst.postOrder(bst.ROOT, postorderActual);

        for (int i = 0; i < postorderExpected.size(); i++) {
            assertEquals(postorderExpected.get(i), postorderActual.get(i));
        }


    }
    @Test
    public void testSearch() {
        BST<Integer> bst = new BST<Integer>();
        int[] array = new int[]{25, 20, 10, 5, 12, 22, 36, 30, 28, 40, 38, 48};
        for (int i = 0; i < array.length; i++) {
            bst.insert(array[i]);
        }

        assertEquals(3,bst.search(10));
        assertEquals(8,bst.search(12));
        assertEquals(-1,bst.search(23));
        assertEquals(-1,bst.search(27));
        assertEquals(7,bst.search(5));
        assertEquals(0,bst.search(25));
    }

    @Test
    @DisplayName("Has lef Chill but only have left element")
    public void testDelete1() {
        BST<Integer> bst = new BST<>();
        int[] array = new int[]{25, 20, 36, 10, 22, 30, 40, 5, 12, 28, 38, 48};
        for (int i = 0; i < array.length; i++) {
            bst.insert(array[i]);
        }
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(25,20,30,10,22,28,40,5,12,null,null,null,null,38,48));
        bst.delete(36);
        for (int i=0; i< expected.size();i++) {
            assertEquals(expected.get(i),bst.getTree().get(i));
        }
    }

    @Test
    //Has lef Chill and Has right element
    public void testDelete2() {
        BST<Integer> bst = new BST<>();
        int[] array = new int[]{25, 20, 36, 10, 22, 30, 40, 5, 12, 28, 38, 48};
        for (int i = 0; i < array.length; i++) {
            bst.insert(array[i]);
        }
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(25,12,36,10,22,30,40,5,null,null,null,28,null,38,48));
        bst.delete(20);
        for (int i=0; i< expected.size();i++) {
            assertEquals(expected.get(i),bst.getTree().get(i));
        }
    }

    @Test
    //Dont have left or right child
    public void testDelete3() {
        BST<Integer> bst = new BST<>();
        int[] array = new int[]{25, 20, 36, 10, 22, 30, 40, 5, 12, 28, 38, 48};
        for (int i = 0; i < array.length; i++) {
            bst.insert(array[i]);
        }
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(25,20,36,10,null,30,40,5,12,null,null,28,null,38,48));
        bst.delete(22);
        for (int i=0; i< expected.size();i++) {
            assertEquals(expected.get(i),bst.getTree().get(i));
        }
    }

    @Test
    //Dont have left or right child
    public void testDelete4() {
        BST<Integer> bst = new BST<>();
        int[] array = new int[]{25, 20, 36, 10, 22, 30, 40, 5, 12, 28, 38, 48};
        for (int i = 0; i < array.length; i++) {
            bst.insert(array[i]);
        }
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(25,20,36,10,22,30,40,5,12,null,null,28,null,null,48));
        bst.delete(38);
        for (int i=0; i< expected.size();i++) {
            assertEquals(expected.get(i),bst.getTree().get(i));
        }
    }

    @Test
    //Dont have left child, only have right child and  have left element
    public void testDelete5() {
        BST<Integer> bst = new BST<>();
        int[] array = new int[]{25, 20, 36, 10, 22, 40, 5, 12, 38, 48};
        for (int i = 0; i < array.length; i++) {
            bst.insert(array[i]);
        }
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(25,20,38,10,22,null,40,5,12,null,null,null,null,null,48));
        bst.delete(36);
        for (int i=0; i< expected.size();i++) {
            assertEquals(expected.get(i),bst.getTree().get(i));
        }
    }

    @Test
    //Dont have left child, only have right child but don't have left element
    public void testDelete6() {
        BST<Integer> bst = new BST<>();
        int[] array = new int[]{25, 20, 36, 10, 22, 40, 5, 12, 48};
        for (int i = 0; i < array.length; i++) {
            bst.insert(array[i]);
        }
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(25,20,40,10,22,null,48,5,12,null,null,null,null,null,null));
        bst.delete(36);
        for (int i=0; i< expected.size();i++) {
            assertEquals(expected.get(i),bst.getTree().get(i));
        }
    }

}

