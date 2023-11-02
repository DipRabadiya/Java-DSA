package Tree;

public class VerticaOrderTraversal {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.left.right = new Node(5);
        root.left.left.right.right = new Node(6);
        root.left.right = new Node(10);
        root.right = new Node(3);
        root.right.left = new Node(9);
        root.right.right = new Node(10);


    }
}
