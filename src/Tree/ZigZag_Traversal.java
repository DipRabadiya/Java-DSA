package Tree;


import java.util.*;

public class ZigZag_Traversal {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        printSpiralOrder(root);
    }
    public static void printSpiralOrder(Node root) {
        Deque<Node> dq = new LinkedList<>();
        dq.add(root);
        boolean isRev = false;
        while(!dq.isEmpty()){
            if(isRev){
                int size = dq.size();
                while(size > 0){
                    Node node = dq.removeLast();
                    System.out.print(node.data+" ");
                    if (node.right!=null) dq.addFirst(node.right);
                    if (node.left!=null) dq.addFirst(node.left);
                    size--;
                }
                System.out.println();
                isRev = !isRev;
            }else {
                int size = dq.size();
                while(size > 0){
                    Node node = dq.removeFirst();
                    System.out.print(node.data+" ");
                    if (node.left!=null) dq.addLast(node.left);
                    if (node.right!=null) dq.addLast(node.right);
                    size--;
                }
                System.out.println();
                isRev = !isRev;
            }
        }
    }
}