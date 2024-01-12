package Tree;

import java.util.*;

public class postOrderTraversal {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(7);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.left.right.left = new Node(5);
        root.left.right.right = new Node(6);
        List<Integer> postOrder = new ArrayList<Integer>();
        Stack<Node> st1 = new Stack<Node>();
        Stack<Node> st2 = new Stack<Node>();
        if(root == null) {
            System.out.println(postOrder);
        }
        st1.push(root);
        while(!st1.isEmpty()){
            root = st1.pop();
            st2.add(root);
            if(root.left != null) st1.push(root.left);
            if(root.right != null) st1.push(root.right);
        }
        while(!st2.isEmpty()){
            postOrder.add(st2.pop().data);
        }
        System.out.println(postOrder);
    }
}