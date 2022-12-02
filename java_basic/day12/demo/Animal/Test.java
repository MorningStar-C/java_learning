package day12.demo.Animal;

public class Test {
    public static void main(String[] args) {
        Cat c = new Cat("大白", 1, "白色");
        System.out.println(c.getName() + " " + c.getAge() + " " + c.getColor());

        Dog t = new Dog("大黄", 1, "黄色");
        System.out.println(t.getName() + " " + t.getAge() + " " + t.getColor());
        t.action();
    }
}
