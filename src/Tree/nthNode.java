package Tree;

public class nthNode {
    static int count =0;
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        int n=5;
        nNode(root,n);
    }
    public static void nNode(Node root,int n){
        if(root == null){
            return;
        }
        if(count<=n){
            nNode(root.left,n);
            count++;
            if(count==n){
                System.out.println(root.data);
            }
            nNode(root.right,n);
        }
    }
}