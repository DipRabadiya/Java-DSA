public class ExampleOfException {
    public static void main(String[] args) {
        System.out.println("Started..");
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        System.out.println("We have got two numbers..");
        int result = n1/n2;
        System.out.println("Division is" + result);
        System.out.println("Terminated..");
    }
}