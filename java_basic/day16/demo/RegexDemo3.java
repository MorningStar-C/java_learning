package day16.demo;

public class RegexDemo3 {
    public static void main(String[] args) {
        System.out.println("------1------");
        System.out.println("你".matches(".."));
        System.out.println("你".matches("."));
        System.out.println("你a".matches(".."));

        System.out.println("------2------");
        System.out.println("a".matches("\\d"));
        System.out.println("3".matches("\\d"));
        System.out.println("333".matches("\\d"));

        System.out.println("------3------");
        System.out.println("a".matches("\\w"));
        System.out.println("3".matches("\\w"));
        System.out.println("你".matches("\\w"));

        System.out.println("------4------");
        System.out.println("你".matches("\\W"));
        System.out.println("-------------");


        System.out.println("------1------");
        System.out.println("2442fsfsf".matches("\\w{6,}"));
        System.out.println("2442".matches("\\w{6,}"));

        System.out.println("------2------");
        System.out.println("23dF".matches("[a-zA-Z0-9]{4}"));
        System.out.println("23 F".matches("[a-zA-Z0-9]{4}"));
        System.out.println("23dF".matches("[\\w&&[^_]]{4}"));
        System.out.println("23_F".matches("[\\w&&[^_]]{4}"));
    }
}
