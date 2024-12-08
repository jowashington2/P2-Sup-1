import java.util.StringJoiner;

/**
 * Represents a binary tree structure.
 * Provides methods to:
 * - Insert data into the tree.
 * - Serialize (dump) the tree structure as a formatted string.
 */
public class BinaryTree {
    private Node root;

    /**
     * Inserts a value into the binary tree.
     * If the root is null, the value is inserted at the root.
     * Otherwise, the value is recursively inserted into the left or right child.
     * 
     * @param data The value to insert.
     */
    public void insert(int data) {
        if (root == null) {
            root = new Node(data);
        } else {
            insertRecursively(root, data);
        }
    }

    // Recursive helper method for insertion
    private void insertRecursively(Node current, int data) {
        if (data < current.getData()) {
            if (current.getLeft() == null) {
                current.setLeft(new Node(data));
            } else {
                insertRecursively(current.getLeft(), data);
            }
        } else {
            if (current.getRight() == null) {
                current.setRight(new Node(data));
            } else {
                insertRecursively(current.getRight(), data);
            }
        }
    }

    /**
     * Dumps the binary tree as a formatted string.
     * Each node is indented according to its depth in the tree.
     * 
     * @return A string representation of the tree structure.
     */
    public String dumpTree() {
        return dumpRecursively(root, 0);
    }

    // Recursive helper method for dumping the tree
    private String dumpRecursively(Node current, int level) {
        if (current == null) {
            return "";
        }
        StringBuilder dump = new StringBuilder();
        dump.append("\t".repeat(level))
            .append("NodeID: ")
            .append(current.getNodeID())
            .append(", Data: ")
            .append(current.getData())
            .append("\n");

        dump.append(dumpRecursively(current.getLeft(), level + 1));
        dump.append(dumpRecursively(current.getRight(), level + 1));

        return dump.toString();
    }

    /**
     * Gets the root node of the binary tree.
     * 
     * @return The root node.
     */
    public Node getRoot() {
        return root;
    }
}
