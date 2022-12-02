package day14.demo.d08;

public class Test {
    public static void main(String[] args) {
        new Swim() {
            @Override
            public void swimming() {
                System.out.println("匿名内部类游泳");
            }
        }.swimming();

        Swim s2 = new Swim() {
            @Override
            public void swimming() {
                System.out.println("Test");
            }
        };
        s2.swimming();

        goSwimming(s2);

        goSwimming(new Swim() {
            @Override
            public void swimming() {
                System.out.println("匿名内部类传参");
            }
        });

    }

    public static void goSwimming(Swim s) {
        s.swimming();
    }
}
