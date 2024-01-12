package Tree;

public class Diameter_of_tree {
//                    1
//            2               3
//                        4       7
//                    5               8
//                6                       9

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(4);
        root.right.left.left = new Node(5);
        root.right.left.left.left = new Node(6);
        root.right.right = new Node(7);
        root.right.right.right = new Node(8);
        root.right.right.right.right = new Node(9);

        System.out.println(diameterOfBinary(root));
    }
    public static int diameterOfBinary(Node root) {
        int[] diameter = new int[1];
        height(root,diameter);
        return diameter[0];
    }
    public static int height(Node node, int[] diameter) {
        if(node == null) {
            return 0;
        }
        int lh = height(node.left, diameter);
        int rh = height(node.right, diameter);
        diameter[0] = Math.max(diameter[0], lh+rh);
        return 1 + Math.max(lh,rh);
    }
}
