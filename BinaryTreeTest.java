import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for the BinaryTree class.
 */
class BinaryTreeTest {

    @Test
    void testInsertData() {
        BinaryTree tree = new BinaryTree();
        tree.insert(10);
        tree.insert(5);
        tree.insert(15);

        Node root = tree.getRoot();
        assertEquals(10, root.getData(), "Root node should have data 10.");
        assertEquals(5, root.getLeft().getData(), "Left child should have data 5.");
        assertEquals(15, root.getRight().getData(), "Right child should have data 15.");
    }

    @Test
    void testDumpTree() {
        BinaryTree tree = new BinaryTree();
        tree.insert(10);
        tree.insert(5);
        tree.insert(15);

        String expectedDump = "NodeID: 1, Data: 10\n\tNodeID: 2, Data: 5\n\tNodeID: 3, Data: 15\n";
        assertEquals(expectedDump, tree.dumpTree(), "Dumped tree structure should match the expected format.");
    }
}
