package day08.practise.Cat;
/**
 * Dog Cat class test
 * @version v0.1 2022-09-07
 * @author MorningStar
 */
public class Test {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.setColor("白色");
        c.setBreed("梨花猫");
        c.eat();
        c.catchMouse();

        Dog d = new Dog("黑色", "拉布拉多");
        d.eat();
        d.lookHome();
    }
}
