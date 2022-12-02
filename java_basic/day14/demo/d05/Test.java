package day14.demo.d05;

public class Test {
    public static void main(String[] args) {
        Outer.Inner o = new Outer().new Inner();
        o.method();
        // System.out.println(o.getInstatce());
    }
}
