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
        int n=4;
        nodeCount(root,n);
    }
    public static int nodeCount(Node root, int n) {
        if (root == null) {
            return n;
        }
        if(root.data == n){
            System.out.println("data found");
        }
        int lh = nodeCount(root.left,n);
        int rh = nodeCount(root.right,n);
        return n;
    }
}