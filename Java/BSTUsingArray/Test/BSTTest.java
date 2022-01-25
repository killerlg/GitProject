import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BSTTest {

    @Test
    void bstTest() {
        BST bst = new BST();
        bst.insert(1);
        bst.insert(2);
        bst.insert(3);
        int[] expect = new int[]{1, 0, 2, 0, 0, 0, 3};
        for (int i = 0; i < expect.length; i++) {
            assertEquals(expect[i], bst.tree[i]);
        }
        assertEquals(1, bst.tree[0]);
        assertEquals(2, bst.tree[2]);
        assertEquals(3, bst.tree[6]);
    }
}