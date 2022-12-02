package day14.practise.p03;

public class Outer {
    public static inter method() {
        inter s1 = new inter() {
            @Override
            public void show() {
                System.out.println("HelloWorld");
            }
        };  
        return s1;
    }
}
