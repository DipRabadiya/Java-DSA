package Tree.PreInPostOrderTraversal;

//import java.util.Stack;
import java.util.*;
public class PreInPostOrderTraversal {
    public static  void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        //var num=0;
        Stack<Pair> st = new Stack<>();
        st.push(new Pair(root, 1));

        List<Integer> pre = new ArrayList<>();
        List<Integer> in = new ArrayList<>();
        List<Integer> post = new ArrayList<>();

        if(root == null) return;

        while(!st.isEmpty()) {
            Pair it = st.pop();

            if(it.value == 1) {
                pre.add(it.key.data);
                it.value++;
                st.push(it);

                if(it.key.left != null) {
                    st.push(new Pair(it.key.left, 1));
                }
            } else if(it.value == 2) {
                in.add(it.key.data);
                it.value ++;
                st.push(it);

                if(it.key.right != null) {
                    st.push(new Pair(it.key.right, 1));
                }
            } else {
                post.add(it.key.data);
            }
        }
        System.out.println("PreOrder : " + pre);
        System.out.println("InOrder : " + in);
        System.out.println("PostOrder : " + post);
    }
}
class Node {
    //public Integer val;
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
    }
}
class Pair{
    Node key;
    int value;

    public Pair(Node key, int value) {
        this.key = key;
        this.value = value;
    }
}