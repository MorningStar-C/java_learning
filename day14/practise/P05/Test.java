package day14.practise.P05;

public class Test {
    public static void main(String[] args) {
        B b = new B(new InterB() {

            @Override
            public void showB() {
                // TODO Auto-generated method stub
                System.out.println("HelloWorld");
            }
            
        });

        b.methodB();
    }
}
