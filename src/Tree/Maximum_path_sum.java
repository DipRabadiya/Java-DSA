package Tree;

public class Maximum_path_sum {
    public static void main(String[] args) {
        Node root = new Node(-10);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);

        System.out.println(maxPathSum(root));
    }
    public static int maxPathSum(Node root) {
        int maxData[] = new int[1];
        maxData[0] = Integer.MIN_VALUE;
        maxPathDown(root, maxData);
        return maxData[0];
    }

    private static int maxPathDown(Node root, int[] maxData) {
        if(root == null) return 0;
        int left = Math.max(0, maxPathDown(root.left,maxData));
        int right = Math.max(0,maxPathDown(root.right, maxData));
        maxData[0] = Math.max(maxData[0],left+right+root.data);
        return Math.max(left, right) + root.data;
    }
}
