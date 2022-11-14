package day13.demo.d02;

public class Cat extends Animal {

    public Cat() {
    }

    public Cat(String color, int age) {
        super(color, age);
    }
    
    @Override
    public void eat(String something) {
        System.out.println("小猫吃" + something);
    }

    public void catchMouse() {
        System.out.println("小猫抓老鼠");
    }
}
