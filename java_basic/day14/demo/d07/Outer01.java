package day14.demo.d07;

public class Outer01 {
    private static String name = "Test";
    public static class Inner01 {
        private String name;
        public Inner01(String name) {
            this.name = name;
        }

        public void showName() {
            System.out.println(this.name);
            System.out.println(Outer01.name);
        }
    }
}
