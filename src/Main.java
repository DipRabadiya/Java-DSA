//class Dog{
//    public void bark(){
//        System.out.println("woof ");
//    }
//}
//class Hound extends Dog {
//    public void sniff() {
//        System.out.println("sniff ");
//    }
//    public void bark() {
//        System.out.println("bowl");
//    }
//}
//public class Main{
//    public static void main(String args[]){
//        Dog dog = new Hound();
//        dog.bark();
//    }
//}

class Shape {
    void draw() {
        System.out.println("drawing...");
    }
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("drawing rectangle...");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("drawing circle...");
    }
}

class Triangle extends Shape {
    void draw() {
        System.out.println("drawing triangle...");
    }
}

public class Main {
    public static void main(String args[]) {
        Shape s;
        s = new Rectangle();
        s.draw();
        s = new Circle();
        s.draw();
        s = new Triangle();
        s.draw();
    }
}