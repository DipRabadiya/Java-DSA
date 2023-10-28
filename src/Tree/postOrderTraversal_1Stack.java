package Tree;

import java.util.*;

public class postOrderTraversal_1Stack {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(7);
        root.right.right = new Node(9);
        root.right.right.right = new Node(10);
        root.right.left = new Node(8);
        root.left.left = new Node(3);
        root.left.left.right = new Node(4);
        root.left.left.right.right = new Node(5);
        root.left.left.right.right.right = new Node(6);
        List<Integer> postOrder = new ArrayList<>();
        Stack<Node> st1 = new Stack<>();
        Node cur = root;
        while(cur != null || !st1.isEmpty()){
            if(cur != null) {
                st1.push(cur);
                cur = cur.left;
            } else {
                Node temp = st1.peek().right;
                if(temp == null) {
                    temp = st1.peek();
                    st1.pop();
                    postOrder.add(temp.data);
                    while(!st1.isEmpty() && temp == st1.pop().right) {
                        temp = st1.peek();
                        st1.pop();
                        postOrder.add(temp.data);
                    }
                } else {
                    cur = temp;
                }
            }
        }
        System.out.println(postOrder);
    }
}


//class Node {
//    public Integer val;
//    int data;
//    Node left;
//    Node right;
//
//    public Node(int data) {
//        this.data = data;
//    }
//}