package day15.demo.ObjectsDemo;

import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        method_01();
        method_02();
        method_03();
        method_04();

        d2_method_01();
        d2_method_02();
    }

    public static void method_04() {
        Student s1 = new Student("小明", "15");

        boolean result = Objects.nonNull(s1);

        System.out.println(result);
    }

    public static void method_03() {
        Student s1 = new Student("小红", "13");
        boolean result = Objects.isNull(s1);

        System.out.println(result);
    }

    public static void method_02() {
        Student s1 = new Student("小红", "12");
        Student s2 = new Student("小兰", "15");

        boolean result = Objects.equals(s1, s2);
        
        System.out.println(result);
    }

    public static void method_01() {
        Student s1 = new Student("小红", "12");

        String s1s = Objects.toString(s1);
        System.out.println(s1s);
    }

    public static void d2_method_02() {
        Student s1 = new Student("小红", "12");

        Student stu = Objects.requireNonNullElse(s1, new Student("Bob", "18"));

        System.out.println(stu);
    }

    public static void d2_method_01() {
        Student s1 = new Student("小红", "12");

        Student stu = Objects.requireNonNull(s1);

        System.out.println(stu);

    }
}
