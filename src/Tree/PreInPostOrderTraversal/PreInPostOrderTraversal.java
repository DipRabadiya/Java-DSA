//package Tree.PreInPostOrderTraversal;
//
////import java.util.Stack;
//import java.util.*;
//public class PreInPostOrderTraversal {
//    public static <Pair> void main(String[] args) {
//        Node root = new Node(1);
//        root.left = new Node(2);
//        root.right = new Node(5);
//        root.left.left = new Node(3);
//        root.left.right = new Node(4);
//        root.right.left = new Node(6);
//        root.right.right = new Node(7);
//        //var num=0;
//        Stack<Pair> st = new Stack<Pair>();
//        st.push(new Pair(root, 1);
//
//        List<Integer> pre = new ArrayList<>();
//        List<Integer> in = new ArrayList<>();
//        List<Integer> post = new ArrayList<>();
//
//        if(root == null) return;
//
//        while(!st.isEmpty()) {
//            Pair it = st.pop();
//
//            if(it.num == 1) {
//                pre.add(it.data);
//                it.num++;
//                st.push(it);
//
//                if(it.node.left != null) {
//                    st.push(new Pair(it.node.left, 1));
//                }
//            } else if(it.num == 2) {
//                in.add(it.node.data);
//                it.num ++;
//                st.push(it);
//
//                if(it.node.right != null) {
//                    st.push(new Pair(it.node.right, 1));
//                }
//            } else {
//                post.add(it.node.data);
//            }
//        }
//        System.out.println(pre);
//        System.out.println(in);
//        System.out.println(post);
//    }
//
//}
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