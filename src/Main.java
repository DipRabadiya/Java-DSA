public class Main {
    public static void main(String[] s) {
//        int marks1[];
        int marks1[] = new int[3];
        int marks2[]=new int[3];
        int[] marks3 = new int[3];
        int marks4[]={50, 60, 70};
        int[] marks5 = {70, 80, 90};

        System.out.print("Array marks1:\t");
        display(marks1,3);
        System.out.print("Array marks2:\t");
        display(marks2,3);
        System.out.print("Array marks3:\t");
        display(marks3 ,3);
        System.out.print("Array marks4:\t");
        display(marks4,3);
        System.out.print("Array marks5:\t");
        display(marks5,3);
    }

    static void display(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }
}