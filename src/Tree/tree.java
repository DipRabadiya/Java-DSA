package Tree;

import java.util.*;

public class tree {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.print("Preorder traversal of binary tree is= ");
        preOrderTraversal(root);
        System.out.println();
        System.out.print("Postorder traversal of binary tree is= ");
        postOrderTraversal(root);
        System.out.println();
        System.out.print("Inorder traversal of binary tree is= ");
        inOrderTraversal(root);
    }

    private static void inOrderTraversal(Node root) {
        if (root != null) {
            // Traverse left subtree
            inOrderTraversal(root.left);
            // Visit the node
            System.out.print(root.data + " ");
            // Traverse right subtree
            inOrderTraversal(root.right);
        }
    }

    private static void postOrderTraversal(Node root) {
        if (root != null) {
            // Traverse left subtree
            postOrderTraversal(root.left);
            // Traverse right subtree
            postOrderTraversal(root.right);
            // Visit the node
            System.out.print(root.data + " ");
        }
    }

    private static void preOrderTraversal(Node root) {
        if (root != null) {
            // Visit the node
            System.out.print(root.data + " ");
            // Traverse left subtree
            preOrderTraversal(root.left);
            // Traverse right subtree
            preOrderTraversal(root.right);
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