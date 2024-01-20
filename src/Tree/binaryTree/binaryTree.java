package Tree.binaryTree;

public class binaryTree {
    Node root;
    public static void main(String[] args) {
        binaryTree tree = new binaryTree();
        int arr[] = { 1, 2, 3, 4, 5, 6, 7};
        tree.root = tree.insertLevelOrder(arr, 0);
        tree.inOrder(tree.root);
    }

    public Node insertLevelOrder(int[] arr, int i)
    {
        Node root = null;
        if (i < arr.length) {
            root = new Node(arr[i]);
            root.left = insertLevelOrder(arr, 2 * i + 1);
            root.right = insertLevelOrder(arr, 2 * i + 2);
        }
        return root;
    }

    public void inOrder(Node root)
    {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }
}

class Node {

    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
    }
}