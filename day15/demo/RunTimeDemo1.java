package day15.demo;

import java.io.IOException;

//import java.io.IOException;

public class RunTimeDemo1 {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println(Runtime.getRuntime().maxMemory()/1024/1024);
        System.out.println(Runtime.getRuntime().totalMemory()/1024/1024);

        System.out.println(Runtime.getRuntime().freeMemory()/1024/1024);

        try {
            Runtime.getRuntime().exec("ls");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
