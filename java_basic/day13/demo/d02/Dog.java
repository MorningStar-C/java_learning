package day13.demo.d02;

public class Dog extends Animal{

    public Dog() {
    }

    public Dog(String color, int age) {
        super(color, age);
    }
    
    @Override
    public void eat(String something) {
        System.out.println("小狗吃" + something);
    }

    public void lookHome() {
        System.out.println("小狗看家");
    }
}
