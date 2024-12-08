/**
 * Represents a node in a binary tree.
 * Each node contains:
 * - A unique node ID.
 * - An integer data field.
 * - References to left and right child nodes.
 */
public class Node {
    private static int idCounter = 1; // Static counter to generate unique IDs
    private int nodeID;
    private int data;
    private Node left;
    private Node right;

    /**
     * Constructs a new node with the specified data.
     * The node ID is automatically assigned.
     * 
     * @param data The data to store in the node.
     */
    public Node(int data) {
        this.nodeID = idCounter++;
        this.data = data;
        this.left = null;
        this.right = null;
    }

    // Getters and setters
    public int getNodeID() {
        return nodeID;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
