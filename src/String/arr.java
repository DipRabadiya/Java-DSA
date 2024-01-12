package String;

public class arr {

    static int func(int m, int[] n, int[][] o) {
        int p, q;

        n[0] = n[0] * 2;
        p = n[0];
        o[0][0] -= 5;
        q = o[0][0];

        return p - m + q;
    }

    public static void main(String[] args) {
        int x, y;
        int[] z;

        x = 6;
        y = 8 * x;
        z = new int[]{y};

        System.out.printf("%d", func(x, z, new int[][]{z}));
    }
}
