package day14.demo.d06;

public class Outer {
    private int a =30;

    class inner {
        private int a = 20;

        public void method() {
            int a = 10;
            System.out.println(a); // 10
            System.out.println(this.a); // 20
            System.out.println(Outer.this.a); // 30
        }
    }
}
