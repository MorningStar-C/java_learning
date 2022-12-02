package day12.demo.Animal;

public class Dog extends Animal {
    public Dog() {

    }

    public Dog(String name, int age, String color) {
        super(name, age, color);
    }

    public void action() {
        System.out.println("叫");
    }
}
