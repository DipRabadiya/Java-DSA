package Recursion;

public class countDigit {
    public static void main(String[] args) {
        int num = 1234567;
        System.out.println(countDigits(num));
    }

    private static int countDigits(int n) {
        if(n == 0) {
            return 0;
        }
        return 1 + countDigits(n / 10);
    }
}
