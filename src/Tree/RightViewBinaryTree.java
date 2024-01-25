package Tree;

public class RightViewBinaryTree {
    static int maxLevel = -1;
    public static void main(String[] args) {
        Node root = new Node(20);
        root.left=new Node(22);
        root.right = new Node(8);
        root.left.left = new Node(25);
        root.left.right = new Node(3);
        root.left.right.left = new Node(14);
        root.left.right.left.right = new Node(7);
        root.left.right.right = new Node(10);
        root.right.right = new Node(5);
        rightView(root,0);
    }

    private static void rightView(Node root, int i) {
        if(root == null){
            return;
        }
        if(maxLevel<i){
            System.out.print(root.data + " ");
            maxLevel = i;
        }
        rightView(root.right, i + 1);
        rightView(root.left, i + 1);
    }
}