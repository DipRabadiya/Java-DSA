package Recursion;

public class reverseInteger {
    public static void main(String[] args) {
        int num = 123456;
        reverseIntegers(num);
    }

    private static void reverseIntegers(int num) {
        if (num < 10) {
            System.out.println(num);
        }
        else {
            System.out.print(num % 10);
            reverseIntegers(num / 10);
        }
    }
}