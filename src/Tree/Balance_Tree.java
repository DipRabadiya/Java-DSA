package Tree;

public class Balance_Tree {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(7);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);

        System.out.println(dfsHeight(root));
        System.out.println(isBalanced(root));
    }

    public static boolean isBalanced(Node root){
        return dfsHeight(root) != -1;
    }

    static int dfsHeight(Node root) {
        if(root == null) return 0;

        int leftHeight = dfsHeight(root.left);
        if(leftHeight == -1) return -1;
        int rightHeight = dfsHeight(root.right);
        if(rightHeight == -1) return -1;

        if(Math.abs(leftHeight - rightHeight)>1) return - 1;
        return Math.max(leftHeight,rightHeight) + 1;
    }
}