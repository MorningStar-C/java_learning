import java.util.Scanner;
/**
 * 创建一个长度为6的整数数组，并为数组中的元素赋值。遍历数组，打印所有元素，元素之间用空格隔开
 * @version v0.1 2022-08-09
 * @author MorningStar
 */

public class ShuZu1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int LENGTH = 6;

        int[] arr = new int[LENGTH];
        for(int i = 0; i < LENGTH; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < LENGTH; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }
}
