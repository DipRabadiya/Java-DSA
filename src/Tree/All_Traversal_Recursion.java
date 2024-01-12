package Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class All_Traversal_Recursion {
    public static void main(String[] args) {
        Node root = new Node(45);
        root.left = new Node(35);
        root.right = new Node(40);
        root.left.left = new Node(55);
        root.left.right = new Node(30);
        root.right.left = new Node(50);
        root.right.right = new Node(32);
        System.out.print("Preorder traversal of binary tree is= ");
        preOrderTraversal(root);
        System.out.println();
        System.out.print("Postorder traversal of binary tree is= ");
        postOrderTraversal(root);
        System.out.println();
        System.out.print("Inorder traversal of binary tree is= ");
        inOrderTraversal(root);
    }
    private static void inOrderTraversal(Node root) {  //Left-Root-Right
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.data + " ");
            inOrderTraversal(root.right);
        }
    }

    private static void postOrderTraversal(Node root) { // Left-Right-Root
        if (root != null) {
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(root.data + " ");
        }
    }

    private static void preOrderTraversal(Node root) { // Root-Left-Right
        if (root != null) {
            System.out.print(root.data + " ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }
}