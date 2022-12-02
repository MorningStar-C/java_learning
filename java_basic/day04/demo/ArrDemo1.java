package demo;

/**
 * 数组联练习 索引
 * @version v0.1 2022-08-09
 * @author MorningStar
 */

public class ArrDemo1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int number = arr[3];
        System.out.println(arr[3]);

        arr[3] = 10;

        System.out.println("after update: " + arr[3]);
    }
}