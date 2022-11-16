package day14.demo.d01;

public class Test {
    public static void main(String[] args) {
        Manager m = new Manager("00001", "老万", 12.5);
        m.work();

        Cook c = new Cook();
        c.work();
    }
}
