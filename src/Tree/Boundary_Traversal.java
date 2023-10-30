package Tree;

import java.util.ArrayList;

public class Boundary_Traversal {

    public static void addLeftBoundary(Node root, ArrayList<Integer> res) {
        Node cur = root.left;
        while(cur != null) {
            if(isLeaf(cur) == false) {
                res.add(cur.data);
            }
            if(cur.left != null) {
                cur = cur.left;
            } else {
                cur = cur.right;
            }
        }
    }

    public static void addRightBoundary(Node root, ArrayList<Integer> res) {
        Node cur = root.right;
        ArrayList<Integer> tmp = new ArrayList<Integer>();
        while(cur != null) {
            if(isLeaf(cur) == false) {
                tmp.add(cur.data);
            }
            if(cur.right != null) {
                cur = cur.right;
            } else {
                cur = cur.left;
            }
        }
        int i;
        for(i = tmp.size()-1; i>=0;i--){
            res.add(tmp.get(i));
        }
    }

    public static void addLeaves(Node root, ArrayList<Integer> res) {
        if(isLeaf(root)) {
            res.add(root.data);
            return;
        }
        if(root.left != null) addLeaves(root.left,res);
        if(root.right != null) addLeaves(root.right,res);
    }

    public static boolean isLeaf(Node root) {
        if(root.left != null){
            return false;
        }
        if(root.right != null){
            return false;
        }
        return true;
    }

    public static ArrayList<Integer> printBoundray(Node root){
        ArrayList<Integer> ans = new ArrayList<Integer>();
        if(isLeaf(root) == false) {
            ans.add(root.data);
        }
        addLeftBoundary(root,ans);
        addLeaves(root,ans);
        addRightBoundary(root,ans);
        return ans;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(7);
        root.left.left = new Node(3);
        root.left.left.right = new Node(4);
        root.left.left.right.left = new Node(5);
        root.left.left.right.right = new Node(6);
        root.right.right = new Node(8);
        root.right.right.left = new Node(9);
        root.right.right.left.left = new Node(10);
        root.right.right.left.right = new Node(11);

        System.out.println(printBoundray(root));
    }
}