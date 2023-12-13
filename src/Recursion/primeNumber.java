package Recursion;

public class primeNumber {

    public static void main(String[] args) {
        int num=3;
        if(CheckPrime(2,num)==0) {
            System.out.println("It is a Prime Number.");
        }else {
            System.out.println("It is not a Prime Number.");
        }
    }

    private static int CheckPrime(int i, int num) {
        if(num==i) {
            return 0;
        }else if(num%i==0) {
            return 1;
        } else{
            return CheckPrime(i+1,num);
        }
    }
}