package Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class All_Traversal_Recursion {
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
        System.out.println();
        System.out.print("Levelorder traversal of binary tree is= ");

        //level Order
        Queue<Node> queue = new LinkedList<Node>();
        List<List<Integer>> wrapList = new LinkedList<List<Integer>>();
        if(root == null){
            System.out.print(wrapList);
        }
        queue.offer(root);
        while(!queue.isEmpty()) {
            int levelNum = queue.size();
            List<Integer> subList = new LinkedList<Integer>();
            for(int i=0;i<levelNum;i++){
                if(queue.peek().left != null){
                    queue.offer(queue.peek().left);
                }
                if(queue.peek().right != null){
                    queue.offer(queue.peek().right);
                }
                subList.add(queue.poll().data);
            }
            wrapList.add(subList);
        }
        System.out.print(wrapList);
    }
    private static void inOrderTraversal(Node root) {  //Left-Root-Right
        if (root != null) {
            // Traverse left subtree
            inOrderTraversal(root.left);
            // Visit the node
            System.out.print(root.data + " ");
            // Traverse right subtree
            inOrderTraversal(root.right);
        }
    }

    private static void postOrderTraversal(Node root) { // Left-Right-Root
        if (root != null) {
            // Traverse left subtree
            postOrderTraversal(root.left);
            // Traverse right subtree
            postOrderTraversal(root.right);
            // Visit the node
            System.out.print(root.data + " ");
        }
    }

    private static void preOrderTraversal(Node root) { // Root-Left-Right
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
