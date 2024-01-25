package Tree;

public class countNode {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(8);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(nodeCount(root));
    }
    public static int nodeCount(Node root) {
        if(root == null) {
            return 0;
        }
        return 1 + nodeCount(root.left) + nodeCount(root.right);
    }
}