package Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(levelOrder(root));
    }

    private static List<List<Integer>> levelOrder(Node root) {
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
        return wrapList;
    }
}
