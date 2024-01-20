package Tree;

import java.util.*;

public class inOrderTraversal {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        List<Integer> inOrder = new ArrayList<Integer>();
        Stack<Node> st = new Stack<Node>();
        Node node = root;
        while(true){
            if(node != null){
                st.push(node);
                node = node.left;
            } else {
                if(st.isEmpty()){
                    break;
                }
                node = st.pop();
                inOrder.add(node.data);
                node = node.right;
            }
        }
        System.out.println(inOrder);
    }
}