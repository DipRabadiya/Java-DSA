package Tree;

public class LeetCode {
    public static void main(String[] args) {
        Node root = new Node(4);
        root.left=new Node(8);
        root.right = new Node(5);
        root.left.left = new Node(0);
        root.left.right = new Node(1);
        root.right.right = new Node(6);

        int[] result = new int[1];
        traverse(root, result);
        System.out.println(result[0]);
        }
    private static int[] traverse(Node node, int[] result) {
        if (node == null) return new int[]{0, 0};

        int[] left = traverse(node.left, result);
        int[] right = traverse(node.right, result);

        int currSum = node.data + left[0] + right[0];
        int currCount = 1 + left[1] + right[1];

        if (currSum / currCount == node.data) result[0]++;

        return new int[]{currSum, currCount};
    }
}