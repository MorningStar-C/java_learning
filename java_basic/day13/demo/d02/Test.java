package day13.demo.d02;

public class Test {
    public static void main(String[] args) {
        Animal a1 = new Dog("白色", 1);
        Animal a2 = new Cat("狸花", 1);

        Person p = new Person("小明", 22);

        p.keepPet(a1, "骨头");
        p.keepPet(a2, "猫粮");
    }
}
