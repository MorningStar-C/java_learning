package demo;
/**
 * 数组常见问题：越界异常
 * @version v0.1 2022-08-09
 * @author MorningStar
 */

public class ArrDemo2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5, 5, 5};

        System.out.println(arr[1]);
        // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 8
        // at demo.ArrDemo2.main(ArrDemo2.java:13)
        // System.out.println(arr[10]);
    }
}
