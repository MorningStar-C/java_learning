package day14.practise.p04;

public class Test {
    public static void main(String[] args) {
        A a = new A();
        // method 1
        InterA s1 = new InterA() {
            @Override
            public void showA() {
                // TODO Auto-generated method stub
                System.out.println("HelloWorld");
            }
        };
        a.methodA(s1);

        // method 2
        a.methodA(new InterA() {
            @Override
            public void showA() {
                // TODO Auto-generated method stub
                System.out.println("HelloWorld");
            }
        });
    }
}
