package Tree.IdenticalTree;

public class Identical_Tree {
    public static void main(String[] args) {
        Node p = new Node(1);
        p.left = new Node(2);
        p.right = new Node(3);
        p.right.left = new Node(4);
        p.right.right = new Node(5);


        Node q = new Node(1);
        q.left = new Node(2);
        q.right = new Node(3);
        q.right.left = new Node(4);
        q.right.right = new Node(5);
        System.out.println(isSameTree(p,q));
    }

    private static boolean isSameTree(Node p, Node q) {
        if(p==null || q==null) {
            return (p==q);
        }
        return (p.data == q.data) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}

class Node {
    public Integer val;
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
    }
}