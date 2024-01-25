package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class preOrderTraversal {
    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        List<Integer> preOrder = new ArrayList<Integer>();
        if(root == null){
            System.out.println(preOrder);
        }
        Stack<Node> st = new Stack<Node>();
        st.push(root);
        while(!st.isEmpty()) {
            root = st.pop();
            preOrder.add(root.data);
            if(root.right != null) st.push(root.right);
            if(root.left != null) st.push(root.left);
        }
        System.out.println(preOrder);
    }
}