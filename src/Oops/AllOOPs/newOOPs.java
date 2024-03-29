package Oops.AllOOPs;

class Vehicle {
    private String brand;
    // 3. Constructor (default)
    public Vehicle() {
        this.brand = "Unknown";
    }

    // 3. Constructor (parameterized)
    public Vehicle(String brand) {
        this.brand = brand;
    }

    // 6. Getter method
    public String getBrand() {
        return brand;
    }

    // 6. Setter method
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // 7. Static keyword
    public void displayInfo() {
        System.out.println("This is a Vehicle.");
    }
}

// 9. Inheritance (single)
class Car extends Vehicle {
    // 10. Super keyword
    public Car(String brand) {
        super(brand);
    }
}

// 9. Inheritance (multilevel)
class SportsCar extends Car implements Sound {
    public SportsCar(String brand) {
        super(brand);
    }

    // 11. Polymorphism (Runtime)
    @Override
    public void displayInfo() {
        System.out.println("This is a Sports Car.");
    }

    @Override
    public void makeSound() {
        System.out.println("Broom");
    }
}

// 9. Inheritance (hierarchical)
class Truck extends Vehicle {
    public Truck(String brand) {
        super(brand);
    }
}

// 9. Inheritance (multiple)
interface ElectricVehicle {
    void charge();
}

// 9. Inheritance (hybrid)
class ElectricCar extends Car implements ElectricVehicle {
    public ElectricCar(String brand) {
        super(brand);
    }

    // 12. Final keyword (method)
    @Override
    public final void displayInfo() {
        System.out.println("This is an Electric Car.");
    }

    // 12. Final keyword (variable)
    final int batteryCapacity = 100;

    // 15. Inheritance (IS-A), Aggregation (Has-A)
    Engine engine;

    public ElectricCar(String brand, Engine engine) {
        super(brand);
        this.engine = engine;
    }

    @Override
    public void charge() {
        System.out.println("charge");
    }
}

// 13. Abstraction: abstract class
abstract class Shape {
    abstract void draw();
}

// 13. Abstraction: interface
interface Sound {
    void makeSound();
}

// 15. Inheritance (Aggregation)
class Engine {
    void start() {
        System.out.println("Engine starting...");
    }
}

// 16. Enums
enum Color {
    RED, GREEN, BLUE
}

// Main class
public class newOOPs {
    public static void main(String[] args) {
        // 2. Object
        Vehicle vehicle = new Vehicle("Toyota");

        // 4. This keyword
        System.out.println("Brand: " + vehicle.getBrand());

        // 8. Encapsulation
        vehicle.setBrand("Honda");
        System.out.println("Brand after encapsulation: " + vehicle.getBrand());

        // 11. Polymorphism (Compile time)
        Vehicle car = new Car("Ford");
        Vehicle sportsCar = new SportsCar("Ferrari");

        // 14. Default method / static method in interface
        ((Sound) sportsCar).makeSound();
        SportsCar car1 = new SportsCar("Mayback");
        car1.makeSound();
//        ((SportsCar) sportsCar).makeSound();

        // 13. Abstraction: abstract class
        Shape circle = new Shape() {
            @Override
            void draw() {
                System.out.println("Drawing a circle");
            }
        };
        circle.draw();

        // 13. Abstraction: interface
        Sound cat = new Sound() {
            @Override
            public void makeSound() {
                System.out.println("Meow");
            }
        };
        cat.makeSound();

        // 15. Inheritance (Aggregation)
        Engine electricEngine = new Engine();
        ElectricCar electricCar = new ElectricCar("Tesla", electricEngine);
        electricCar.displayInfo();
        electricCar.engine.start();
        System.out.println(electricCar.batteryCapacity);

        Truck truck = new Truck("Tesla");
        System.out.println(truck.getBrand());

        // 16. Enums
        Color carColor = Color.RED;
        System.out.println("Car color: " + carColor);
    }
}