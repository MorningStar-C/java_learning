/**
 * 方法重载练习
 * 使用方法重载的思想，设计比较两个整数是否相同的方法，兼容全整数类型（byte,short,int,long）
 * @version v0.1 2022-08-10
 * @author MorningStar
 */

public class MethodTest4 {
    public static void main(String[] args) {
        System.out.println(cmp(10, 20));
        System.out.println(cmp((byte)10, (byte)20));
        System.out.println(cmp((short)10, (short)20));
        System.out.println(cmp(10L, 20L));
    }

    public static boolean cmp(int a, int b) {
        System.out.println("int");
        return a == b;
    }

    public static boolean cmp(byte a, byte b) {
        System.out.println("byte");
        return a == b;
    }

    public static boolean cmp(short a, short b) {
        System.out.println("short");
        return a == b;
    }

    public static boolean cmp(long a, long b) {
        System.out.println("long");
        return a == b;
    }
}
