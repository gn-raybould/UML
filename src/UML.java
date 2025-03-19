public class UML {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 3);
        dog.makeSound();
        dog.walk();

        Bird bird = new Bird("Tweety", 1);
        bird.makeSound();
        bird.fly();

        Car car = new Car("Toyota", 120);
        car.drive();
        car.accelerate(20);

        Bike bike = new Bike("Yamaha", 80);
        bike.drive();
        bike.accelerate(15);
    }
}

// Abstract Class Animal
abstract class Animal {
    private String name;
    protected int age;

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void makeSound();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

// Abstract Class Mammal
abstract class Mammal extends Animal {
    public Mammal(String name) {
        super(name);
    }

    public Mammal(String name, int age) {
        super(name, age);
    }

    public abstract void walk();
}

// Class Bird
class Bird extends Animal implements Flyable {
    public Bird(String name) {
        super(name);
    }

    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Chirp");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flying.");
    }
}

// Class Dog
class Dog extends Mammal {
    public Dog(String name) {
        super(name);
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Bark");
    }

    @Override
    public void walk() {
        System.out.println(getName() + " is walking.");
    }
}

// Abstract Class Vehicle
abstract class Vehicle {
    private String brand;
    protected int speed;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public abstract void drive();

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}

// Class Car
class Car extends Vehicle implements Drivable {
    public Car(String brand) {
        super(brand);
    }

    public Car(String brand, int speed) {
        super(brand, speed);
    }

    @Override
    public void drive() {
        System.out.println(getBrand() + " is driving.");
    }

    @Override
    public void accelerate(int increment) {
        speed += increment;
        System.out.println(getBrand() + " accelerated to " + speed + " km/h.");
    }
}

// Class Bike
class Bike extends Vehicle implements Drivable {
    public Bike(String brand) {
        super(brand);
    }

    public Bike(String brand, int speed) {
        super(brand, speed);
    }

    @Override
    public void drive() {
        System.out.println(getBrand() + " is riding.");
    }

    @Override
    public void accelerate(int increment) {
        speed += increment;
        System.out.println(getBrand() + " accelerated to " + speed + " km/h.");
    }
}

// Drivable Interface
interface Drivable {
    void drive();
    void accelerate(int increment);
}

// Flyable Interface
interface Flyable {
    void fly();
}