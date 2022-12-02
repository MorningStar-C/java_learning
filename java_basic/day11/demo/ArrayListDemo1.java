package day11.demo;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();

        array.add("hello");
        array.add("world");

        System.out.println(array.size());
        System.out.println(array);

        array.remove("hello");
        System.out.println(array.remove("ttt"));

        System.out.println(array.size());
        System.out.println(array);

        array.set(0, "test");

        System.out.println(array.size());
        System.out.println(array.get(0));
    }
}
